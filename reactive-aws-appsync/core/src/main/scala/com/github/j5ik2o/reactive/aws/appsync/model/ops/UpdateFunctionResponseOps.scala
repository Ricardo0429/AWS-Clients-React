// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateFunctionResponseBuilderOps(val self: UpdateFunctionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionConfigurationAsScala(value: Option[FunctionConfiguration]): UpdateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.functionConfiguration(v)
    }
  }

}

final class UpdateFunctionResponseOps(val self: UpdateFunctionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionConfigurationAsScala: Option[FunctionConfiguration] = Option(self.functionConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionResponseOps {

  implicit def toUpdateFunctionResponseBuilderOps(v: UpdateFunctionResponse.Builder): UpdateFunctionResponseBuilderOps =
    new UpdateFunctionResponseBuilderOps(v)

  implicit def toUpdateFunctionResponseOps(v: UpdateFunctionResponse): UpdateFunctionResponseOps =
    new UpdateFunctionResponseOps(v)

}
