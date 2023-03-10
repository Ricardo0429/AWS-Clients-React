// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class BucketLifecycleConfigurationBuilderOps(val self: BucketLifecycleConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rulesAsScala(value: Option[Seq[LifecycleRule]]): BucketLifecycleConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.rules(v.asJava)
    }
  }

}

final class BucketLifecycleConfigurationOps(val self: BucketLifecycleConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rulesAsScala: Option[Seq[LifecycleRule]] = Option(self.rules).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBucketLifecycleConfigurationOps {

  implicit def toBucketLifecycleConfigurationBuilderOps(
      v: BucketLifecycleConfiguration.Builder
  ): BucketLifecycleConfigurationBuilderOps = new BucketLifecycleConfigurationBuilderOps(v)

  implicit def toBucketLifecycleConfigurationOps(v: BucketLifecycleConfiguration): BucketLifecycleConfigurationOps =
    new BucketLifecycleConfigurationOps(v)

}
