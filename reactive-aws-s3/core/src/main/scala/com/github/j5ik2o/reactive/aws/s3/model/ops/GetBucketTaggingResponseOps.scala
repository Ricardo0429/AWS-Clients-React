// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketTaggingResponseBuilderOps(val self: GetBucketTaggingResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSetAsScala(value: Option[Seq[Tag]]): GetBucketTaggingResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSet(v.asJava)
    }
  }

}

final class GetBucketTaggingResponseOps(val self: GetBucketTaggingResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSetAsScala: Option[Seq[Tag]] = Option(self.tagSet).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketTaggingResponseOps {

  implicit def toGetBucketTaggingResponseBuilderOps(
      v: GetBucketTaggingResponse.Builder
  ): GetBucketTaggingResponseBuilderOps = new GetBucketTaggingResponseBuilderOps(v)

  implicit def toGetBucketTaggingResponseOps(v: GetBucketTaggingResponse): GetBucketTaggingResponseOps =
    new GetBucketTaggingResponseOps(v)

}
