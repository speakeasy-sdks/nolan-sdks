import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


// InvalidParam
/** 
 * Information about an input parameter pass to the API call that could not be parsed.
**/
export class InvalidParam extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=dataType" })
  dataType: string;

  @SpeakeasyMetadata({ data: "json, name=inputCellType" })
  inputCellType: string;

  @SpeakeasyMetadata({ data: "json, name=paramName" })
  paramName: string;

  @SpeakeasyMetadata({ data: "json, name=paramValue" })
  paramValue: string;
}