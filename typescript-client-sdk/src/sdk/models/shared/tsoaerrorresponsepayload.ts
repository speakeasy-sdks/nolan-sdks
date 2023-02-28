import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


export class TsoaErrorResponsePayload extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "details" })
  details?: string;

  @SpeakeasyMetadata()
  @Expose({ name: "reason" })
  reason: string;

  @SpeakeasyMetadata()
  @Expose({ name: "traceId" })
  traceId: string;
}