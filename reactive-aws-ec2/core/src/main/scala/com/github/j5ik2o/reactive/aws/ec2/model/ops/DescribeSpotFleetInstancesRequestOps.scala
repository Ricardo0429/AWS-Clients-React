// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotFleetInstancesRequestBuilderOps(val self: DescribeSpotFleetInstancesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeSpotFleetInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeSpotFleetInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala(value: Option[String]): DescribeSpotFleetInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.spotFleetRequestId(v)
    }
  }

}

final class DescribeSpotFleetInstancesRequestOps(val self: DescribeSpotFleetInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotFleetRequestIdAsScala: Option[String] = Option(self.spotFleetRequestId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotFleetInstancesRequestOps {

  implicit def toDescribeSpotFleetInstancesRequestBuilderOps(
      v: DescribeSpotFleetInstancesRequest.Builder
  ): DescribeSpotFleetInstancesRequestBuilderOps = new DescribeSpotFleetInstancesRequestBuilderOps(v)

  implicit def toDescribeSpotFleetInstancesRequestOps(
      v: DescribeSpotFleetInstancesRequest
  ): DescribeSpotFleetInstancesRequestOps = new DescribeSpotFleetInstancesRequestOps(v)

}
