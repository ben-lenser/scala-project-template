val versions = new {
  val scala = "2.13.4"
}

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-project-template",
    organization := "org.organization",
    scalaVersion := versions.scala
  )
