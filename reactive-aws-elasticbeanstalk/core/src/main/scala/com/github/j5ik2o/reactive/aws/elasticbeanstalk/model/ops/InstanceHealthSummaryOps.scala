// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class InstanceHealthSummaryBuilderOps(val self: InstanceHealthSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noDataAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.noData(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unknownAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.unknown(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pendingAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.pending(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def okAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.ok(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def infoAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.info(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def warningAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.warning(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def degradedAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.degraded(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def severeAsScala(value: Option[Int]): InstanceHealthSummary.Builder = {
    value.fold(self) { v =>
      self.severe(v)
    }
  }

}

final class InstanceHealthSummaryOps(val self: InstanceHealthSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noDataAsScala: Option[Int] = Option(self.noData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unknownAsScala: Option[Int] = Option(self.unknown)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pendingAsScala: Option[Int] = Option(self.pending)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def okAsScala: Option[Int] = Option(self.ok)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def infoAsScala: Option[Int] = Option(self.info)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def warningAsScala: Option[Int] = Option(self.warning)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def degradedAsScala: Option[Int] = Option(self.degraded)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def severeAsScala: Option[Int] = Option(self.severe)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceHealthSummaryOps {

  implicit def toInstanceHealthSummaryBuilderOps(v: InstanceHealthSummary.Builder): InstanceHealthSummaryBuilderOps =
    new InstanceHealthSummaryBuilderOps(v)

  implicit def toInstanceHealthSummaryOps(v: InstanceHealthSummary): InstanceHealthSummaryOps =
    new InstanceHealthSummaryOps(v)

}
