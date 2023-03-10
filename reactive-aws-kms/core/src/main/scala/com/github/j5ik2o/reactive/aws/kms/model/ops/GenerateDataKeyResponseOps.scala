// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateDataKeyResponseBuilderOps(val self: GenerateDataKeyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): GenerateDataKeyResponse.Builder = {
    value.fold(self) { v =>
      self.ciphertextBlob(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def plaintextAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): GenerateDataKeyResponse.Builder = {
    value.fold(self) { v =>
      self.plaintext(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GenerateDataKeyResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class GenerateDataKeyResponseOps(val self: GenerateDataKeyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def plaintextAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.plaintext)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateDataKeyResponseOps {

  implicit def toGenerateDataKeyResponseBuilderOps(
      v: GenerateDataKeyResponse.Builder
  ): GenerateDataKeyResponseBuilderOps = new GenerateDataKeyResponseBuilderOps(v)

  implicit def toGenerateDataKeyResponseOps(v: GenerateDataKeyResponse): GenerateDataKeyResponseOps =
    new GenerateDataKeyResponseOps(v)

}
