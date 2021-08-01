name := "sample-dependency"
organization := "com.michaelpollmeier"
scalaVersion := "2.13.6"

enablePlugins(GitVersioning)

scmInfo := Some(ScmInfo(
    url("https://github.com/mpollmeier/sample-dependency"),
    "scm:git@github.com:mpollmeier/sample-dependency.git"))
licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
developers := List(Developer("mpollmeier", "Michael Pollmeier", "michael@michaelpollmeier.com", url("https://michaelpollmeier.com")))
homepage := Some(url("https://github.com/mpollmeier/sample-dependency/"))

publishTo := sonatypePublishToBundle.value
