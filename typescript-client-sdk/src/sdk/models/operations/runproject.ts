import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";
import { Type } from "class-transformer";


export class RunProjectPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=projectId" })
  projectId: string;
}

export class RunProjectRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: RunProjectPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: shared.RunProjectRequestBody;
}

export class RunProjectResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  projectRunResponsePayload?: shared.ProjectRunResponsePayload;

  @SpeakeasyMetadata()
  runProject422ApplicationJSONAnyOf?: any;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  tsoaErrorResponsePayload?: shared.TsoaErrorResponsePayload;
}