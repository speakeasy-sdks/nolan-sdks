package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.SpeakeasyMetadata;

public class RunProjectRequest {
    public RunProjectPathParams pathParams;
    public RunProjectRequest withPathParams(RunProjectPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public org.openapis.openapi.models.shared.RunProjectRequestBody request;
    public RunProjectRequest withRequest(org.openapis.openapi.models.shared.RunProjectRequestBody request) {
        this.request = request;
        return this;
    }
    
}
