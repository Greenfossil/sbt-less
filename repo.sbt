organizationName := "Greenfossil Pte Ltd"
organizationHomepage := Some(url("https://greenfossil.com/"))

developers := List(
  Developer("greenfossil", "Greenfossil Pte Ltd", "devadmin@greenfossil.com", url("https://github.com/Greenfossil"))
)

licenses := List(
  "Apache 2" -> new URL("https://www.apache.org/licenses/LICENSE-2.0.txt")
)

// Remove all additional repository other than Maven Central from POM
pomIncludeRepository := { _ => false }

publishTo := {
  // For accounts created after Feb 2021:
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

credentials += Credentials(Path.userHome / ".sbt" / ".sonatype-credentials")

publishMavenStyle := true
