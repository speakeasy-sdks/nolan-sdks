import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


// ProjectRunResponsePayload
/** 
 * Response format returned by the runProject endpoint
**/
export class ProjectRunResponsePayload extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "projectId" })
  projectId: string;

  @SpeakeasyMetadata()
  @Expose({ name: "projectVersion" })
  projectVersion: number;

  @SpeakeasyMetadata()
  @Expose({ name: "runId" })
  runId: string;

  @SpeakeasyMetadata()
  @Expose({ name: "runStatusUrl" })
  runStatusUrl: string;

  @SpeakeasyMetadata()
  @Expose({ name: "runUrl" })
  runUrl: string;

  @SpeakeasyMetadata()
  @Expose({ name: "traceId" })
  traceId: string;
}