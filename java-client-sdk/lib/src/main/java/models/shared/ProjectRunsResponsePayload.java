package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectRunsResponsePayload {
    @JsonProperty("nextPage")
    public java.util.Map<String, Object> nextPage;
    public ProjectRunsResponsePayload withNextPage(java.util.Map<String, Object> nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    
    @JsonProperty("previousPage")
    public java.util.Map<String, Object> previousPage;
    public ProjectRunsResponsePayload withPreviousPage(java.util.Map<String, Object> previousPage) {
        this.previousPage = previousPage;
        return this;
    }
    
    @JsonProperty("runs")
    public ProjectStatusResponsePayload[] runs;
    public ProjectRunsResponsePayload withRuns(ProjectStatusResponsePayload[] runs) {
        this.runs = runs;
        return this;
    }
    
    @JsonProperty("traceId")
    public String traceId;
    public ProjectRunsResponsePayload withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    
}
