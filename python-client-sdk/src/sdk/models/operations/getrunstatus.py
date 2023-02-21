import dataclasses
from ..shared import projectstatusresponsepayload as shared_projectstatusresponsepayload
from ..shared import tsoaerrorresponsepayload as shared_tsoaerrorresponsepayload
from typing import Optional


@dataclasses.dataclass
class GetRunStatusPathParams:
    project_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'projectId', 'style': 'simple', 'explode': False }})
    run_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'runId', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetRunStatusRequest:
    path_params: GetRunStatusPathParams = dataclasses.field()
    

@dataclasses.dataclass
class GetRunStatusResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    project_status_response_payload: Optional[shared_projectstatusresponsepayload.ProjectStatusResponsePayload] = dataclasses.field(default=None)
    tsoa_error_response_payload: Optional[shared_tsoaerrorresponsepayload.TsoaErrorResponsePayload] = dataclasses.field(default=None)
    