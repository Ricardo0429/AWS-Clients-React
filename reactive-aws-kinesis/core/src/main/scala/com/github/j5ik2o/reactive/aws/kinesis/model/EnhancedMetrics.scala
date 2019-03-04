package com.github.j5ik2o.reactive.aws.kinesis.model

final case class EnhancedMetrics(shardLevelMetrics: Option[Seq[MetricsName]] = None) {

  def withShardLevelMetrics(value: Option[Seq[MetricsName]]): EnhancedMetrics = copy(shardLevelMetrics = value)

}