package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.SpeakeasyMetadata;

public class GetProjectRunsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=projectId")
    public String projectId;
    public GetProjectRunsPathParams withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
}
