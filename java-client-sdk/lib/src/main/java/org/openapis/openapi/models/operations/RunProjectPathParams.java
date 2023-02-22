package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.SpeakeasyMetadata;

public class RunProjectPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=projectId")
    public String projectId;
    public RunProjectPathParams withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
