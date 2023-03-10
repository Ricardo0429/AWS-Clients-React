// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class CancelJobRequestBuilderOps(val self: CancelJobRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala(value: Option[String]): CancelJobRequest.Builder = {
    value.fold(self) { v =>
      self.jobId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala(value: Option[String]): CancelJobRequest.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

}

final class CancelJobRequestOps(val self: CancelJobRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobIdAsScala: Option[String] = Option(self.jobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala: Option[String] = Option(self.reason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelJobRequestOps {

  implicit def toCancelJobRequestBuilderOps(v: CancelJobRequest.Builder): CancelJobRequestBuilderOps =
    new CancelJobRequestBuilderOps(v)

  implicit def toCancelJobRequestOps(v: CancelJobRequest): CancelJobRequestOps = new CancelJobRequestOps(v)

}
