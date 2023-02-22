package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.DateTimeDeserializer;
import org.openapis.openapi.utils.DateTimeSerializer;

/**
 * ProjectStatusResponsePayload
 * Response format returned by the getRunStatus endpoint
**/
public class ProjectStatusResponsePayload {
    @JsonProperty("elapsedTime")
    public Double elapsedTime;
    public ProjectStatusResponsePayload withElapsedTime(Double elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("endTime")
    public OffsetDateTime endTime;
    public ProjectStatusResponsePayload withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }
    
    @JsonProperty("projectId")
    public String projectId;
    public ProjectStatusResponsePayload withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    
    @JsonProperty("projectVersion")
    public Integer projectVersion;
    public ProjectStatusResponsePayload withProjectVersion(Integer projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    
    @JsonProperty("runId")
    public String runId;
    public ProjectStatusResponsePayload withRunId(String runId) {
        this.runId = runId;
        return this;
    }
    
    @JsonProperty("runUrl")
    public String runUrl;
    public ProjectStatusResponsePayload withRunUrl(String runUrl) {
        this.runUrl = runUrl;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("startTime")
    public OffsetDateTime startTime;
    public ProjectStatusResponsePayload withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
    @JsonProperty("status")
    public ProjectRunStatusEnum status;
    public ProjectStatusResponsePayload withStatus(ProjectRunStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("traceId")
    public String traceId;
    public ProjectStatusResponsePayload withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    
}
