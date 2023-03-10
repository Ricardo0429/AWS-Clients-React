// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeBackupResponseBuilderOps(val self: DescribeBackupResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupDescriptionAsScala(value: Option[BackupDescription]): DescribeBackupResponse.Builder = {
    value.fold(self) { v =>
      self.backupDescription(v)
    }
  }

}

final class DescribeBackupResponseOps(val self: DescribeBackupResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupDescriptionAsScala: Option[BackupDescription] = Option(self.backupDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeBackupResponseOps {

  implicit def toDescribeBackupResponseBuilderOps(v: DescribeBackupResponse.Builder): DescribeBackupResponseBuilderOps =
    new DescribeBackupResponseBuilderOps(v)

  implicit def toDescribeBackupResponseOps(v: DescribeBackupResponse): DescribeBackupResponseOps =
    new DescribeBackupResponseOps(v)

}
