/**
  * Created by longje on 10/28/16.
  */

import org.scalatest.FunSuite
import com.VizDiff.SampleTwitterStream.{Tweet, TweetIn}

class TweetSuite extends FunSuite {

  test("tweet test 1 - should have photo") {
    val exampleTweet = "{\"created_at\":\"Wed Oct 26 01:19:57 +0000 2016\",\"id\":791086935058055168,\"id_str\":\"791086935058055168\",\"text\":\"RT @SonandoRoock: Quiero darle esto a varias personas. https:\\/\\/t.co\\/hDOJteW2FI\",\"source\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\\" rel=\\\"nofollow\\\"\\u003eTwitter Web Client\\u003c\\/a\\u003e\",\"truncated\":false,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":2437809648,\"id_str\":\"2437809648\",\"name\":\"Kshiruli\\u2693\\ufe0f\",\"screen_name\":\"LuuciGuzman\",\"location\":\"pinto\",\"url\":null,\"description\":\"Make it happen \\ud83d\\udc9c\\ud83d\\udc9c\\ud83c\\udf88\\/un dieciseis de diciembre del dos mil trece\\/ Eve \\u2665\\u2665 \\/\",\"protected\":false,\"verified\":false,\"followers_count\":659,\"friends_count\":345,\"listed_count\":1,\"favourites_count\":9786,\"statuses_count\":16763,\"created_at\":\"Fri Apr 11 02:28:29 +0000 2014\",\"utc_offset\":-10800,\"time_zone\":\"Buenos Aires\",\"geo_enabled\":true,\"lang\":\"es\",\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"F5ABB5\",\"profile_background_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_background_images\\/535642386399891456\\/wdRxCUh5.jpeg\",\"profile_background_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_background_images\\/535642386399891456\\/wdRxCUh5.jpeg\",\"profile_background_tile\":true,\"profile_link_color\":\"7FDBB6\",\"profile_sidebar_border_color\":\"FFFFFF\",\"profile_sidebar_fill_color\":\"95E8EC\",\"profile_text_color\":\"3C3940\",\"profile_use_background_image\":true,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/782809774681391105\\/_qI4yqLH_normal.jpg\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/782809774681391105\\/_qI4yqLH_normal.jpg\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/2437809648\\/1477286369\",\"default_profile\":false,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"retweeted_status\":{\"created_at\":\"Wed Oct 26 00:56:30 +0000 2016\",\"id\":791081033684938753,\"id_str\":\"791081033684938753\",\"text\":\"Quiero darle esto a varias personas. https:\\/\\/t.co\\/hDOJteW2FI\",\"display_text_range\":[0,36],\"source\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\/download\\/android\\\" rel=\\\"nofollow\\\"\\u003eTwitter for Android\\u003c\\/a\\u003e\",\"truncated\":false,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":3852947961,\"id_str\":\"3852947961\",\"name\":\"Sonando Rocanroles\",\"screen_name\":\"SonandoRoock\",\"location\":\"Misiones, Argentina\",\"url\":\"https:\\/\\/www.instagram.com\\/sonandoroock\\/\",\"description\":\"Frases de Rock,#ErradosPrincipios y Frases Variadas (No todo es Rock). #ConRockConfiesoQue\\nConsultas\\/Publicidad: sonandoroock@hotmail.com\",\"protected\":false,\"verified\":false,\"followers_count\":160708,\"friends_count\":167,\"listed_count\":151,\"favourites_count\":652,\"statuses_count\":3985,\"created_at\":\"Sat Oct 03 14:20:47 +0000 2015\",\"utc_offset\":-25200,\"time_zone\":\"Pacific Time (US & Canada)\",\"geo_enabled\":false,\"lang\":\"es\",\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"000000\",\"profile_background_image_url\":\"http:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_image_url_https\":\"https:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_tile\":false,\"profile_link_color\":\"9266CC\",\"profile_sidebar_border_color\":\"000000\",\"profile_sidebar_fill_color\":\"000000\",\"profile_text_color\":\"000000\",\"profile_use_background_image\":false,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/716479041608544256\\/H3scnwsf_normal.jpg\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/716479041608544256\\/H3scnwsf_normal.jpg\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/3852947961\\/1454093538\",\"default_profile\":false,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"is_quote_status\":false,\"retweet_count\":1012,\"favorite_count\":823,\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[],\"symbols\":[],\"media\":[{\"id\":791081029545197568,\"id_str\":\"791081029545197568\",\"indices\":[37,60],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/Cvp8AUqXgAAVMFc.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/Cvp8AUqXgAAVMFc.jpg\",\"url\":\"https:\\/\\/t.co\\/hDOJteW2FI\",\"display_url\":\"pic.twitter.com\\/hDOJteW2FI\",\"expanded_url\":\"https:\\/\\/twitter.com\\/SonandoRoock\\/status\\/791081033684938753\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"large\":{\"w\":640,\"h\":1136,\"resize\":\"fit\"},\"small\":{\"w\":383,\"h\":680,\"resize\":\"fit\"},\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"medium\":{\"w\":640,\"h\":1136,\"resize\":\"fit\"}}}]},\"extended_entities\":{\"media\":[{\"id\":791081029545197568,\"id_str\":\"791081029545197568\",\"indices\":[37,60],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/Cvp8AUqXgAAVMFc.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/Cvp8AUqXgAAVMFc.jpg\",\"url\":\"https:\\/\\/t.co\\/hDOJteW2FI\",\"display_url\":\"pic.twitter.com\\/hDOJteW2FI\",\"expanded_url\":\"https:\\/\\/twitter.com\\/SonandoRoock\\/status\\/791081033684938753\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"large\":{\"w\":640,\"h\":1136,\"resize\":\"fit\"},\"small\":{\"w\":383,\"h\":680,\"resize\":\"fit\"},\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"medium\":{\"w\":640,\"h\":1136,\"resize\":\"fit\"}}}]},\"favorited\":false,\"retweeted\":false,\"possibly_sensitive\":false,\"filter_level\":\"low\",\"lang\":\"es\"},\"is_quote_status\":false,\"retweet_count\":0,\"favorite_count\":0,\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[{\"screen_name\":\"SonandoRoock\",\"name\":\"Sonando Rocanroles\",\"id\":3852947961,\"id_str\":\"3852947961\",\"indices\":[3,16]}],\"symbols\":[],\"media\":[{\"id\":791081029545197568,\"id_str\":\"791081029545197568\",\"indices\":[55,78],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/Cvp8AUqXgAAVMFc.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/Cvp8AUqXgAAVMFc.jpg\",\"url\":\"https:\\/\\/t.co\\/hDOJteW2FI\",\"display_url\":\"pic.twitter.com\\/hDOJteW2FI\",\"expanded_url\":\"https:\\/\\/twitter.com\\/SonandoRoock\\/status\\/791081033684938753\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"large\":{\"w\":640,\"h\":1136,\"resize\":\"fit\"},\"small\":{\"w\":383,\"h\":680,\"resize\":\"fit\"},\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"medium\":{\"w\":640,\"h\":1136,\"resize\":\"fit\"}},\"source_status_id\":791081033684938753,\"source_status_id_str\":\"791081033684938753\",\"source_user_id\":3852947961,\"source_user_id_str\":\"3852947961\"}]},\"extended_entities\":{\"media\":[{\"id\":791081029545197568,\"id_str\":\"791081029545197568\",\"indices\":[55,78],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/Cvp8AUqXgAAVMFc.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/Cvp8AUqXgAAVMFc.jpg\",\"url\":\"https:\\/\\/t.co\\/hDOJteW2FI\",\"display_url\":\"pic.twitter.com\\/hDOJteW2FI\",\"expanded_url\":\"https:\\/\\/twitter.com\\/SonandoRoock\\/status\\/791081033684938753\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"large\":{\"w\":640,\"h\":1136,\"resize\":\"fit\"},\"small\":{\"w\":383,\"h\":680,\"resize\":\"fit\"},\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"medium\":{\"w\":640,\"h\":1136,\"resize\":\"fit\"}},\"source_status_id\":791081033684938753,\"source_status_id_str\":\"791081033684938753\",\"source_user_id\":3852947961,\"source_user_id_str\":\"3852947961\"}]},\"favorited\":false,\"retweeted\":false,\"possibly_sensitive\":false,\"filter_level\":\"low\",\"lang\":\"es\",\"timestamp_ms\":\"1477444797659\"}"
    val tweet = TweetIn.parseTweet(exampleTweet)

    assert(tweet.hasPhotos) //https://twitter.com/SonandoRoock/status/791081033684938753/photo/1
    assert(!tweet.hasHashTag) //none
    assert(!tweet.hasURLs) //none
    assert(!tweet.hasEmoji) //none
  }

