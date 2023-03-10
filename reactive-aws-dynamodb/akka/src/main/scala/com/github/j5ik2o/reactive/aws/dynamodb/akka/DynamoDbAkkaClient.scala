// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.model._

object DynamoDbAkkaClient {

  def apply(asyncClient: DynamoDbAsyncClient): DynamoDbAkkaClient = new DynamoDbAkkaClient {
    override val underlying: DynamoDbAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait DynamoDbAkkaClient {

  import DynamoDbAkkaClient._

  val underlying: DynamoDbAsyncClient

  def batchGetItemSource(
      batchGetItemRequest: BatchGetItemRequest,
      parallelism: Int = DefaultParallelism
  ): Source[BatchGetItemResponse, NotUsed] =
    Source.single(batchGetItemRequest).via(batchGetItemFlow(parallelism))

  def batchGetItemFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed] =
    Flow[BatchGetItemRequest].mapAsync(parallelism) { batchGetItemRequest =>
      underlying.batchGetItem(batchGetItemRequest)
    }

  def batchGetItemPaginatorFlow: Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed] =
    Flow[BatchGetItemRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.batchGetItemPaginator(request))
    }

  def batchWriteItemSource(
      batchWriteItemRequest: BatchWriteItemRequest,
      parallelism: Int = DefaultParallelism
  ): Source[BatchWriteItemResponse, NotUsed] =
    Source.single(batchWriteItemRequest).via(batchWriteItemFlow(parallelism))

  def batchWriteItemFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[BatchWriteItemRequest, BatchWriteItemResponse, NotUsed] =
    Flow[BatchWriteItemRequest].mapAsync(parallelism) { batchWriteItemRequest =>
      underlying.batchWriteItem(batchWriteItemRequest)
    }

  def createBackupSource(
      createBackupRequest: CreateBackupRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateBackupResponse, NotUsed] =
    Source.single(createBackupRequest).via(createBackupFlow(parallelism))

  def createBackupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateBackupRequest, CreateBackupResponse, NotUsed] =
    Flow[CreateBackupRequest].mapAsync(parallelism) { createBackupRequest =>
      underlying.createBackup(createBackupRequest)
    }

  def createGlobalTableSource(
      createGlobalTableRequest: CreateGlobalTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateGlobalTableResponse, NotUsed] =
    Source.single(createGlobalTableRequest).via(createGlobalTableFlow(parallelism))

  def createGlobalTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateGlobalTableRequest, CreateGlobalTableResponse, NotUsed] =
    Flow[CreateGlobalTableRequest].mapAsync(parallelism) { createGlobalTableRequest =>
      underlying.createGlobalTable(createGlobalTableRequest)
    }

  def createTableSource(
      createTableRequest: CreateTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateTableResponse, NotUsed] =
    Source.single(createTableRequest).via(createTableFlow(parallelism))

  def createTableFlow(parallelism: Int = DefaultParallelism): Flow[CreateTableRequest, CreateTableResponse, NotUsed] =
    Flow[CreateTableRequest].mapAsync(parallelism) { createTableRequest =>
      underlying.createTable(createTableRequest)
    }

  def deleteBackupSource(
      deleteBackupRequest: DeleteBackupRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteBackupResponse, NotUsed] =
    Source.single(deleteBackupRequest).via(deleteBackupFlow(parallelism))

  def deleteBackupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBackupRequest, DeleteBackupResponse, NotUsed] =
    Flow[DeleteBackupRequest].mapAsync(parallelism) { deleteBackupRequest =>
      underlying.deleteBackup(deleteBackupRequest)
    }

  def deleteItemSource(
      deleteItemRequest: DeleteItemRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteItemResponse, NotUsed] =
    Source.single(deleteItemRequest).via(deleteItemFlow(parallelism))

  def deleteItemFlow(parallelism: Int = DefaultParallelism): Flow[DeleteItemRequest, DeleteItemResponse, NotUsed] =
    Flow[DeleteItemRequest].mapAsync(parallelism) { deleteItemRequest =>
      underlying.deleteItem(deleteItemRequest)
    }

  def deleteTableSource(
      deleteTableRequest: DeleteTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteTableResponse, NotUsed] =
    Source.single(deleteTableRequest).via(deleteTableFlow(parallelism))

  def deleteTableFlow(parallelism: Int = DefaultParallelism): Flow[DeleteTableRequest, DeleteTableResponse, NotUsed] =
    Flow[DeleteTableRequest].mapAsync(parallelism) { deleteTableRequest =>
      underlying.deleteTable(deleteTableRequest)
    }

  def describeBackupSource(
      describeBackupRequest: DescribeBackupRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeBackupResponse, NotUsed] =
    Source.single(describeBackupRequest).via(describeBackupFlow(parallelism))

  def describeBackupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeBackupRequest, DescribeBackupResponse, NotUsed] =
    Flow[DescribeBackupRequest].mapAsync(parallelism) { describeBackupRequest =>
      underlying.describeBackup(describeBackupRequest)
    }

  def describeContinuousBackupsSource(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeContinuousBackupsResponse, NotUsed] =
    Source.single(describeContinuousBackupsRequest).via(describeContinuousBackupsFlow(parallelism))

  def describeContinuousBackupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeContinuousBackupsRequest, DescribeContinuousBackupsResponse, NotUsed] =
    Flow[DescribeContinuousBackupsRequest].mapAsync(parallelism) { describeContinuousBackupsRequest =>
      underlying.describeContinuousBackups(describeContinuousBackupsRequest)
    }

  def describeContributorInsightsSource(
      describeContributorInsightsRequest: DescribeContributorInsightsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeContributorInsightsResponse, NotUsed] =
    Source.single(describeContributorInsightsRequest).via(describeContributorInsightsFlow(parallelism))

  def describeContributorInsightsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeContributorInsightsRequest, DescribeContributorInsightsResponse, NotUsed] =
    Flow[DescribeContributorInsightsRequest].mapAsync(parallelism) { describeContributorInsightsRequest =>
      underlying.describeContributorInsights(describeContributorInsightsRequest)
    }

  def describeEndpointsSource(
      describeEndpointsRequest: DescribeEndpointsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeEndpointsResponse, NotUsed] =
    Source.single(describeEndpointsRequest).via(describeEndpointsFlow(parallelism))

  def describeEndpointsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEndpointsRequest, DescribeEndpointsResponse, NotUsed] =
    Flow[DescribeEndpointsRequest].mapAsync(parallelism) { describeEndpointsRequest =>
      underlying.describeEndpoints(describeEndpointsRequest)
    }

  def describeEndpointsSource(): Source[DescribeEndpointsResponse, NotUsed] =
    Source.fromFuture(underlying.describeEndpoints())

  def describeGlobalTableSource(
      describeGlobalTableRequest: DescribeGlobalTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeGlobalTableResponse, NotUsed] =
    Source.single(describeGlobalTableRequest).via(describeGlobalTableFlow(parallelism))

  def describeGlobalTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeGlobalTableRequest, DescribeGlobalTableResponse, NotUsed] =
    Flow[DescribeGlobalTableRequest].mapAsync(parallelism) { describeGlobalTableRequest =>
      underlying.describeGlobalTable(describeGlobalTableRequest)
    }

  def describeGlobalTableSettingsSource(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeGlobalTableSettingsResponse, NotUsed] =
    Source.single(describeGlobalTableSettingsRequest).via(describeGlobalTableSettingsFlow(parallelism))

  def describeGlobalTableSettingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResponse, NotUsed] =
    Flow[DescribeGlobalTableSettingsRequest].mapAsync(parallelism) { describeGlobalTableSettingsRequest =>
      underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)
    }

  def describeLimitsSource(
      describeLimitsRequest: DescribeLimitsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeLimitsResponse, NotUsed] =
    Source.single(describeLimitsRequest).via(describeLimitsFlow(parallelism))

  def describeLimitsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeLimitsRequest, DescribeLimitsResponse, NotUsed] =
    Flow[DescribeLimitsRequest].mapAsync(parallelism) { describeLimitsRequest =>
      underlying.describeLimits(describeLimitsRequest)
    }

  def describeLimitsSource(): Source[DescribeLimitsResponse, NotUsed] =
    Source.fromFuture(underlying.describeLimits())

  def describeTableSource(
      describeTableRequest: DescribeTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTableResponse, NotUsed] =
    Source.single(describeTableRequest).via(describeTableFlow(parallelism))

  def describeTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTableRequest, DescribeTableResponse, NotUsed] =
    Flow[DescribeTableRequest].mapAsync(parallelism) { describeTableRequest =>
      underlying.describeTable(describeTableRequest)
    }

  def describeTableReplicaAutoScalingSource(
      describeTableReplicaAutoScalingRequest: DescribeTableReplicaAutoScalingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTableReplicaAutoScalingResponse, NotUsed] =
    Source.single(describeTableReplicaAutoScalingRequest).via(describeTableReplicaAutoScalingFlow(parallelism))

  def describeTableReplicaAutoScalingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTableReplicaAutoScalingRequest, DescribeTableReplicaAutoScalingResponse, NotUsed] =
    Flow[DescribeTableReplicaAutoScalingRequest].mapAsync(parallelism) { describeTableReplicaAutoScalingRequest =>
      underlying.describeTableReplicaAutoScaling(describeTableReplicaAutoScalingRequest)
    }

  def describeTimeToLiveSource(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeTimeToLiveResponse, NotUsed] =
    Source.single(describeTimeToLiveRequest).via(describeTimeToLiveFlow(parallelism))

  def describeTimeToLiveFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTimeToLiveRequest, DescribeTimeToLiveResponse, NotUsed] =
    Flow[DescribeTimeToLiveRequest].mapAsync(parallelism) { describeTimeToLiveRequest =>
      underlying.describeTimeToLive(describeTimeToLiveRequest)
    }

  def getItemSource(
      getItemRequest: GetItemRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetItemResponse, NotUsed] =
    Source.single(getItemRequest).via(getItemFlow(parallelism))

  def getItemFlow(parallelism: Int = DefaultParallelism): Flow[GetItemRequest, GetItemResponse, NotUsed] =
    Flow[GetItemRequest].mapAsync(parallelism) { getItemRequest =>
      underlying.getItem(getItemRequest)
    }

  def listBackupsSource(
      listBackupsRequest: ListBackupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListBackupsResponse, NotUsed] =
    Source.single(listBackupsRequest).via(listBackupsFlow(parallelism))

  def listBackupsFlow(parallelism: Int = DefaultParallelism): Flow[ListBackupsRequest, ListBackupsResponse, NotUsed] =
    Flow[ListBackupsRequest].mapAsync(parallelism) { listBackupsRequest =>
      underlying.listBackups(listBackupsRequest)
    }

  def listBackupsSource(): Source[ListBackupsResponse, NotUsed] =
    Source.fromFuture(underlying.listBackups())

  def listContributorInsightsSource(
      listContributorInsightsRequest: ListContributorInsightsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListContributorInsightsResponse, NotUsed] =
    Source.single(listContributorInsightsRequest).via(listContributorInsightsFlow(parallelism))

  def listContributorInsightsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListContributorInsightsRequest, ListContributorInsightsResponse, NotUsed] =
    Flow[ListContributorInsightsRequest].mapAsync(parallelism) { listContributorInsightsRequest =>
      underlying.listContributorInsights(listContributorInsightsRequest)
    }

  def listContributorInsightsPaginatorFlow
      : Flow[ListContributorInsightsRequest, ListContributorInsightsResponse, NotUsed] =
    Flow[ListContributorInsightsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listContributorInsightsPaginator(request))
    }

  def listGlobalTablesSource(
      listGlobalTablesRequest: ListGlobalTablesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListGlobalTablesResponse, NotUsed] =
    Source.single(listGlobalTablesRequest).via(listGlobalTablesFlow(parallelism))

  def listGlobalTablesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListGlobalTablesRequest, ListGlobalTablesResponse, NotUsed] =
    Flow[ListGlobalTablesRequest].mapAsync(parallelism) { listGlobalTablesRequest =>
      underlying.listGlobalTables(listGlobalTablesRequest)
    }

  def listGlobalTablesSource(): Source[ListGlobalTablesResponse, NotUsed] =
    Source.fromFuture(underlying.listGlobalTables())

  def listTablesSource(
      listTablesRequest: ListTablesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTablesResponse, NotUsed] =
    Source.single(listTablesRequest).via(listTablesFlow(parallelism))

  def listTablesFlow(parallelism: Int = DefaultParallelism): Flow[ListTablesRequest, ListTablesResponse, NotUsed] =
    Flow[ListTablesRequest].mapAsync(parallelism) { listTablesRequest =>
      underlying.listTables(listTablesRequest)
    }

  def listTablesSource(): Source[ListTablesResponse, NotUsed] =
    Source.fromFuture(underlying.listTables())

  def listTablesPaginatorSource: Source[ListTablesResponse, NotUsed] =
    Source.fromPublisher(underlying.listTablesPaginator())

  def listTablesPaginatorFlow: Flow[ListTablesRequest, ListTablesResponse, NotUsed] =
    Flow[ListTablesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listTablesPaginator(request))
    }

  def listTagsOfResourceSource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTagsOfResourceResponse, NotUsed] =
    Source.single(listTagsOfResourceRequest).via(listTagsOfResourceFlow(parallelism))

  def listTagsOfResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTagsOfResourceRequest, ListTagsOfResourceResponse, NotUsed] =
    Flow[ListTagsOfResourceRequest].mapAsync(parallelism) { listTagsOfResourceRequest =>
      underlying.listTagsOfResource(listTagsOfResourceRequest)
    }

  def putItemSource(
      putItemRequest: PutItemRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutItemResponse, NotUsed] =
    Source.single(putItemRequest).via(putItemFlow(parallelism))

  def putItemFlow(parallelism: Int = DefaultParallelism): Flow[PutItemRequest, PutItemResponse, NotUsed] =
    Flow[PutItemRequest].mapAsync(parallelism) { putItemRequest =>
      underlying.putItem(putItemRequest)
    }

  def querySource(queryRequest: QueryRequest, parallelism: Int = DefaultParallelism): Source[QueryResponse, NotUsed] =
    Source.single(queryRequest).via(queryFlow(parallelism))

  def queryFlow(parallelism: Int = DefaultParallelism): Flow[QueryRequest, QueryResponse, NotUsed] =
    Flow[QueryRequest].mapAsync(parallelism) { queryRequest =>
      underlying.query(queryRequest)
    }

  def queryPaginatorFlow: Flow[QueryRequest, QueryResponse, NotUsed] = Flow[QueryRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.queryPaginator(request))
  }

  def restoreTableFromBackupSource(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RestoreTableFromBackupResponse, NotUsed] =
    Source.single(restoreTableFromBackupRequest).via(restoreTableFromBackupFlow(parallelism))

  def restoreTableFromBackupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RestoreTableFromBackupRequest, RestoreTableFromBackupResponse, NotUsed] =
    Flow[RestoreTableFromBackupRequest].mapAsync(parallelism) { restoreTableFromBackupRequest =>
      underlying.restoreTableFromBackup(restoreTableFromBackupRequest)
    }

  def restoreTableToPointInTimeSource(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RestoreTableToPointInTimeResponse, NotUsed] =
    Source.single(restoreTableToPointInTimeRequest).via(restoreTableToPointInTimeFlow(parallelism))

  def restoreTableToPointInTimeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResponse, NotUsed] =
    Flow[RestoreTableToPointInTimeRequest].mapAsync(parallelism) { restoreTableToPointInTimeRequest =>
      underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)
    }

  def scanSource(scanRequest: ScanRequest, parallelism: Int = DefaultParallelism): Source[ScanResponse, NotUsed] =
    Source.single(scanRequest).via(scanFlow(parallelism))

  def scanFlow(parallelism: Int = DefaultParallelism): Flow[ScanRequest, ScanResponse, NotUsed] =
    Flow[ScanRequest].mapAsync(parallelism) { scanRequest =>
      underlying.scan(scanRequest)
    }

  def scanPaginatorFlow: Flow[ScanRequest, ScanResponse, NotUsed] = Flow[ScanRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.scanPaginator(request))
  }

  def tagResourceSource(
      tagResourceRequest: TagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TagResourceResponse, NotUsed] =
    Source.single(tagResourceRequest).via(tagResourceFlow(parallelism))

  def tagResourceFlow(parallelism: Int = DefaultParallelism): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism) { tagResourceRequest =>
      underlying.tagResource(tagResourceRequest)
    }

  def transactGetItemsSource(
      transactGetItemsRequest: TransactGetItemsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TransactGetItemsResponse, NotUsed] =
    Source.single(transactGetItemsRequest).via(transactGetItemsFlow(parallelism))

  def transactGetItemsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TransactGetItemsRequest, TransactGetItemsResponse, NotUsed] =
    Flow[TransactGetItemsRequest].mapAsync(parallelism) { transactGetItemsRequest =>
      underlying.transactGetItems(transactGetItemsRequest)
    }

  def transactWriteItemsSource(
      transactWriteItemsRequest: TransactWriteItemsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TransactWriteItemsResponse, NotUsed] =
    Source.single(transactWriteItemsRequest).via(transactWriteItemsFlow(parallelism))

  def transactWriteItemsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TransactWriteItemsRequest, TransactWriteItemsResponse, NotUsed] =
    Flow[TransactWriteItemsRequest].mapAsync(parallelism) { transactWriteItemsRequest =>
      underlying.transactWriteItems(transactWriteItemsRequest)
    }

  def untagResourceSource(
      untagResourceRequest: UntagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UntagResourceResponse, NotUsed] =
    Source.single(untagResourceRequest).via(untagResourceFlow(parallelism))

  def untagResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism) { untagResourceRequest =>
      underlying.untagResource(untagResourceRequest)
    }

  def updateContinuousBackupsSource(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateContinuousBackupsResponse, NotUsed] =
    Source.single(updateContinuousBackupsRequest).via(updateContinuousBackupsFlow(parallelism))

  def updateContinuousBackupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateContinuousBackupsRequest, UpdateContinuousBackupsResponse, NotUsed] =
    Flow[UpdateContinuousBackupsRequest].mapAsync(parallelism) { updateContinuousBackupsRequest =>
      underlying.updateContinuousBackups(updateContinuousBackupsRequest)
    }

  def updateContributorInsightsSource(
      updateContributorInsightsRequest: UpdateContributorInsightsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateContributorInsightsResponse, NotUsed] =
    Source.single(updateContributorInsightsRequest).via(updateContributorInsightsFlow(parallelism))

  def updateContributorInsightsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateContributorInsightsRequest, UpdateContributorInsightsResponse, NotUsed] =
    Flow[UpdateContributorInsightsRequest].mapAsync(parallelism) { updateContributorInsightsRequest =>
      underlying.updateContributorInsights(updateContributorInsightsRequest)
    }

  def updateGlobalTableSource(
      updateGlobalTableRequest: UpdateGlobalTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateGlobalTableResponse, NotUsed] =
    Source.single(updateGlobalTableRequest).via(updateGlobalTableFlow(parallelism))

  def updateGlobalTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateGlobalTableRequest, UpdateGlobalTableResponse, NotUsed] =
    Flow[UpdateGlobalTableRequest].mapAsync(parallelism) { updateGlobalTableRequest =>
      underlying.updateGlobalTable(updateGlobalTableRequest)
    }

  def updateGlobalTableSettingsSource(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateGlobalTableSettingsResponse, NotUsed] =
    Source.single(updateGlobalTableSettingsRequest).via(updateGlobalTableSettingsFlow(parallelism))

  def updateGlobalTableSettingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResponse, NotUsed] =
    Flow[UpdateGlobalTableSettingsRequest].mapAsync(parallelism) { updateGlobalTableSettingsRequest =>
      underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)
    }

  def updateItemSource(
      updateItemRequest: UpdateItemRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateItemResponse, NotUsed] =
    Source.single(updateItemRequest).via(updateItemFlow(parallelism))

  def updateItemFlow(parallelism: Int = DefaultParallelism): Flow[UpdateItemRequest, UpdateItemResponse, NotUsed] =
    Flow[UpdateItemRequest].mapAsync(parallelism) { updateItemRequest =>
      underlying.updateItem(updateItemRequest)
    }

  def updateTableSource(
      updateTableRequest: UpdateTableRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateTableResponse, NotUsed] =
    Source.single(updateTableRequest).via(updateTableFlow(parallelism))

  def updateTableFlow(parallelism: Int = DefaultParallelism): Flow[UpdateTableRequest, UpdateTableResponse, NotUsed] =
    Flow[UpdateTableRequest].mapAsync(parallelism) { updateTableRequest =>
      underlying.updateTable(updateTableRequest)
    }

  def updateTableReplicaAutoScalingSource(
      updateTableReplicaAutoScalingRequest: UpdateTableReplicaAutoScalingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateTableReplicaAutoScalingResponse, NotUsed] =
    Source.single(updateTableReplicaAutoScalingRequest).via(updateTableReplicaAutoScalingFlow(parallelism))

  def updateTableReplicaAutoScalingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateTableReplicaAutoScalingRequest, UpdateTableReplicaAutoScalingResponse, NotUsed] =
    Flow[UpdateTableReplicaAutoScalingRequest].mapAsync(parallelism) { updateTableReplicaAutoScalingRequest =>
      underlying.updateTableReplicaAutoScaling(updateTableReplicaAutoScalingRequest)
    }

  def updateTimeToLiveSource(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateTimeToLiveResponse, NotUsed] =
    Source.single(updateTimeToLiveRequest).via(updateTimeToLiveFlow(parallelism))

  def updateTimeToLiveFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateTimeToLiveRequest, UpdateTimeToLiveResponse, NotUsed] =
    Flow[UpdateTimeToLiveRequest].mapAsync(parallelism) { updateTimeToLiveRequest =>
      underlying.updateTimeToLive(updateTimeToLiveRequest)
    }

}
