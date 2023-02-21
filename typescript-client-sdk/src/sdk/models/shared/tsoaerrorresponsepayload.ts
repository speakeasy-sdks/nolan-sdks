import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class TsoaErrorResponsePayload extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=details" })
  details?: string;

  @SpeakeasyMetadata({ data: "json, name=reason" })
  reason: string;

  @SpeakeasyMetadata({ data: "json, name=traceId" })
  traceId: string;
}