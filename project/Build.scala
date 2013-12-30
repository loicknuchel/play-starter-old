import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {
  val appName = "play-starter"
  val appVersion = "1.0-SNAPSHOT"

  val main = play.Project(appName, appVersion).settings(
    resolvers ++= Seq(
      Resolver.url("sbt-plugin-snapshots", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots/"))(Resolver.ivyStylePatterns)),
    libraryDependencies ++= Seq(
      "securesocial" %% "securesocial" % "master-SNAPSHOT"))
}
