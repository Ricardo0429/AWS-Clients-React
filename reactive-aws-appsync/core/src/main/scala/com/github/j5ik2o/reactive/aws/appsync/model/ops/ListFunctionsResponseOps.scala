// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListFunctionsResponseBuilderOps(val self: ListFunctionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionsAsScala(value: Option[Seq[FunctionConfiguration]]): ListFunctionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.functions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListFunctionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListFunctionsResponseOps(val self: ListFunctionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionsAsScala: Option[Seq[FunctionConfiguration]] = Option(self.functions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionsResponseOps {

  implicit def toListFunctionsResponseBuilderOps(v: ListFunctionsResponse.Builder): ListFunctionsResponseBuilderOps =
    new ListFunctionsResponseBuilderOps(v)

  implicit def toListFunctionsResponseOps(v: ListFunctionsResponse): ListFunctionsResponseOps =
    new ListFunctionsResponseOps(v)

}
