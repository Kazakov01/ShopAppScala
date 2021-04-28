scalaVersion := "2.13.5"

name := "shops-data-api"

version := "1.0.0"

val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,

  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

mainClass in assembly := Some("shop.ShopApp")