package org.openapis.openapi.models.operations;



public class GetRunStatusResponse {
    public String contentType;
    public GetRunStatusResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public org.openapis.openapi.models.shared.ProjectStatusResponsePayload projectStatusResponsePayload;
    public GetRunStatusResponse withProjectStatusResponsePayload(org.openapis.openapi.models.shared.ProjectStatusResponsePayload projectStatusResponsePayload) {
        this.projectStatusResponsePayload = projectStatusResponsePayload;
        return this;
    }
    
    public Integer statusCode;
    public GetRunStatusResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public org.openapis.openapi.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload;
    public GetRunStatusResponse withTsoaErrorResponsePayload(org.openapis.openapi.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload) {
        this.tsoaErrorResponsePayload = tsoaErrorResponsePayload;
        return this;
    }
    
}
