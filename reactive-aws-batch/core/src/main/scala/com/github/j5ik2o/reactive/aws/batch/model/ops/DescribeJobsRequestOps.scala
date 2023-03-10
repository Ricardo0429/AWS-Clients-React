// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeJobsRequestBuilderOps(val self: DescribeJobsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobsAsScala(value: Option[Seq[String]]): DescribeJobsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.jobs(v.asJava)
    }
  }

}

final class DescribeJobsRequestOps(val self: DescribeJobsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobsAsScala: Option[Seq[String]] = Option(self.jobs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeJobsRequestOps {

  implicit def toDescribeJobsRequestBuilderOps(v: DescribeJobsRequest.Builder): DescribeJobsRequestBuilderOps =
    new DescribeJobsRequestBuilderOps(v)

  implicit def toDescribeJobsRequestOps(v: DescribeJobsRequest): DescribeJobsRequestOps = new DescribeJobsRequestOps(v)

}
