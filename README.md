Using Scala to Take in the Sample Twitter Feed
==============================================

Collects various stats based on incoming tweets to be delivered via stdin and updates the console accordingly.


To Run
------
```bash
#after cding into directory
zcat src/main/resources/sample_tweets.json.gz | sbt "run-main com.VizDiff.SampleTwitterStream.TweetIn"

#or via twurl
twurl --host stream.twitter.com /1.1/statuses/sample.json | sbt "run-main com.VizDiff.SampleTwitterStream.TweetIn"
```


Resources
---------
[Sample Endpoint](https://dev.twitter.com/docs/api/1.1/get/statuses/sample)

[Emoji Data](https://github.com/iamcal/emoji-data)

[twurl](https://github.com/twitter/twurl)
