package com.VizDiff.SampleTwitterStream

/**
  * Created by longje on 10/27/16.
  */

import scala.collection.mutable

//single stats entry to be dumped into global stats
class Stats {
  var total = 0

  //number of emoji/url/photo tweets
  var emojiTweets = 0
  var urlTweets = 0
  var photoTweets = 0
  var hashTweets = 0

  val domains = mutable.Map.empty[String, Int].withDefaultValue(0)
  val hashTags = mutable.Map.empty[String, Int].withDefaultValue(0)
  val emojis = mutable.Map.empty[Emoji, Int].withDefaultValue(0)

  private def dumpIntoMap[T](index: mutable.Map[T, Int])(lst: List[T]): Unit = {
    for (item <- lst) {
      index(item) += 1
    }
  }

  private def feedDomains(lst: List[String]): Unit = dumpIntoMap(domains)(lst)
  private def feedHashTags(lst: List[String]): Unit = dumpIntoMap(hashTags)(lst)
  private def feedEmojis(lst: List[Emoji]): Unit = dumpIntoMap(emojis)(lst)

  def update(tweet: Tweet): Unit = {
    total += 1

    feedDomains(tweet.urls)
    feedDomains(tweet.photos)
    feedHashTags(tweet.hashTags)
    feedEmojis(tweet.emojis)

    if (tweet.hasPhotos) photoTweets += 1
    if (tweet.hasURLs) urlTweets += 1
    if (tweet.hasEmoji) emojiTweets += 1
    if (tweet.hasHashTag) hashTweets += 1
  }
}
