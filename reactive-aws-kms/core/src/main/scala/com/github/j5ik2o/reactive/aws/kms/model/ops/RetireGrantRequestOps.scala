// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class RetireGrantRequestBuilderOps(val self: RetireGrantRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokenAsScala(value: Option[String]): RetireGrantRequest.Builder = {
    value.fold(self) { v =>
      self.grantToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): RetireGrantRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantIdAsScala(value: Option[String]): RetireGrantRequest.Builder = {
    value.fold(self) { v =>
      self.grantId(v)
    }
  }

}

final class RetireGrantRequestOps(val self: RetireGrantRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokenAsScala: Option[String] = Option(self.grantToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantIdAsScala: Option[String] = Option(self.grantId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRetireGrantRequestOps {

  implicit def toRetireGrantRequestBuilderOps(v: RetireGrantRequest.Builder): RetireGrantRequestBuilderOps =
    new RetireGrantRequestBuilderOps(v)

  implicit def toRetireGrantRequestOps(v: RetireGrantRequest): RetireGrantRequestOps = new RetireGrantRequestOps(v)

}
