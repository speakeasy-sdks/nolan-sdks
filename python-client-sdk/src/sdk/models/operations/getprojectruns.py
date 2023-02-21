import dataclasses
from ..shared import projectrunsresponsepayload as shared_projectrunsresponsepayload
from ..shared import projectrunstatus_enum as shared_projectrunstatus_enum
from ..shared import tsoaerrorresponsepayload as shared_tsoaerrorresponsepayload
from typing import Optional


@dataclasses.dataclass
class GetProjectRunsPathParams:
    project_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'projectId', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetProjectRunsQueryParams:
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    offset: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'offset', 'style': 'form', 'explode': True }})
    status_filter: Optional[shared_projectrunstatus_enum.ProjectRunStatusEnum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'statusFilter', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetProjectRunsRequest:
    path_params: GetProjectRunsPathParams = dataclasses.field()
    query_params: GetProjectRunsQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class GetProjectRunsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    project_runs_response_payload: Optional[shared_projectrunsresponsepayload.ProjectRunsResponsePayload] = dataclasses.field(default=None)
    tsoa_error_response_payload: Optional[shared_tsoaerrorresponsepayload.TsoaErrorResponsePayload] = dataclasses.field(default=None)
    