// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class NodeToNodeEncryptionOptionsBuilderOps(val self: NodeToNodeEncryptionOptions.Builder) extends AnyVal {

  final def withEnabledAsScala(value: Option[Boolean]): NodeToNodeEncryptionOptions.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  } // Boolean

}

final class NodeToNodeEncryptionOptionsOps(val self: NodeToNodeEncryptionOptions) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeToNodeEncryptionOptionsOps {

  implicit def toNodeToNodeEncryptionOptionsBuilderOps(
      v: NodeToNodeEncryptionOptions.Builder
  ): NodeToNodeEncryptionOptionsBuilderOps = new NodeToNodeEncryptionOptionsBuilderOps(v)

  implicit def toNodeToNodeEncryptionOptionsOps(v: NodeToNodeEncryptionOptions): NodeToNodeEncryptionOptionsOps =
    new NodeToNodeEncryptionOptionsOps(v)

}
