package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRunStatusPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=projectId")
    public String projectId;
    public GetRunStatusPathParams withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=runId")
    public String runId;
    public GetRunStatusPathParams withRunId(String runId) {
        this.runId = runId;
        return this;
    }
    
}
