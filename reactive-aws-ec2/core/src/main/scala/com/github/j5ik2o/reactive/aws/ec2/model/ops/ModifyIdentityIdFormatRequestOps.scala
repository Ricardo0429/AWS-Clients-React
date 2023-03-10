// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyIdentityIdFormatRequestBuilderOps(val self: ModifyIdentityIdFormatRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala(value: Option[String]): ModifyIdentityIdFormatRequest.Builder = {
    value.fold(self) { v =>
      self.principalArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceAsScala(value: Option[String]): ModifyIdentityIdFormatRequest.Builder = {
    value.fold(self) { v =>
      self.resource(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def useLongIdsAsScala(value: Option[Boolean]): ModifyIdentityIdFormatRequest.Builder = {
    value.fold(self) { v =>
      self.useLongIds(v)
    }
  }

}

final class ModifyIdentityIdFormatRequestOps(val self: ModifyIdentityIdFormatRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala: Option[String] = Option(self.principalArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceAsScala: Option[String] = Option(self.resource)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def useLongIdsAsScala: Option[Boolean] = Option(self.useLongIds)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyIdentityIdFormatRequestOps {

  implicit def toModifyIdentityIdFormatRequestBuilderOps(
      v: ModifyIdentityIdFormatRequest.Builder
  ): ModifyIdentityIdFormatRequestBuilderOps = new ModifyIdentityIdFormatRequestBuilderOps(v)

  implicit def toModifyIdentityIdFormatRequestOps(v: ModifyIdentityIdFormatRequest): ModifyIdentityIdFormatRequestOps =
    new ModifyIdentityIdFormatRequestOps(v)

}
