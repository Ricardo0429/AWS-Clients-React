// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateContainerAgentRequestBuilderOps(val self: UpdateContainerAgentRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): UpdateContainerAgentRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala(value: Option[String]): UpdateContainerAgentRequest.Builder = {
    value.fold(self) { v =>
      self.containerInstance(v)
    }
  }

}

final class UpdateContainerAgentRequestOps(val self: UpdateContainerAgentRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala: Option[String] = Option(self.containerInstance)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateContainerAgentRequestOps {

  implicit def toUpdateContainerAgentRequestBuilderOps(
      v: UpdateContainerAgentRequest.Builder
  ): UpdateContainerAgentRequestBuilderOps = new UpdateContainerAgentRequestBuilderOps(v)

  implicit def toUpdateContainerAgentRequestOps(v: UpdateContainerAgentRequest): UpdateContainerAgentRequestOps =
    new UpdateContainerAgentRequestOps(v)

}