  test("tweet test 2 - should have photo and hashtag") {
    val exampleTweet = "{\"created_at\":\"Wed Oct 26 01:19:57 +0000 2016\",\"id\":791086935074861057,\"id_str\":\"791086935074861057\",\"text\":\"RT @cavs: A Ring Fit for a King. \\n#CavsOpener || #WonForAll https:\\/\\/t.co\\/GsB3R7mAZx\",\"source\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\/download\\/iphone\\\" rel=\\\"nofollow\\\"\\u003eTwitter for iPhone\\u003c\\/a\\u003e\",\"truncated\":false,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":2745601779,\"id_str\":\"2745601779\",\"name\":\"Nay\",\"screen_name\":\"NayTheTurtle\",\"location\":null,\"url\":null,\"description\":\"hehehe\",\"protected\":false,\"verified\":false,\"followers_count\":343,\"friends_count\":47,\"listed_count\":7,\"favourites_count\":3538,\"statuses_count\":9979,\"created_at\":\"Sun Aug 17 19:24:14 +0000 2014\",\"utc_offset\":-25200,\"time_zone\":\"Pacific Time (US & Canada)\",\"geo_enabled\":true,\"lang\":\"en\",\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"022330\",\"profile_background_image_url\":\"http:\\/\\/abs.twimg.com\\/images\\/themes\\/theme15\\/bg.png\",\"profile_background_image_url_https\":\"https:\\/\\/abs.twimg.com\\/images\\/themes\\/theme15\\/bg.png\",\"profile_background_tile\":false,\"profile_link_color\":\"0084B4\",\"profile_sidebar_border_color\":\"A8C7F7\",\"profile_sidebar_fill_color\":\"C0DFEC\",\"profile_text_color\":\"333333\",\"profile_use_background_image\":true,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/772035414056177664\\/Q5s-2Ft1_normal.jpg\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/772035414056177664\\/Q5s-2Ft1_normal.jpg\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/2745601779\\/1475356718\",\"default_profile\":false,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"retweeted_status\":{\"created_at\":\"Tue Oct 25 23:19:54 +0000 2016\",\"id\":791056721267466240,\"id_str\":\"791056721267466240\",\"text\":\"A Ring Fit for a King. \\n#CavsOpener || #WonForAll https:\\/\\/t.co\\/GsB3R7mAZx\",\"display_text_range\":[0,49],\"source\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\/download\\/iphone\\\" rel=\\\"nofollow\\\"\\u003eTwitter for iPhone\\u003c\\/a\\u003e\",\"truncated\":false,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":19263978,\"id_str\":\"19263978\",\"name\":\"Cleveland Cavaliers\",\"screen_name\":\"cavs\",\"location\":\"The Q | Cleveland, OH\",\"url\":\"http:\\/\\/www.cavs.com\",\"description\":\"Official Twitter of the 2016 NBA Champion Cleveland Cavaliers. Download our 2016-17 schedule here: http:\\/\\/bit.ly\\/2b9BZ4y\",\"protected\":false,\"verified\":true,\"followers_count\":1545373,\"friends_count\":1776,\"listed_count\":6898,\"favourites_count\":8775,\"statuses_count\":28114,\"created_at\":\"Tue Jan 20 23:15:20 +0000 2009\",\"utc_offset\":-14400,\"time_zone\":\"Eastern Time (US & Canada)\",\"geo_enabled\":true,\"lang\":\"en\",\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"000F25\",\"profile_background_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_background_images\\/570704634931470336\\/LqA8NxvZ.png\",\"profile_background_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_background_images\\/570704634931470336\\/LqA8NxvZ.png\",\"profile_background_tile\":false,\"profile_link_color\":\"860038\",\"profile_sidebar_border_color\":\"FFFFFF\",\"profile_sidebar_fill_color\":\"FDBC31\",\"profile_text_color\":\"000000\",\"profile_use_background_image\":true,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/785489558121091074\\/vF5ijp9v_normal.jpg\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/785489558121091074\\/vF5ijp9v_normal.jpg\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/19263978\\/1472658916\",\"default_profile\":false,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null},\"geo\":null,\"coordinates\":null,\"place\":{\"id\":\"07d9d230d6c88003\",\"url\":\"https:\\/\\/api.twitter.com\\/1.1\\/geo\\/id\\/07d9d230d6c88003.json\",\"place_type\":\"poi\",\"name\":\"Quicken Loans Arena\",\"full_name\":\"Quicken Loans Arena\",\"country_code\":\"US\",\"country\":\"United States\",\"bounding_box\":{\"type\":\"Polygon\",\"coordinates\":[[[-81.688199,41.496557],[-81.688199,41.496557],[-81.688199,41.496557],[-81.688199,41.496557]]]},\"attributes\":{}},\"contributors\":null,\"is_quote_status\":false,\"retweet_count\":6289,\"favorite_count\":6720,\"entities\":{\"hashtags\":[{\"text\":\"CavsOpener\",\"indices\":[24,35]},{\"text\":\"WonForAll\",\"indices\":[39,49]}],\"urls\":[],\"user_mentions\":[],\"symbols\":[],\"media\":[{\"id\":791056674828214273,\"id_str\":\"791056674828214273\",\"indices\":[50,73],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/Cvpl2sRWYAEGJba.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/Cvpl2sRWYAEGJba.jpg\",\"url\":\"https:\\/\\/t.co\\/GsB3R7mAZx\",\"display_url\":\"pic.twitter.com\\/GsB3R7mAZx\",\"expanded_url\":\"https:\\/\\/twitter.com\\/cavs\\/status\\/791056721267466240\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"medium\":{\"w\":768,\"h\":1024,\"resize\":\"fit\"},\"large\":{\"w\":768,\"h\":1024,\"resize\":\"fit\"},\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"small\":{\"w\":510,\"h\":680,\"resize\":\"fit\"}}}]},\"extended_entities\":{\"media\":[{\"id\":791056674828214273,\"id_str\":\"791056674828214273\",\"indices\":[50,73],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/Cvpl2sRWYAEGJba.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/Cvpl2sRWYAEGJba.jpg\",\"url\":\"https:\\/\\/t.co\\/GsB3R7mAZx\",\"display_url\":\"pic.twitter.com\\/GsB3R7mAZx\",\"expanded_url\":\"https:\\/\\/twitter.com\\/cavs\\/status\\/791056721267466240\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"medium\":{\"w\":768,\"h\":1024,\"resize\":\"fit\"},\"large\":{\"w\":768,\"h\":1024,\"resize\":\"fit\"},\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"small\":{\"w\":510,\"h\":680,\"resize\":\"fit\"}}}]},\"favorited\":false,\"retweeted\":false,\"possibly_sensitive\":false,\"filter_level\":\"low\",\"lang\":\"en\"},\"is_quote_status\":false,\"retweet_count\":0,\"favorite_count\":0,\"entities\":{\"hashtags\":[{\"text\":\"CavsOpener\",\"indices\":[34,45]},{\"text\":\"WonForAll\",\"indices\":[49,59]}],\"urls\":[],\"user_mentions\":[{\"screen_name\":\"cavs\",\"name\":\"Cleveland Cavaliers\",\"id\":19263978,\"id_str\":\"19263978\",\"indices\":[3,8]}],\"symbols\":[],\"media\":[{\"id\":791056674828214273,\"id_str\":\"791056674828214273\",\"indices\":[60,83],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/Cvpl2sRWYAEGJba.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/Cvpl2sRWYAEGJba.jpg\",\"url\":\"https:\\/\\/t.co\\/GsB3R7mAZx\",\"display_url\":\"pic.twitter.com\\/GsB3R7mAZx\",\"expanded_url\":\"https:\\/\\/twitter.com\\/cavs\\/status\\/791056721267466240\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"medium\":{\"w\":768,\"h\":1024,\"resize\":\"fit\"},\"large\":{\"w\":768,\"h\":1024,\"resize\":\"fit\"},\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"small\":{\"w\":510,\"h\":680,\"resize\":\"fit\"}},\"source_status_id\":791056721267466240,\"source_status_id_str\":\"791056721267466240\",\"source_user_id\":19263978,\"source_user_id_str\":\"19263978\"}]},\"extended_entities\":{\"media\":[{\"id\":791056674828214273,\"id_str\":\"791056674828214273\",\"indices\":[60,83],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/Cvpl2sRWYAEGJba.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/Cvpl2sRWYAEGJba.jpg\",\"url\":\"https:\\/\\/t.co\\/GsB3R7mAZx\",\"display_url\":\"pic.twitter.com\\/GsB3R7mAZx\",\"expanded_url\":\"https:\\/\\/twitter.com\\/cavs\\/status\\/791056721267466240\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"medium\":{\"w\":768,\"h\":1024,\"resize\":\"fit\"},\"large\":{\"w\":768,\"h\":1024,\"resize\":\"fit\"},\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"small\":{\"w\":510,\"h\":680,\"resize\":\"fit\"}},\"source_status_id\":791056721267466240,\"source_status_id_str\":\"791056721267466240\",\"source_user_id\":19263978,\"source_user_id_str\":\"19263978\"}]},\"favorited\":false,\"retweeted\":false,\"possibly_sensitive\":false,\"filter_level\":\"low\",\"lang\":\"en\",\"timestamp_ms\":\"1477444797663\"}"
    val tweet = TweetIn.parseTweet(exampleTweet)

    assert(tweet.hasPhotos) //https://twitter.com/cavs/status/791056721267466240/photo/1
    assert(tweet.hasHashTag) //CavsOpener and WonForAll
    assert(!tweet.hasURLs) //none
    assert(!tweet.hasEmoji) //none
  }

