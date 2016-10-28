package com.VizDiff.SampleTwitterStream

/**
  * Created by longje on 10/27/16.
  */
class Tweet(val text: String, val entities: Map[String, Any]) {
  def hasHashTag = hashTags.length > 0
  def hasURLs = urls.length > 0
  def hasPhotos = photos.length > 0
  def hasEmoji = emojis.length > 0

  lazy val hashTags: List[String] = {
    if (!entities.contains("hashtags")) List()
    else {
      entities("hashtags").asInstanceOf[List[Map[String, Any]]]
        .map(x => x("text").asInstanceOf[String])
    }
  }

  lazy val urls: List[String] = {
    if (!entities.contains("urls")) List()
    else {
      entities("urls").asInstanceOf[List[Map[String, Any]]]
        .map(x => x("expanded_url").asInstanceOf[String] )
        .filter(x => x != null)
        .map(x => new java.net.URL(x).getHost )
    }
  }

  lazy val photos: List[String] = {
    if (!entities.contains("media")) List()
    else {
      entities("media").asInstanceOf[List[Map[String, Any]]]
        .filter(x => x("type").asInstanceOf[String] == "photo")
        .map(x => x("expanded_url").asInstanceOf[String])
        .filter(x => x != null)
        .map(x => new java.net.URL(x).getHost )
    }
  }

  lazy val emojis: List[Emoji] = {
    (for {
      c <- text
      if Emoji.lookup.contains(c.toString)
    } yield Emoji.lookup(c.toString)).toList
  }

  override def toString: String = s"$hashTags, $urls, $photos"
}
