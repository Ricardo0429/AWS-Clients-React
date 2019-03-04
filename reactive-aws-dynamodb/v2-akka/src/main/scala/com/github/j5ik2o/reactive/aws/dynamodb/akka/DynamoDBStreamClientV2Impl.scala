package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClientV2
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest, BatchGetItemResponse, _ }

private[dynamodb] class DynamoDBStreamClientV2Impl(override val underlying: DynamoDBAsyncClientV2)
    extends DynamoDBStreamClientV2 {

  override def batchGetItemFlow: Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed] =
    Flow[BatchGetItemRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.batchGetItemPaginator(request))
    }

  override def listTablesFlow: Flow[ListTablesRequest, ListTablesResponse, NotUsed] =
    Flow[ListTablesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listTablesPaginator(request))
    }

  override def listTablesSource: Source[ListTablesResponse, NotUsed] =
    Source.fromPublisher(underlying.listTablesPaginator)

  override def queryFlow: Flow[QueryRequest, QueryResponse, NotUsed] =
    Flow[QueryRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.queryPaginator(request))
    }

  override def scanFlow: Flow[ScanRequest, ScanResponse, NotUsed] = Flow[ScanRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.scanPaginator(request))
  }

}