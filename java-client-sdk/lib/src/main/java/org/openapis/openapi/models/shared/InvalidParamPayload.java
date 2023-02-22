package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvalidParamPayload {
    @JsonProperty("invalid")
    public InvalidParam[] invalid;
    public InvalidParamPayload withInvalid(InvalidParam[] invalid) {
        this.invalid = invalid;
        return this;
    }
    
    @JsonProperty("notFound")
    public String[] notFound;
    public InvalidParamPayload withNotFound(String[] notFound) {
        this.notFound = notFound;
        return this;
    }
    
    @JsonProperty("traceId")
    public String traceId;
    public InvalidParamPayload withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    
}
