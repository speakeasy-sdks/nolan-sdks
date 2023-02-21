package .models.operations;



public class GetProjectRunsResponse {
    public String contentType;
    public GetProjectRunsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.ProjectRunsResponsePayload projectRunsResponsePayload;
    public GetProjectRunsResponse withProjectRunsResponsePayload(.models.shared.ProjectRunsResponsePayload projectRunsResponsePayload) {
        this.projectRunsResponsePayload = projectRunsResponsePayload;
        return this;
    }
    
    public Integer statusCode;
    public GetProjectRunsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public .models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload;
    public GetProjectRunsResponse withTsoaErrorResponsePayload(.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload) {
        this.tsoaErrorResponsePayload = tsoaErrorResponsePayload;
        return this;
    }
    
}
