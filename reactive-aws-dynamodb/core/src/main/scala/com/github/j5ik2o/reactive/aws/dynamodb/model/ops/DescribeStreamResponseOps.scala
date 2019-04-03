// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeStreamResponseBuilderOps(val self: DescribeStreamResponse.Builder) extends AnyVal {

  final def withStreamDescriptionAsScala(value: Option[StreamDescription]): DescribeStreamResponse.Builder = {
    value.fold(self) { v =>
      self.streamDescription(v)
    }
  } // StreamDescription

}

final class DescribeStreamResponseOps(val self: DescribeStreamResponse) extends AnyVal {

  final def streamDescriptionAsScala: Option[StreamDescription] = Option(self.streamDescription) // StreamDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamResponseOps {

  implicit def toDescribeStreamResponseBuilderOps(v: DescribeStreamResponse.Builder): DescribeStreamResponseBuilderOps =
    new DescribeStreamResponseBuilderOps(v)

  implicit def toDescribeStreamResponseOps(v: DescribeStreamResponse): DescribeStreamResponseOps =
    new DescribeStreamResponseOps(v)

}
