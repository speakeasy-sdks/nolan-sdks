package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvalidParam
 * Information about an input parameter pass to the API call that could not be parsed.
**/
public class InvalidParam {
    @JsonProperty("dataType")
    public String dataType;
    public InvalidParam withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    
    @JsonProperty("inputCellType")
    public String inputCellType;
    public InvalidParam withInputCellType(String inputCellType) {
        this.inputCellType = inputCellType;
        return this;
    }
    
    @JsonProperty("paramName")
    public String paramName;
    public InvalidParam withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }
    
    @JsonProperty("paramValue")
    public String paramValue;
    public InvalidParam withParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }
    
}
