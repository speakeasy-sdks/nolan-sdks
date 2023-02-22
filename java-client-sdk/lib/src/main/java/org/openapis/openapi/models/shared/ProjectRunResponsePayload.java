package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectRunResponsePayload
 * Response format returned by the runProject endpoint
**/
public class ProjectRunResponsePayload {
    @JsonProperty("projectId")
    public String projectId;
    public ProjectRunResponsePayload withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @JsonProperty("projectVersion")
    public Integer projectVersion;
    public ProjectRunResponsePayload withProjectVersion(Integer projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    
    @JsonProperty("runId")
    public String runId;
    public ProjectRunResponsePayload withRunId(String runId) {
        this.runId = runId;
        return this;
    }
    
    @JsonProperty("runStatusUrl")
    public String runStatusUrl;
    public ProjectRunResponsePayload withRunStatusUrl(String runStatusUrl) {
        this.runStatusUrl = runStatusUrl;
        return this;
    }
    
    @JsonProperty("runUrl")
    public String runUrl;
    public ProjectRunResponsePayload withRunUrl(String runUrl) {
        this.runUrl = runUrl;
        return this;
    }
    
    @JsonProperty("traceId")
    public String traceId;
    public ProjectRunResponsePayload withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    
}
