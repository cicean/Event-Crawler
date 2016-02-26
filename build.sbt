name := "events"

version := "1.0"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Spray repository" at "http://repo.spray.io/",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "net.databinder.dispatch" % "dispatch-core_2.11" % "0.11.3",
  "org.joda" % "joda-money" % "0.11",
  "com.github.nscala-time" % "nscala-time_2.11" % "2.8.0",
  "org.mongodb" % "casbah_2.11" % "3.1.0",
  "org.json4s" % "json4s-jackson_2.11" % "3.3.0",
  "org.scalaj" % "scalaj-http_2.11" % "0.3.16",
  "org.joda" % "joda-convert" % "1.8.1",
  "com.typesafe.play" % "play-json_2.11" % "2.4.6"
)


