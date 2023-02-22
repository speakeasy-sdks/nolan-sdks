package org.openapis.openapi.models.operations;



public class CancelRunResponse {
    public String contentType;
    public CancelRunResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public CancelRunResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public org.openapis.openapi.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload;
    public CancelRunResponse withTsoaErrorResponsePayload(org.openapis.openapi.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload) {
        this.tsoaErrorResponsePayload = tsoaErrorResponsePayload;
        return this;
    }
    
}
