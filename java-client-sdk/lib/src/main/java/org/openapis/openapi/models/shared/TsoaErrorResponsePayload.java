package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TsoaErrorResponsePayload {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public String details;
    public TsoaErrorResponsePayload withDetails(String details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("reason")
    public String reason;
    public TsoaErrorResponsePayload withReason(String reason) {
        this.reason = reason;
        return this;
    }
    
    @JsonProperty("traceId")
    public String traceId;
    public TsoaErrorResponsePayload withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    
}
