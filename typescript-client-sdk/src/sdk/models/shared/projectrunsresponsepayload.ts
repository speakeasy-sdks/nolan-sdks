import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ProjectStatusResponsePayload } from "./projectstatusresponsepayload";


export class ProjectRunsResponsePayload extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=nextPage" })
  nextPage: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=previousPage" })
  previousPage: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=runs", elemType: ProjectStatusResponsePayload })
  runs: ProjectStatusResponsePayload[];

  @SpeakeasyMetadata({ data: "json, name=traceId" })
  traceId: string;
}