import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


// RunProjectRequestBody
/** 
 * Request body format for triggering a project run
**/
export class RunProjectRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "dryRun" })
  dryRun?: boolean;

  @SpeakeasyMetadata()
  @Expose({ name: "inputParams" })
  inputParams?: Record<string, any>;

  @SpeakeasyMetadata()
  @Expose({ name: "updateCache" })
  updateCache?: boolean;
}