// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateParameterGroupResponseBuilderOps(val self: CreateParameterGroupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupAsScala(value: Option[ParameterGroup]): CreateParameterGroupResponse.Builder = {
    value.fold(self) { v =>
      self.parameterGroup(v)
    }
  }

}

final class CreateParameterGroupResponseOps(val self: CreateParameterGroupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupAsScala: Option[ParameterGroup] = Option(self.parameterGroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateParameterGroupResponseOps {

  implicit def toCreateParameterGroupResponseBuilderOps(
      v: CreateParameterGroupResponse.Builder
  ): CreateParameterGroupResponseBuilderOps = new CreateParameterGroupResponseBuilderOps(v)

  implicit def toCreateParameterGroupResponseOps(v: CreateParameterGroupResponse): CreateParameterGroupResponseOps =
    new CreateParameterGroupResponseOps(v)

}
