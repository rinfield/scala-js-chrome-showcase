enablePlugins(ScalaJSPlugin, net.lullabyte.ChromeSbtPlugin)

name := "scala-js-chrome-showcase"
version := "0.0.1"
scalaVersion := "2.12.1"
scalacOptions ++= Seq("-Xlint",
                      "-Xfatal-warnings",
                      "-deprecation",
                      "-feature",
                      "-encoding",
                      "UTF-8")

libraryDependencies ++= Seq(
  "net.lullabyte" %%% "scala-js-chrome" % "0.4.0"
)

// Scala.js
persistLauncher in Compile := true

// scala-js-chrome
// disable Manifest generation
chromeGenerateManifest := (resourceDirectory in Compile).value / "manifest.json"
