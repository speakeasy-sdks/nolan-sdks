package .models.operations;

import .utils.SpeakeasyMetadata;

public class RunProjectPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=projectId")
    public String projectId;
    public RunProjectPathParams withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
