name := "character-builder"

scalaVersion := "2.12.4"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
