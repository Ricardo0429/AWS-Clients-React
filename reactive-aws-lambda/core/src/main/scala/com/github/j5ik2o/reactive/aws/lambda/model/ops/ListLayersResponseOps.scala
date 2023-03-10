// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListLayersResponseBuilderOps(val self: ListLayersResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListLayersResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala(value: Option[Seq[LayersListItem]]): ListLayersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.layers(v.asJava)
    }
  }

}

final class ListLayersResponseOps(val self: ListLayersResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala: Option[Seq[LayersListItem]] = Option(self.layers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListLayersResponseOps {

  implicit def toListLayersResponseBuilderOps(v: ListLayersResponse.Builder): ListLayersResponseBuilderOps =
    new ListLayersResponseBuilderOps(v)

  implicit def toListLayersResponseOps(v: ListLayersResponse): ListLayersResponseOps = new ListLayersResponseOps(v)

}
