import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ProjectRunStatusEnum } from "./projectrunstatusenum";
import { Expose, Transform } from "class-transformer";


// ProjectStatusResponsePayload
/** 
 * Response format returned by the getRunStatus endpoint
**/
export class ProjectStatusResponsePayload extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "elapsedTime" })
  elapsedTime: number;

  @SpeakeasyMetadata()
  @Expose({ name: "endTime" })
  @Transform(({ value }) => new Date(value), { toClassOnly: true })
  endTime: Date;

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
  @Expose({ name: "runUrl" })
  runUrl: string;

  @SpeakeasyMetadata()
  @Expose({ name: "startTime" })
  @Transform(({ value }) => new Date(value), { toClassOnly: true })
  startTime: Date;

  @SpeakeasyMetadata()
  @Expose({ name: "status" })
  status: ProjectRunStatusEnum;

  @SpeakeasyMetadata()
  @Expose({ name: "traceId" })
  traceId: string;
}