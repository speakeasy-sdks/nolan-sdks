import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ProjectRunStatusEnum } from "./projectrunstatusenum";


// ProjectStatusResponsePayload
/** 
 * Response format returned by the getRunStatus endpoint
**/
export class ProjectStatusResponsePayload extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=elapsedTime" })
  elapsedTime: number;

  @SpeakeasyMetadata({ data: "json, name=endTime" })
  endTime: Date;

  @SpeakeasyMetadata({ data: "json, name=projectId" })
  projectId: string;

  @SpeakeasyMetadata({ data: "json, name=projectVersion" })
  projectVersion: number;

  @SpeakeasyMetadata({ data: "json, name=runId" })
  runId: string;

  @SpeakeasyMetadata({ data: "json, name=runUrl" })
  runUrl: string;

  @SpeakeasyMetadata({ data: "json, name=startTime" })
  startTime: Date;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status: ProjectRunStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=traceId" })
  traceId: string;
}