import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


// RunProjectRequestBody
/** 
 * Request body format for triggering a project run
**/
export class RunProjectRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=dryRun" })
  dryRun?: boolean;

  @SpeakeasyMetadata({ data: "json, name=inputParams" })
  inputParams?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=updateCache" })
  updateCache?: boolean;
}