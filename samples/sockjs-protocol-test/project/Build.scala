import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "sockjs-protocol-test"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      "com.github.fdimuccio" %% "play2-sockjs" % "0.1.4"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      resolvers += "Maven2 Local" at new File(Path.userHome, ".m2/repository/snapshots").toURI.toURL.toExternalForm,
      resolvers += Resolver.sonatypeRepo("snapshots")
    )

}
