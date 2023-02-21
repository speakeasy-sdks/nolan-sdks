package .models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RunProjectRequestBody
 * Request body format for triggering a project run
**/
public class RunProjectRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dryRun")
    public Boolean dryRun;
    public RunProjectRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inputParams")
    public java.util.Map<String, Object> inputParams;
    public RunProjectRequestBody withInputParams(java.util.Map<String, Object> inputParams) {
        this.inputParams = inputParams;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updateCache")
    public Boolean updateCache;
    public RunProjectRequestBody withUpdateCache(Boolean updateCache) {
        this.updateCache = updateCache;
        return this;
    }
    
}
