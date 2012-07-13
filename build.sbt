organization := "com.example"

name := "SshClient"

version := "0.1"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "spray repo" at "http://repo.spray.cc"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies ++= Seq (
	"com.decodified" % "scala-ssh" % "0.6.2",
	"org.bouncycastle" % "bcprov-jdk16" % "1.46",
	"com.jcraft" % "jzlib" % "1.1.1",
	"ch.qos.logback" % "logback-classic" % "1.0.3"
)