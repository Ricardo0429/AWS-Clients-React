// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PublicAccessBlockConfigurationBuilderOps(val self: PublicAccessBlockConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockPublicAclsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.blockPublicAcls(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ignorePublicAclsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.ignorePublicAcls(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockPublicPolicyAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.blockPublicPolicy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restrictPublicBucketsAsScala(value: Option[Boolean]): PublicAccessBlockConfiguration.Builder = {
    value.fold(self) { v =>
      self.restrictPublicBuckets(v)
    }
  }

}

final class PublicAccessBlockConfigurationOps(val self: PublicAccessBlockConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockPublicAclsAsScala: Option[Boolean] = Option(self.blockPublicAcls)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ignorePublicAclsAsScala: Option[Boolean] = Option(self.ignorePublicAcls)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockPublicPolicyAsScala: Option[Boolean] = Option(self.blockPublicPolicy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def restrictPublicBucketsAsScala: Option[Boolean] = Option(self.restrictPublicBuckets)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublicAccessBlockConfigurationOps {

  implicit def toPublicAccessBlockConfigurationBuilderOps(
      v: PublicAccessBlockConfiguration.Builder
  ): PublicAccessBlockConfigurationBuilderOps = new PublicAccessBlockConfigurationBuilderOps(v)

  implicit def toPublicAccessBlockConfigurationOps(
      v: PublicAccessBlockConfiguration
  ): PublicAccessBlockConfigurationOps = new PublicAccessBlockConfigurationOps(v)

}
