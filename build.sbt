
version in LocalRootProject := "0.1-SNAPSHOT"

lazy val commonSettings = Seq(
  organization := "pl.falcone",
  scalaVersion := "2.11.6"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala).
  settings(commonSettings: _*).
  settings(
    name := "play-playground",
    version := "0.1-SNAPSHOT"
  )