  test("tweet test 3 - should have url") {
    val exampleTweet = "{\"created_at\":\"Wed Oct 26 01:19:57 +0000 2016\",\"id\":791086935074672640,\"id_str\":\"791086935074672640\",\"text\":\"\\u300e2016\\u5e7410\\u670825\\u65e5\\u306e\\u3064\\u3076\\u3084\\u304d\\u300f\\u30de\\u30a4\\u30af\\u30ed\\uff5chttps:\\/\\/t.co\\/7wmxMnxk37\",\"source\":\"\\u003ca href=\\\"http:\\/\\/blog.seesaa.jp\\/\\\" rel=\\\"nofollow\\\"\\u003eSeesaaBlog\\u003c\\/a\\u003e\",\"truncated\":false,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":236587502,\"id_str\":\"236587502\",\"name\":\"fkh0111\",\"screen_name\":\"fkh0111\",\"location\":\"kagoshima\",\"url\":\"http:\\/\\/fkh0111.seesaa.net\\/\",\"description\":\"\\u5409\\u7965\\u4e03\\u798f\\u795e\\r\\n\\r\\n\\u91d1\\u7b94\\u306e\\u672c\\u5834\\u91d1\\u6ca2\\u306e\\u8077\\u4eba\\u6280\\u91d1\\u7b94\\u5de5\\u82b8\\u54c1\\u672c\\u7269\\u306e\\u91d1\\u306e\\u8f1d\\u304d\\u3067\\u904b\\u6c17\\u30a2\\u30c3\\u30d7\\u2191\\u2191\\u2605\\u9001\\u6599\\u7121\\u6599\\u2605\\u5409\\u7965\\u4e03\\u798f\\u795e\",\"protected\":false,\"verified\":false,\"followers_count\":717,\"friends_count\":1703,\"listed_count\":4,\"favourites_count\":0,\"statuses_count\":134333,\"created_at\":\"Mon Jan 10 23:02:41 +0000 2011\",\"utc_offset\":null,\"time_zone\":null,\"geo_enabled\":false,\"lang\":\"ja\",\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"C0DEED\",\"profile_background_image_url\":\"http:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_image_url_https\":\"https:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_tile\":false,\"profile_link_color\":\"0084B4\",\"profile_sidebar_border_color\":\"C0DEED\",\"profile_sidebar_fill_color\":\"DDEEF6\",\"profile_text_color\":\"333333\",\"profile_use_background_image\":true,\"profile_image_url\":\"http:\\/\\/abs.twimg.com\\/sticky\\/default_profile_images\\/default_profile_4_normal.png\",\"profile_image_url_https\":\"https:\\/\\/abs.twimg.com\\/sticky\\/default_profile_images\\/default_profile_4_normal.png\",\"default_profile\":true,\"default_profile_image\":true,\"following\":null,\"follow_request_sent\":null,\"notifications\":null},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"is_quote_status\":false,\"retweet_count\":0,\"favorite_count\":0,\"entities\":{\"hashtags\":[],\"urls\":[{\"url\":\"https:\\/\\/t.co\\/7wmxMnxk37\",\"expanded_url\":\"http:\\/\\/fsb03.seesaa.net\\/article\\/443133482.html\",\"display_url\":\"fsb03.seesaa.net\\/article\\/443133\\u2026\",\"indices\":[23,46]}],\"user_mentions\":[],\"symbols\":[]},\"favorited\":false,\"retweeted\":false,\"possibly_sensitive\":false,\"filter_level\":\"low\",\"lang\":\"ja\",\"timestamp_ms\":\"1477444797663\"}"
    val tweet = TweetIn.parseTweet(exampleTweet)

    assert(!tweet.hasPhotos) //none
    assert(!tweet.hasHashTag) //none
    assert(tweet.hasURLs) //http://fsb03.seesaa.net/article/443133482.html
    assert(!tweet.hasEmoji) //none
  }

