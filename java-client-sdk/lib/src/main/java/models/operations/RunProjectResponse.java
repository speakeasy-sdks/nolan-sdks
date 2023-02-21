package .models.operations;



public class RunProjectResponse {
    public String contentType;
    public RunProjectResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.ProjectRunResponsePayload projectRunResponsePayload;
    public RunProjectResponse withProjectRunResponsePayload(.models.shared.ProjectRunResponsePayload projectRunResponsePayload) {
        this.projectRunResponsePayload = projectRunResponsePayload;
        return this;
    }
    
    public Object runProject422ApplicationJSONAnyOf;
    public RunProjectResponse withRunProject422ApplicationJSONAnyOf(Object runProject422ApplicationJSONAnyOf) {
        this.runProject422ApplicationJSONAnyOf = runProject422ApplicationJSONAnyOf;
        return this;
    }
    
    public Integer statusCode;
    public RunProjectResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public .models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload;
    public RunProjectResponse withTsoaErrorResponsePayload(.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload) {
        this.tsoaErrorResponsePayload = tsoaErrorResponsePayload;
        return this;
    }
    
}
