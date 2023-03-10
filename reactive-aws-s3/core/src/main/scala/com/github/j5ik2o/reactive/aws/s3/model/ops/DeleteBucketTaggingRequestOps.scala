// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBucketTaggingRequestBuilderOps(val self: DeleteBucketTaggingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): DeleteBucketTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

}

final class DeleteBucketTaggingRequestOps(val self: DeleteBucketTaggingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteBucketTaggingRequestOps {

  implicit def toDeleteBucketTaggingRequestBuilderOps(
      v: DeleteBucketTaggingRequest.Builder
  ): DeleteBucketTaggingRequestBuilderOps = new DeleteBucketTaggingRequestBuilderOps(v)

  implicit def toDeleteBucketTaggingRequestOps(v: DeleteBucketTaggingRequest): DeleteBucketTaggingRequestOps =
    new DeleteBucketTaggingRequestOps(v)

}
