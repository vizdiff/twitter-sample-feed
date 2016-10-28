package com.VizDiff.SampleTwitterStream

import scala.util.parsing.json.JSON

/**
  * Created by longje on 10/28/16.
  */

class Emoji(val name: String, val unified: String) extends Ordered[Emoji] {
  private def convertToUnicode(codepoint: String): String = {
    val arr = codepoint.split("-").map(Integer.parseInt(_, 16)).toList.toArray
    new String(arr, 0, arr.length)
  }

  lazy val unicode = convertToUnicode(unified)

  override def toString: String = s"[$name, $unified]"
  override def compare(that: Emoji): Int = unicode.compareTo(that.unicode)
}

object Emoji {

  lazy val lookup = {
    val emoMap = collection.mutable.Map.empty[String, Emoji]

    val url = getClass.getResourceAsStream("/emoji.json")
    val lines = scala.io.Source.fromInputStream( url ).getLines.mkString
    val emojiP = JSON.parseFull(lines).get.asInstanceOf[List[Map[String, Any]]]

    emojiP.foreach(
      x => {
        val ji = new Emoji(
            (x get "name").get.asInstanceOf[String],
            (x get "unified").get.asInstanceOf[String]
          )
        emoMap.put( ji.unicode, ji )
      }
    )
    emoMap.toMap
  }
}