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
      "securesocial" %% "securesocial" % "master-SNAPSHOT",
      "se.radley" %% "play-plugins-salat" % "1.4.0"),
    routesImport += "se.radley.plugin.salat.Binders._",
    templatesImport += "org.bson.types.ObjectId")
}
