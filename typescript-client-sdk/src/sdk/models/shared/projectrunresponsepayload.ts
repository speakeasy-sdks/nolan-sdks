import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


// ProjectRunResponsePayload
/** 
 * Response format returned by the runProject endpoint
**/
export class ProjectRunResponsePayload extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=projectId" })
  projectId: string;

  @SpeakeasyMetadata({ data: "json, name=projectVersion" })
  projectVersion: number;

  @SpeakeasyMetadata({ data: "json, name=runId" })
  runId: string;

  @SpeakeasyMetadata({ data: "json, name=runStatusUrl" })
  runStatusUrl: string;

  @SpeakeasyMetadata({ data: "json, name=runUrl" })
  runUrl: string;

  @SpeakeasyMetadata({ data: "json, name=traceId" })
  traceId: string;
}