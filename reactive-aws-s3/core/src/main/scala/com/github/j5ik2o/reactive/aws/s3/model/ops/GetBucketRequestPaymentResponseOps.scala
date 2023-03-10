// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketRequestPaymentResponseBuilderOps(val self: GetBucketRequestPaymentResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def payerAsScala(value: Option[Payer]): GetBucketRequestPaymentResponse.Builder = {
    value.fold(self) { v =>
      self.payer(v)
    }
  }

}

final class GetBucketRequestPaymentResponseOps(val self: GetBucketRequestPaymentResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def payerAsScala: Option[Payer] = Option(self.payer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketRequestPaymentResponseOps {

  implicit def toGetBucketRequestPaymentResponseBuilderOps(
      v: GetBucketRequestPaymentResponse.Builder
  ): GetBucketRequestPaymentResponseBuilderOps = new GetBucketRequestPaymentResponseBuilderOps(v)

  implicit def toGetBucketRequestPaymentResponseOps(
      v: GetBucketRequestPaymentResponse
  ): GetBucketRequestPaymentResponseOps = new GetBucketRequestPaymentResponseOps(v)

}
