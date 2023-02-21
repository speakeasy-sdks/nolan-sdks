package .models.operations;



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
    
    public .models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload;
    public CancelRunResponse withTsoaErrorResponsePayload(.models.shared.TsoaErrorResponsePayload tsoaErrorResponsePayload) {
        this.tsoaErrorResponsePayload = tsoaErrorResponsePayload;
        return this;
    }
    
}
