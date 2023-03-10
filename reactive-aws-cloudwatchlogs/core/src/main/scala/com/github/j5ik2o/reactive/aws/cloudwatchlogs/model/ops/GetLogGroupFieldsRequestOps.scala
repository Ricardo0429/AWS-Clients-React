// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetLogGroupFieldsRequestBuilderOps(val self: GetLogGroupFieldsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): GetLogGroupFieldsRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeAsScala(value: Option[Long]): GetLogGroupFieldsRequest.Builder = {
    value.fold(self) { v =>
      self.time(v)
    }
  }

}

final class GetLogGroupFieldsRequestOps(val self: GetLogGroupFieldsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeAsScala: Option[Long] = Option(self.time)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLogGroupFieldsRequestOps {

  implicit def toGetLogGroupFieldsRequestBuilderOps(
      v: GetLogGroupFieldsRequest.Builder
  ): GetLogGroupFieldsRequestBuilderOps = new GetLogGroupFieldsRequestBuilderOps(v)

  implicit def toGetLogGroupFieldsRequestOps(v: GetLogGroupFieldsRequest): GetLogGroupFieldsRequestOps =
    new GetLogGroupFieldsRequestOps(v)

}
