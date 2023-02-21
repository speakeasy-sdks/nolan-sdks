package .models.operations;

import .utils.SpeakeasyMetadata;

public class RunProjectRequest {
    public RunProjectPathParams pathParams;
    public RunProjectRequest withPathParams(RunProjectPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.RunProjectRequestBody request;
    public RunProjectRequest withRequest(.models.shared.RunProjectRequestBody request) {
        this.request = request;
        return this;
    }
    
}
