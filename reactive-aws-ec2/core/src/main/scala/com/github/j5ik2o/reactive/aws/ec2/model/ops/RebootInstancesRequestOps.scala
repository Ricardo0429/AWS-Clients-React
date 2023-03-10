// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RebootInstancesRequestBuilderOps(val self: RebootInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala(value: Option[Seq[String]]): RebootInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceIds(v.asJava)
    }
  }

}

final class RebootInstancesRequestOps(val self: RebootInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala: Option[Seq[String]] = Option(self.instanceIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRebootInstancesRequestOps {

  implicit def toRebootInstancesRequestBuilderOps(v: RebootInstancesRequest.Builder): RebootInstancesRequestBuilderOps =
    new RebootInstancesRequestBuilderOps(v)

  implicit def toRebootInstancesRequestOps(v: RebootInstancesRequest): RebootInstancesRequestOps =
    new RebootInstancesRequestOps(v)

}