  test("tweet test 4 - should have emoji") {
    val exampleTweet = "{\"created_at\":\"Wed Oct 26 01:23:13 +0000 2016\",\"id\":791087757145899008,\"id_str\":\"791087757145899008\",\"text\":\"23:23 \\u2665\",\"source\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\/download\\/android\\\" rel=\\\"nofollow\\\"\\u003eTwitter for Android\\u003c\\/a\\u003e\",\"truncated\":false,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":726079155104829440,\"id_str\":\"726079155104829440\",\"name\":\"Bombom \\u2665\",\"screen_name\":\"MyhPaula1\",\"location\":null,\"url\":null,\"description\":\"\\u264eLibriana ..\\nFlamenguista Sim..\\u2764\\n|De mil amores, o pr\\u00f3prio!.\\ud83d\\udc8b\\ud83d\\udc84\",\"protected\":false,\"verified\":false,\"followers_count\":207,\"friends_count\":94,\"listed_count\":1,\"favourites_count\":1172,\"statuses_count\":9333,\"created_at\":\"Fri Apr 29 16:02:15 +0000 2016\",\"utc_offset\":null,\"time_zone\":null,\"geo_enabled\":false,\"lang\":\"pt\",\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"F5F8FA\",\"profile_background_image_url\":\"\",\"profile_background_image_url_https\":\"\",\"profile_background_tile\":false,\"profile_link_color\":\"2B7BB9\",\"profile_sidebar_border_color\":\"C0DEED\",\"profile_sidebar_fill_color\":\"DDEEF6\",\"profile_text_color\":\"333333\",\"profile_use_background_image\":true,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/791008060143796224\\/iMLllZuC_normal.jpg\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/791008060143796224\\/iMLllZuC_normal.jpg\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/726079155104829440\\/1477426314\",\"default_profile\":true,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"is_quote_status\":false,\"retweet_count\":0,\"favorite_count\":0,\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[],\"symbols\":[]},\"favorited\":false,\"retweeted\":false,\"filter_level\":\"low\",\"lang\":\"und\",\"timestamp_ms\":\"1477444993660\"}"
    val tweet = TweetIn.parseTweet(exampleTweet)

    assert(!tweet.hasPhotos) //none
    assert(!tweet.hasHashTag) //none
    assert(!tweet.hasURLs) //none
    assert(tweet.hasEmoji) //black heart
  }


}
