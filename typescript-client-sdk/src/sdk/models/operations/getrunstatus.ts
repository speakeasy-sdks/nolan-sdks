import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";
import { Type } from "class-transformer";


export class GetRunStatusPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=projectId" })
  projectId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=runId" })
  runId: string;
}

export class GetRunStatusRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: GetRunStatusPathParams;
}

export class GetRunStatusResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  projectStatusResponsePayload?: shared.ProjectStatusResponsePayload;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  tsoaErrorResponsePayload?: shared.TsoaErrorResponsePayload;
}