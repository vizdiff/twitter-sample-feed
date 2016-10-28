package com.VizDiff.SampleTwitterStream
/**
  * Created by longje on 10/27/16.
  */

import scala.util.parsing.json._
import java.util.concurrent.Executors

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import org.scalameter._


object TweetIn extends App {
  def parseTweet(text: String): Tweet = {
    val tweet = JSON.parseFull(text).get.asInstanceOf[Map[String, Any]]
    new Tweet(
      tweet("text").asInstanceOf[String],
      tweet("entities").asInstanceOf[Map[String, Any]]
    )
  }

  private def makeFuture(lines: collection.mutable.ListBuffer[String]): Future[Unit] = {
    Future {
      val stats = new Stats
      for (ln <- lines) {
        stats.update( parseTweet(ln) )
      }
      TotalStats.feed(stats)
    }
  }

  override def main(args: Array[String]): Unit = {
    val MAX_LINES = 60 //launch new thread for every 60 lines

    val numWorkers = sys.runtime.availableProcessors
    val pool = Executors.newFixedThreadPool(numWorkers)
    implicit val ec = ExecutionContext.fromExecutorService(pool)

    Console.print("Initializing Emoji Map...")

    Emoji.lookup.toString //initialize emojis before capturing

    //no thread version

    def runSerial = {
      val stats = new Stats
      for (ln <- io.Source.stdin.getLines) {
        if (ln.contains("text")) {
          stats.update( parseTweet(ln) )
        }
      }
    }

    def runConcurrent() = {
      var lines = collection.mutable.ListBuffer.empty[String]

      for ( ln <- io.Source.stdin.getLines ) {
        if (ln.contains("created_at"))
          lines += ln

        if (lines.length > MAX_LINES) {
          makeFuture(lines)
          lines = collection.mutable.ListBuffer.empty[String]
        }
      }
    }

    //thread to update screen with latest stats
    val thread = new Thread {
      override def run(): Unit = {
        Console.print("\033[H\033[2J") //clear screen
        Console.print(TotalStats)
        Console.flush()
        Thread.sleep(1000)
        run()
      }
    }
    //start display
    thread.start
    runConcurrent()

    //test run sample
    /*
    val timeTaken = measure {
      var lines = collection.mutable.ListBuffer.empty[String]
      var futures = collection.mutable.ListBuffer.empty[Future[Unit]]

      for ( ln <- io.Source.stdin.getLines ) {
        if (ln.contains("created_at"))
          ln +=: lines

        if (lines.length > MAX_LINES) {
          futures += makeFuture(lines)
          lines = collection.mutable.ListBuffer.empty[String]
        }
      }

      futures.foreach(x => Await.result(x, 10 second))

      //run rest serial
      val stats = new Stats
      for (ln <- lines)
        if (ln.contains("text"))
          stats.update( parseTweet(ln) )
      TotalStats.feed(stats)
    }

    println(s"time taken $timeTaken")
    */

    //run indefinitely
    thread.join
  }
}
