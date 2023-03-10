// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpnGatewaysResponseBuilderOps(val self: DescribeVpnGatewaysResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewaysAsScala(value: Option[Seq[VpnGateway]]): DescribeVpnGatewaysResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpnGateways(v.asJava)
    }
  }

}

final class DescribeVpnGatewaysResponseOps(val self: DescribeVpnGatewaysResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewaysAsScala: Option[Seq[VpnGateway]] = Option(self.vpnGateways).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpnGatewaysResponseOps {

  implicit def toDescribeVpnGatewaysResponseBuilderOps(
      v: DescribeVpnGatewaysResponse.Builder
  ): DescribeVpnGatewaysResponseBuilderOps = new DescribeVpnGatewaysResponseBuilderOps(v)

  implicit def toDescribeVpnGatewaysResponseOps(v: DescribeVpnGatewaysResponse): DescribeVpnGatewaysResponseOps =
    new DescribeVpnGatewaysResponseOps(v)

}
