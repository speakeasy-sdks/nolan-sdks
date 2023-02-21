import dataclasses
from ..shared import tsoaerrorresponsepayload as shared_tsoaerrorresponsepayload
from typing import Optional


@dataclasses.dataclass
class CancelRunPathParams:
    project_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'projectId', 'style': 'simple', 'explode': False }})
    run_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'runId', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class CancelRunRequest:
    path_params: CancelRunPathParams = dataclasses.field()
    

@dataclasses.dataclass
class CancelRunResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    tsoa_error_response_payload: Optional[shared_tsoaerrorresponsepayload.TsoaErrorResponsePayload] = dataclasses.field(default=None)
    