package org.openapis.openapi.models.operations;



public class GetProjectRunsRequest {
    public GetProjectRunsPathParams pathParams;
    public GetProjectRunsRequest withPathParams(GetProjectRunsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetProjectRunsQueryParams queryParams;
    public GetProjectRunsRequest withQueryParams(GetProjectRunsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
