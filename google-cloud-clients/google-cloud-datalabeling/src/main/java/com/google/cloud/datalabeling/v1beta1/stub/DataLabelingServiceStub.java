/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.datalabeling.v1beta1.stub;

import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListAnnotatedDatasetsPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListAnnotationSpecSetsPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListDataItemsPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListDatasetsPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListExamplesPagedResponse;
import static com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient.ListInstructionsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.datalabeling.v1beta1.AnnotatedDataset;
import com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet;
import com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest;
import com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.CreateInstructionMetadata;
import com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest;
import com.google.cloud.datalabeling.v1beta1.DataItem;
import com.google.cloud.datalabeling.v1beta1.Dataset;
import com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest;
import com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest;
import com.google.cloud.datalabeling.v1beta1.Example;
import com.google.cloud.datalabeling.v1beta1.ExportDataOperationMetadata;
import com.google.cloud.datalabeling.v1beta1.ExportDataOperationResponse;
import com.google.cloud.datalabeling.v1beta1.ExportDataRequest;
import com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest;
import com.google.cloud.datalabeling.v1beta1.GetDataItemRequest;
import com.google.cloud.datalabeling.v1beta1.GetDatasetRequest;
import com.google.cloud.datalabeling.v1beta1.GetExampleRequest;
import com.google.cloud.datalabeling.v1beta1.GetInstructionRequest;
import com.google.cloud.datalabeling.v1beta1.ImportDataOperationMetadata;
import com.google.cloud.datalabeling.v1beta1.ImportDataOperationResponse;
import com.google.cloud.datalabeling.v1beta1.ImportDataRequest;
import com.google.cloud.datalabeling.v1beta1.Instruction;
import com.google.cloud.datalabeling.v1beta1.LabelAudioRequest;
import com.google.cloud.datalabeling.v1beta1.LabelImageRequest;
import com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata;
import com.google.cloud.datalabeling.v1beta1.LabelTextRequest;
import com.google.cloud.datalabeling.v1beta1.LabelVideoRequest;
import com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest;
import com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse;
import com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest;
import com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse;
import com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest;
import com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse;
import com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest;
import com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse;
import com.google.cloud.datalabeling.v1beta1.ListExamplesRequest;
import com.google.cloud.datalabeling.v1beta1.ListExamplesResponse;
import com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest;
import com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Data Labeling API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class DataLabelingServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<CreateDatasetRequest, Dataset> createDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: createDatasetCallable()");
  }

  public UnaryCallable<GetDatasetRequest, Dataset> getDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: getDatasetCallable()");
  }

  public UnaryCallable<ListDatasetsRequest, ListDatasetsPagedResponse> listDatasetsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDatasetsPagedCallable()");
  }

  public UnaryCallable<ListDatasetsRequest, ListDatasetsResponse> listDatasetsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDatasetsCallable()");
  }

  public UnaryCallable<DeleteDatasetRequest, Empty> deleteDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDatasetCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          ImportDataRequest, ImportDataOperationResponse, ImportDataOperationMetadata>
      importDataOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: importDataOperationCallable()");
  }

  public UnaryCallable<ImportDataRequest, Operation> importDataCallable() {
    throw new UnsupportedOperationException("Not implemented: importDataCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          ExportDataRequest, ExportDataOperationResponse, ExportDataOperationMetadata>
      exportDataOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: exportDataOperationCallable()");
  }

  public UnaryCallable<ExportDataRequest, Operation> exportDataCallable() {
    throw new UnsupportedOperationException("Not implemented: exportDataCallable()");
  }

  public UnaryCallable<GetDataItemRequest, DataItem> getDataItemCallable() {
    throw new UnsupportedOperationException("Not implemented: getDataItemCallable()");
  }

  public UnaryCallable<ListDataItemsRequest, ListDataItemsPagedResponse>
      listDataItemsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDataItemsPagedCallable()");
  }

  public UnaryCallable<ListDataItemsRequest, ListDataItemsResponse> listDataItemsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDataItemsCallable()");
  }

  public UnaryCallable<GetAnnotatedDatasetRequest, AnnotatedDataset> getAnnotatedDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: getAnnotatedDatasetCallable()");
  }

  public UnaryCallable<ListAnnotatedDatasetsRequest, ListAnnotatedDatasetsPagedResponse>
      listAnnotatedDatasetsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listAnnotatedDatasetsPagedCallable()");
  }

  public UnaryCallable<ListAnnotatedDatasetsRequest, ListAnnotatedDatasetsResponse>
      listAnnotatedDatasetsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAnnotatedDatasetsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<LabelImageRequest, AnnotatedDataset, LabelOperationMetadata>
      labelImageOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: labelImageOperationCallable()");
  }

  public UnaryCallable<LabelImageRequest, Operation> labelImageCallable() {
    throw new UnsupportedOperationException("Not implemented: labelImageCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<LabelVideoRequest, AnnotatedDataset, LabelOperationMetadata>
      labelVideoOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: labelVideoOperationCallable()");
  }

  public UnaryCallable<LabelVideoRequest, Operation> labelVideoCallable() {
    throw new UnsupportedOperationException("Not implemented: labelVideoCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<LabelTextRequest, AnnotatedDataset, LabelOperationMetadata>
      labelTextOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: labelTextOperationCallable()");
  }

  public UnaryCallable<LabelTextRequest, Operation> labelTextCallable() {
    throw new UnsupportedOperationException("Not implemented: labelTextCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<LabelAudioRequest, AnnotatedDataset, LabelOperationMetadata>
      labelAudioOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: labelAudioOperationCallable()");
  }

  public UnaryCallable<LabelAudioRequest, Operation> labelAudioCallable() {
    throw new UnsupportedOperationException("Not implemented: labelAudioCallable()");
  }

  public UnaryCallable<GetExampleRequest, Example> getExampleCallable() {
    throw new UnsupportedOperationException("Not implemented: getExampleCallable()");
  }

  public UnaryCallable<ListExamplesRequest, ListExamplesPagedResponse> listExamplesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listExamplesPagedCallable()");
  }

  public UnaryCallable<ListExamplesRequest, ListExamplesResponse> listExamplesCallable() {
    throw new UnsupportedOperationException("Not implemented: listExamplesCallable()");
  }

  public UnaryCallable<CreateAnnotationSpecSetRequest, AnnotationSpecSet>
      createAnnotationSpecSetCallable() {
    throw new UnsupportedOperationException("Not implemented: createAnnotationSpecSetCallable()");
  }

  public UnaryCallable<GetAnnotationSpecSetRequest, AnnotationSpecSet>
      getAnnotationSpecSetCallable() {
    throw new UnsupportedOperationException("Not implemented: getAnnotationSpecSetCallable()");
  }

  public UnaryCallable<ListAnnotationSpecSetsRequest, ListAnnotationSpecSetsPagedResponse>
      listAnnotationSpecSetsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listAnnotationSpecSetsPagedCallable()");
  }

  public UnaryCallable<ListAnnotationSpecSetsRequest, ListAnnotationSpecSetsResponse>
      listAnnotationSpecSetsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAnnotationSpecSetsCallable()");
  }

  public UnaryCallable<DeleteAnnotationSpecSetRequest, Empty> deleteAnnotationSpecSetCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAnnotationSpecSetCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<CreateInstructionRequest, Instruction, CreateInstructionMetadata>
      createInstructionOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createInstructionOperationCallable()");
  }

  public UnaryCallable<CreateInstructionRequest, Operation> createInstructionCallable() {
    throw new UnsupportedOperationException("Not implemented: createInstructionCallable()");
  }

  public UnaryCallable<GetInstructionRequest, Instruction> getInstructionCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstructionCallable()");
  }

  public UnaryCallable<ListInstructionsRequest, ListInstructionsPagedResponse>
      listInstructionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstructionsPagedCallable()");
  }

  public UnaryCallable<ListInstructionsRequest, ListInstructionsResponse>
      listInstructionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstructionsCallable()");
  }

  public UnaryCallable<DeleteInstructionRequest, Empty> deleteInstructionCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteInstructionCallable()");
  }

  public UnaryCallable<DeleteAnnotatedDatasetRequest, Empty> deleteAnnotatedDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAnnotatedDatasetCallable()");
  }

  @Override
  public abstract void close();
}
