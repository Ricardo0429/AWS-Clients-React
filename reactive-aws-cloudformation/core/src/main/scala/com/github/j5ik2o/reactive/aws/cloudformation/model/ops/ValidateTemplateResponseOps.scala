// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ValidateTemplateResponseBuilderOps(val self: ValidateTemplateResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Seq[TemplateParameter]]): ValidateTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ValidateTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala(value: Option[Seq[Capability]]): ValidateTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capabilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesReasonAsScala(value: Option[String]): ValidateTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.capabilitiesReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def declaredTransformsAsScala(value: Option[Seq[String]]): ValidateTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.declaredTransforms(v.asJava)
    }
  }

}

final class ValidateTemplateResponseOps(val self: ValidateTemplateResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Seq[TemplateParameter]] = Option(self.parameters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesReasonAsScala: Option[String] = Option(self.capabilitiesReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def declaredTransformsAsScala: Option[Seq[String]] = Option(self.declaredTransforms).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidateTemplateResponseOps {

  implicit def toValidateTemplateResponseBuilderOps(
      v: ValidateTemplateResponse.Builder
  ): ValidateTemplateResponseBuilderOps = new ValidateTemplateResponseBuilderOps(v)

  implicit def toValidateTemplateResponseOps(v: ValidateTemplateResponse): ValidateTemplateResponseOps =
    new ValidateTemplateResponseOps(v)

}
