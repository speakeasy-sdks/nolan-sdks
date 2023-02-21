import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class CancelRunPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=projectId" })
  projectId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=runId" })
  runId: string;
}

export class CancelRunRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: CancelRunPathParams;
}

export class CancelRunResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  tsoaErrorResponsePayload?: shared.TsoaErrorResponsePayload;
}