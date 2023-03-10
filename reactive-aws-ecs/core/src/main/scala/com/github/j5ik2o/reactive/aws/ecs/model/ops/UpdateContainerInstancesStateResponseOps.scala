// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateContainerInstancesStateResponseBuilderOps(val self: UpdateContainerInstancesStateResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstancesAsScala(
      value: Option[Seq[ContainerInstance]]
  ): UpdateContainerInstancesStateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerInstances(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[Failure]]): UpdateContainerInstancesStateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class UpdateContainerInstancesStateResponseOps(val self: UpdateContainerInstancesStateResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstancesAsScala: Option[Seq[ContainerInstance]] = Option(self.containerInstances).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateContainerInstancesStateResponseOps {

  implicit def toUpdateContainerInstancesStateResponseBuilderOps(
      v: UpdateContainerInstancesStateResponse.Builder
  ): UpdateContainerInstancesStateResponseBuilderOps = new UpdateContainerInstancesStateResponseBuilderOps(v)

  implicit def toUpdateContainerInstancesStateResponseOps(
      v: UpdateContainerInstancesStateResponse
  ): UpdateContainerInstancesStateResponseOps = new UpdateContainerInstancesStateResponseOps(v)

}
