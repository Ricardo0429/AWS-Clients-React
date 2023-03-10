// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ResourcePolicyBuilderOps(val self: ResourcePolicy.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyNameAsScala(value: Option[String]): ResourcePolicy.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyDocumentAsScala(value: Option[String]): ResourcePolicy.Builder = {
    value.fold(self) { v =>
      self.policyDocument(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimeAsScala(value: Option[Long]): ResourcePolicy.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTime(v)
    }
  }

}

final class ResourcePolicyOps(val self: ResourcePolicy) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyNameAsScala: Option[String] = Option(self.policyName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyDocumentAsScala: Option[String] = Option(self.policyDocument)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimeAsScala: Option[Long] = Option(self.lastUpdatedTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourcePolicyOps {

  implicit def toResourcePolicyBuilderOps(v: ResourcePolicy.Builder): ResourcePolicyBuilderOps =
    new ResourcePolicyBuilderOps(v)

  implicit def toResourcePolicyOps(v: ResourcePolicy): ResourcePolicyOps = new ResourcePolicyOps(v)

}
