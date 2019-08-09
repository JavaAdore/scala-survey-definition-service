name := """scala-survey-definition-service"""
organization := "com.eltaieb.surveydefinition"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.0"



libraryDependencies ++= Seq(

  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test,
  "org.postgresql" % "postgresql" % "42.2.6",

  "com.typesafe.slick" %% "slick" % "3.3.2",
  "com.typesafe.slick" %% "slick-codegen" % "3.3.2",
  "org.slf4j" % "slf4j-nop" % "1.6.4",

  "com.typesafe.play" %% "play-slick" % "4.0.2",
  "com.typesafe.play" %% "play-slick-evolutions" % "4.0.2",

  // aspectj
  "org.aspectj" % "aspectjweaver" % "1.9.4",
  "org.aspectj" % "aspectjrt"     % "1.9.4",


  "commons-io" % "commons-io" % "2.6"

)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.eltaieb.surveydefinition.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.eltaieb.surveydefinition.binders._"
