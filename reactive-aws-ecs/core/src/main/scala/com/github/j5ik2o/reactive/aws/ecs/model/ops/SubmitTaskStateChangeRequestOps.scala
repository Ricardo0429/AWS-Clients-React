// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SubmitTaskStateChangeRequestBuilderOps(val self: SubmitTaskStateChangeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskAsScala(value: Option[String]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.task(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala(value: Option[String]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containersAsScala(value: Option[Seq[ContainerStateChange]]): SubmitTaskStateChangeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala(value: Option[Seq[AttachmentStateChange]]): SubmitTaskStateChangeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attachments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pullStartedAtAsScala(value: Option[java.time.Instant]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.pullStartedAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pullStoppedAtAsScala(value: Option[java.time.Instant]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.pullStoppedAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionStoppedAtAsScala(value: Option[java.time.Instant]): SubmitTaskStateChangeRequest.Builder = {
    value.fold(self) { v =>
      self.executionStoppedAt(v)
    }
  }

}

final class SubmitTaskStateChangeRequestOps(val self: SubmitTaskStateChangeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskAsScala: Option[String] = Option(self.task)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala: Option[String] = Option(self.reason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containersAsScala: Option[Seq[ContainerStateChange]] = Option(self.containers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala: Option[Seq[AttachmentStateChange]] = Option(self.attachments).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pullStartedAtAsScala: Option[java.time.Instant] = Option(self.pullStartedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pullStoppedAtAsScala: Option[java.time.Instant] = Option(self.pullStoppedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionStoppedAtAsScala: Option[java.time.Instant] = Option(self.executionStoppedAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitTaskStateChangeRequestOps {

  implicit def toSubmitTaskStateChangeRequestBuilderOps(
      v: SubmitTaskStateChangeRequest.Builder
  ): SubmitTaskStateChangeRequestBuilderOps = new SubmitTaskStateChangeRequestBuilderOps(v)

  implicit def toSubmitTaskStateChangeRequestOps(v: SubmitTaskStateChangeRequest): SubmitTaskStateChangeRequestOps =
    new SubmitTaskStateChangeRequestOps(v)

}
