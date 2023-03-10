// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetIntrospectionSchemaResponseBuilderOps(val self: GetIntrospectionSchemaResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GetIntrospectionSchemaResponse.Builder = {
    value.fold(self) { v =>
      self.schema(v)
    }
  }

}

final class GetIntrospectionSchemaResponseOps(val self: GetIntrospectionSchemaResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.schema)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetIntrospectionSchemaResponseOps {

  implicit def toGetIntrospectionSchemaResponseBuilderOps(
      v: GetIntrospectionSchemaResponse.Builder
  ): GetIntrospectionSchemaResponseBuilderOps = new GetIntrospectionSchemaResponseBuilderOps(v)

  implicit def toGetIntrospectionSchemaResponseOps(
      v: GetIntrospectionSchemaResponse
  ): GetIntrospectionSchemaResponseOps = new GetIntrospectionSchemaResponseOps(v)

}
