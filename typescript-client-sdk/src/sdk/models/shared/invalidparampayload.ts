import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { InvalidParam } from "./invalidparam";
import { Expose, Type } from "class-transformer";


export class InvalidParamPayload extends SpeakeasyBase {
  @SpeakeasyMetadata({ elemType: InvalidParam })
  @Expose({ name: "invalid" })
  @Type(() => InvalidParam)
  invalid: InvalidParam[];

  @SpeakeasyMetadata()
  @Expose({ name: "notFound" })
  notFound: string[];

  @SpeakeasyMetadata()
  @Expose({ name: "traceId" })
  traceId: string;
}