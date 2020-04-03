name := "testDaml"
version := "0.1"
scalaVersion := "2.12.0"
lazy val codeGenDependencies = Seq( "com.daml.scala" %% "codegen" % "100.13.56-snapshot.20200331.3729.0.b43b8d86" )
lazy val applicationDependencies = Seq( "com.daml.scala" %% "bindings-akka" % "100.13.56-snapshot.20200331.3729.0.b43b8d86" )
