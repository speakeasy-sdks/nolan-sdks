import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { InvalidParam } from "./invalidparam";


export class InvalidParamPayload extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=invalid", elemType: InvalidParam })
  invalid: InvalidParam[];

  @SpeakeasyMetadata({ data: "json, name=notFound" })
  notFound: string[];

  @SpeakeasyMetadata({ data: "json, name=traceId" })
  traceId: string;
}