package org.openapis.openapi.models.operations;



public class GetProjectRunsResponse {
    public String contentType;
    public GetProjectRunsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public org.openapis.openapi.models.shared.ProjectRunsResponsePayload projectRunsResponsePayload;
    public GetProjectRunsResponse withProjectRunsResponsePayload(org.openapis.openapi.models.shared.ProjectRunsResponsePayload projectRunsResponsePayload) {
        this.projectRunsResponsePayload = projectRunsResponsePayload;
        return this;
    }
    
    public Integer statusCode;
    public GetProjectRunsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public org.openapis.openapi.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload;
    public GetProjectRunsResponse withTsoaErrorResponsePayload(org.openapis.openapi.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload) {
        this.tsoaErrorResponsePayload = tsoaErrorResponsePayload;
        return this;
    }
    
}
