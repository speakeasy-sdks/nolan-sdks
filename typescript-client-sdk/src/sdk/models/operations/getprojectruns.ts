import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";
import { Type } from "class-transformer";


export class GetProjectRunsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=projectId" })
  projectId: string;
}

export class GetProjectRunsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=statusFilter" })
  statusFilter?: shared.ProjectRunStatusEnum;
}

export class GetProjectRunsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: GetProjectRunsPathParams;

  @SpeakeasyMetadata()
  queryParams: GetProjectRunsQueryParams;
}

export class GetProjectRunsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  projectRunsResponsePayload?: shared.ProjectRunsResponsePayload;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  tsoaErrorResponsePayload?: shared.TsoaErrorResponsePayload;
}