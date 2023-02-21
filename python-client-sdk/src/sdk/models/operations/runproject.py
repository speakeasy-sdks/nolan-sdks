import dataclasses
from ..shared import projectrunresponsepayload as shared_projectrunresponsepayload
from ..shared import runprojectrequestbody as shared_runprojectrequestbody
from ..shared import tsoaerrorresponsepayload as shared_tsoaerrorresponsepayload
from typing import Any, Optional


@dataclasses.dataclass
class RunProjectPathParams:
    project_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'projectId', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class RunProjectRequest:
    path_params: RunProjectPathParams = dataclasses.field()
    request: Optional[shared_runprojectrequestbody.RunProjectRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    

@dataclasses.dataclass
class RunProjectResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    project_run_response_payload: Optional[shared_projectrunresponsepayload.ProjectRunResponsePayload] = dataclasses.field(default=None)
    run_project_422_application_json_any_of: Optional[Any] = dataclasses.field(default=None)
    tsoa_error_response_payload: Optional[shared_tsoaerrorresponsepayload.TsoaErrorResponsePayload] = dataclasses.field(default=None)
    