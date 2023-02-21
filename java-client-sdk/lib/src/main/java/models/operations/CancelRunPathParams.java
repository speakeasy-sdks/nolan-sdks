package .models.operations;

import .utils.SpeakeasyMetadata;

public class CancelRunPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=projectId")
    public String projectId;
    public CancelRunPathParams withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=runId")
    public String runId;
    public CancelRunPathParams withRunId(String runId) {
        this.runId = runId;
        return this;
    }
    
}
