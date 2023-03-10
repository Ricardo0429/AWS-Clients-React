// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DeleteClusterResponseBuilderOps(val self: DeleteClusterResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[Cluster]): DeleteClusterResponse.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

}

final class DeleteClusterResponseOps(val self: DeleteClusterResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[Cluster] = Option(self.cluster)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteClusterResponseOps {

  implicit def toDeleteClusterResponseBuilderOps(v: DeleteClusterResponse.Builder): DeleteClusterResponseBuilderOps =
    new DeleteClusterResponseBuilderOps(v)

  implicit def toDeleteClusterResponseOps(v: DeleteClusterResponse): DeleteClusterResponseOps =
    new DeleteClusterResponseOps(v)

}
