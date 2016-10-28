package com.VizDiff.SampleTwitterStream

import scala.collection.mutable
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent
import java.util

/**
  * Created by longje on 10/27/16.
  * Maintain stats for all tweets parsed
  */

object TotalStats {
  val total = new AtomicInteger
  val start = System.nanoTime()

  //average tweets per hour/min/second
  //running time in ms
  def timeRunning: Long = (System.nanoTime() - start) / 1000000
  def tweetsPerSecond: Long = total.get.toFloat / timeRunning * 1000 toLong
  def tweetsPerMinute: Long = tweetsPerSecond * 60
  def tweetsPerHour: Long = tweetsPerMinute * 60

  //number of emoji/url/photo tweets
  val emojiTweets = new AtomicInteger
  val urlTweets = new AtomicInteger
  val photoTweets = new AtomicInteger
  val hashTweets = new AtomicInteger

  //percentage of tweets that are emoji/url/photo tweets
  def percentEmoji = emojiTweets.get / total.get
  def percentURL = urlTweets.get / total.get
  def percentPhoto = photoTweets.get / total.get
  def percentHash = hashTweets.get / total.get

  val domains = new concurrent.ConcurrentHashMap[String, AtomicInteger]
  val hashTags = new concurrent.ConcurrentHashMap[String, AtomicInteger]
  val emojis = new concurrent.ConcurrentHashMap[Emoji, AtomicInteger]

  def feedIntoMap[T](index: concurrent.ConcurrentHashMap[T, AtomicInteger])(from: mutable.Map[T, Int]): Unit = {
    for (item <- from.keys) {
      index.putIfAbsent(item, new AtomicInteger())
      index.get(item).addAndGet(from(item))
    }
  }

  //update global stats based on parsed stats
  def feed(stats: Stats): Unit = {
    //add to grand total
    total.addAndGet(stats.total)

    //update counts for domains, hashtags and emojis
    feedIntoMap(domains)(stats.domains)
    feedIntoMap(hashTags)(stats.hashTags)
    feedIntoMap(emojis)(stats.emojis)

    //increment photo,url,emoji counts
    photoTweets.addAndGet(stats.photoTweets)
    urlTweets.addAndGet(stats.urlTweets)
    emojiTweets.addAndGet(stats.emojiTweets)
    hashTweets.addAndGet(stats.hashTweets)
  }

  def takeTop5[T](tree: concurrent.ConcurrentHashMap[T, AtomicInteger]) = {
    var result = new mutable.ListBuffer[(T, Int)]()
    val it = tree.entrySet().iterator()
    while(it.hasNext) {
      val entry: util.Map.Entry[T, AtomicInteger] = it.next()
      result += Tuple2(entry.getKey, entry.getValue.get)
    }
    result.sortBy(x => x._2).reverse.take(5)
  }

  override def toString: String = {
    s"""Running Time: $timeRunning ms
    |Total Tweets Received: $total
    |Tweets per sec/minute/hour: $tweetsPerSecond/$tweetsPerMinute/$tweetsPerHour
    |Num Photo Tweets: ${photoTweets.get}
    |Num URL Tweets: ${urlTweets.get}
    |Top domains: ${takeTop5[String](domains) mkString}
    |Top hashtags: ${takeTop5[String](hashTags) mkString}
    |Top emojis: ${takeTop5[Emoji](emojis) mkString}
    |""".stripMargin
  }
}

