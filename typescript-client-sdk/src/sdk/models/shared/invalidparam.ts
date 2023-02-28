import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";


// InvalidParam
/** 
 * Information about an input parameter pass to the API call that could not be parsed.
**/
export class InvalidParam extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "dataType" })
  dataType: string;

  @SpeakeasyMetadata()
  @Expose({ name: "inputCellType" })
  inputCellType: string;

  @SpeakeasyMetadata()
  @Expose({ name: "paramName" })
  paramName: string;

  @SpeakeasyMetadata()
  @Expose({ name: "paramValue" })
  paramValue: string;
}