// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketTaggingRequestBuilderOps(val self: PutBucketTaggingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): PutBucketTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala(value: Option[String]): PutBucketTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taggingAsScala(value: Option[Tagging]): PutBucketTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  }

}

final class PutBucketTaggingRequestOps(val self: PutBucketTaggingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taggingAsScala: Option[Tagging] = Option(self.tagging)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketTaggingRequestOps {

  implicit def toPutBucketTaggingRequestBuilderOps(
      v: PutBucketTaggingRequest.Builder
  ): PutBucketTaggingRequestBuilderOps = new PutBucketTaggingRequestBuilderOps(v)

  implicit def toPutBucketTaggingRequestOps(v: PutBucketTaggingRequest): PutBucketTaggingRequestOps =
    new PutBucketTaggingRequestOps(v)

}
