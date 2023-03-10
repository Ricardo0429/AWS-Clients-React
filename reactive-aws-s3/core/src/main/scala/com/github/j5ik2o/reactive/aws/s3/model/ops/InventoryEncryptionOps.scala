// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryEncryptionBuilderOps(val self: InventoryEncryption.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sses3AsScala(value: Option[SSES3]): InventoryEncryption.Builder = {
    value.fold(self) { v =>
      self.sses3(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsAsScala(value: Option[SSEKMS]): InventoryEncryption.Builder = {
    value.fold(self) { v =>
      self.ssekms(v)
    }
  }

}

final class InventoryEncryptionOps(val self: InventoryEncryption) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sses3AsScala: Option[SSES3] = Option(self.sses3)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsAsScala: Option[SSEKMS] = Option(self.ssekms)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInventoryEncryptionOps {

  implicit def toInventoryEncryptionBuilderOps(v: InventoryEncryption.Builder): InventoryEncryptionBuilderOps =
    new InventoryEncryptionBuilderOps(v)

  implicit def toInventoryEncryptionOps(v: InventoryEncryption): InventoryEncryptionOps = new InventoryEncryptionOps(v)

}
