package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetProjectRunsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Integer limit;
    public GetProjectRunsQueryParams withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Integer offset;
    public GetProjectRunsQueryParams withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=statusFilter")
    public .models.shared.ProjectRunStatusEnum statusFilter;
    public GetProjectRunsQueryParams withStatusFilter(.models.shared.ProjectRunStatusEnum statusFilter) {
        this.statusFilter = statusFilter;
        return this;
    }
    
}
