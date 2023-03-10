// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class OptionRestrictionRegexBuilderOps(val self: OptionRestrictionRegex.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def patternAsScala(value: Option[String]): OptionRestrictionRegex.Builder = {
    value.fold(self) { v =>
      self.pattern(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala(value: Option[String]): OptionRestrictionRegex.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

}

final class OptionRestrictionRegexOps(val self: OptionRestrictionRegex) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def patternAsScala: Option[String] = Option(self.pattern)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala: Option[String] = Option(self.label)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOptionRestrictionRegexOps {

  implicit def toOptionRestrictionRegexBuilderOps(v: OptionRestrictionRegex.Builder): OptionRestrictionRegexBuilderOps =
    new OptionRestrictionRegexBuilderOps(v)

  implicit def toOptionRestrictionRegexOps(v: OptionRestrictionRegex): OptionRestrictionRegexOps =
    new OptionRestrictionRegexOps(v)

}
