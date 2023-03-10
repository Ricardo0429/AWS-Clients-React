// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class InitiateLayerUploadRequestBuilderOps(val self: InitiateLayerUploadRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): InitiateLayerUploadRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): InitiateLayerUploadRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

}

final class InitiateLayerUploadRequestOps(val self: InitiateLayerUploadRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInitiateLayerUploadRequestOps {

  implicit def toInitiateLayerUploadRequestBuilderOps(
      v: InitiateLayerUploadRequest.Builder
  ): InitiateLayerUploadRequestBuilderOps = new InitiateLayerUploadRequestBuilderOps(v)

  implicit def toInitiateLayerUploadRequestOps(v: InitiateLayerUploadRequest): InitiateLayerUploadRequestOps =
    new InitiateLayerUploadRequestOps(v)

}
