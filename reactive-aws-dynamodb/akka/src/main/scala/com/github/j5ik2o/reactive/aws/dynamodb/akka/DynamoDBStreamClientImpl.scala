package com.github.j5ik2o.reactive.aws.dynamodb.akka

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient

import scala.concurrent.Future

class DynamoDBStreamClientImpl(override val underlying: DynamoDBClient[Future]) extends DynamoDBStreamClient