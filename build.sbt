scalaVersion := "2.13.10"
version := "0.1"
name := "play-json-funtime"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.9.4",
  "org.scalatest" %% "scalatest" % "3.2.15" % Test
)
