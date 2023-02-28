import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ProjectStatusResponsePayload } from "./projectstatusresponsepayload";
import { Expose, Type } from "class-transformer";


export class ProjectRunsResponsePayload extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "nextPage" })
  nextPage: Record<string, any>;

  @SpeakeasyMetadata()
  @Expose({ name: "previousPage" })
  previousPage: Record<string, any>;

  @SpeakeasyMetadata({ elemType: ProjectStatusResponsePayload })
  @Expose({ name: "runs" })
  @Type(() => ProjectStatusResponsePayload)
  runs: ProjectStatusResponsePayload[];

  @SpeakeasyMetadata()
  @Expose({ name: "traceId" })
  traceId: string;
}