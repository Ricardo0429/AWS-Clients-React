// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetItemResponseBuilderOps(val self: GetItemResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemAsScala(value: Option[Map[String, AttributeValue]]): GetItemResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.item(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): GetItemResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  }

}

final class GetItemResponseOps(val self: GetItemResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetItemResponseOps {

  implicit def toGetItemResponseBuilderOps(v: GetItemResponse.Builder): GetItemResponseBuilderOps =
    new GetItemResponseBuilderOps(v)

  implicit def toGetItemResponseOps(v: GetItemResponse): GetItemResponseOps = new GetItemResponseOps(v)

}
