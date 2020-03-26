import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.ClassDesc

coreSettings

val typeName = "Akka"

scalaWrapperGenBaseSettings(typeName, packageName = "akka")

val baseName = "DynamoDb"

sdkBaseName := baseName

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-akka"

libraryDependencies ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2L, scalaMajor)) if scalaMajor >= 12 =>
      Seq(
        "com.typesafe.akka" %% "akka-testkit"        % akka26Version % Test,
        "com.typesafe.akka" %% "akka-stream-testkit" % akka26Version % Test
      )
    case Some((2L, scalaMajor)) if scalaMajor == 11 =>
      Seq(
        "com.typesafe.akka" %% "akka-testkit"        % akka25Version % Test,
        "com.typesafe.akka" %% "akka-stream-testkit" % akka25Version % Test
      )
  }
}

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient"        => true
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" => true
  case _ =>
    false
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    Seq(s"${sdkBaseName.value}${typeName}Client")
  case cd if cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    Seq(s"${sdkBaseName.value}Streams${typeName}Client")
}

templateNameMapper in scalaWrapperGen := {
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}${typeName}Client" && cd.simpleTypeName == s"${sdkBaseName.value}AsyncClient" =>
    s"${sdkBaseName.value}${typeName}Client.ftl"
  case (f, cd: ClassDesc)
      if f == s"${sdkBaseName.value}Streams${typeName}Client" && cd.simpleTypeName == s"${sdkBaseName.value}StreamsAsyncClient" =>
    s"${sdkBaseName.value}Streams${typeName}Client.ftl"
  case (name, cd) => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
