// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateApiKeyRequestBuilderOps(val self: UpdateApiKeyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): UpdateApiKeyRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): UpdateApiKeyRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateApiKeyRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala(value: Option[Long]): UpdateApiKeyRequest.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  }

}

final class UpdateApiKeyRequestOps(val self: UpdateApiKeyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala: Option[Long] = Option(self.expires)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApiKeyRequestOps {

  implicit def toUpdateApiKeyRequestBuilderOps(v: UpdateApiKeyRequest.Builder): UpdateApiKeyRequestBuilderOps =
    new UpdateApiKeyRequestBuilderOps(v)

  implicit def toUpdateApiKeyRequestOps(v: UpdateApiKeyRequest): UpdateApiKeyRequestOps = new UpdateApiKeyRequestOps(v)

}
