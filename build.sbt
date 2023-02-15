lazy val `sbt-less` = project in file(".")
enablePlugins(SbtWebBase)

organization := "com.greenfossil"
description := "sbt-web less plugin"

libraryDependencies ++= Seq(
  "org.webjars.npm" % "less" % "4.1.3",
  "org.webjars.npm" % "mkdirp" % "0.5.6",
  "org.webjars.npm" % "clean-css" % "5.2.0",
  "org.webjars.npm" % "less-plugin-clean-css" % "1.5.1" intransitive(),
  "org.webjars" % "es6-promise-node" % "4.2.8",
)

scriptedLaunchOpts ++= Seq("-Dplugin.version" + version.value, "-Dsbt.log.noformat")
scriptedBufferLog := false

addSbtJsEngine("1.2.3")
addSbtWeb("1.4.4")

updateOptions := updateOptions.value.withLatestSnapshots(false)