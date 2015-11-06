lazy val root = project.in(file(".")).enablePlugins(ScalaJSPlugin)

name := "Scala.js facade for katex.js"

normalizedName := "sjs-katex"

version := "0.1"

organization := "vu.co.kaiyin"

scalaVersion := "2.11.7"


crossScalaVersions := Seq("2.10.4", "2.11.7")

scalacOptions ++= Seq("-feature")

skip in packageJSDependencies := false

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0"
)

jsDependencies in Test += RuntimeDOM

homepage := Some(url("https://github.com/kindlychung/sjs-katex"))

