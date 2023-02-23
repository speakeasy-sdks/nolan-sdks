
import requests
from . import utils
from sdk.models import operations, shared
from typing import Any, Optional

SERVERS = [
	"https://app.hex.tech/api/v1",
]


class SDK:
    

    _client: requests.Session
    _security_client: requests.Session
    _security: shared.Security
    _server_url: str = SERVERS[0]
    _language: str = "python"
    _sdk_version: str = "0.2.1"
    _gen_version: str = "1.4.8"

    def __init__(self) -> None:
        self._client = requests.Session()
        self._security_client = requests.Session()
        


    def config_server_url(self, server_url: str, params: dict[str, str]):
        if params is not None:
            self._server_url = utils.replace_parameters(server_url, params)
        else:
            self._server_url = server_url

        
    

    def config_client(self, client: requests.Session):
        self._client = client
        
        if self._security is not None:
            self._security_client = utils.configure_security_client(self._client, self._security)
        
    

    def config_security(self, security: shared.Security):
        self._security = security
        self._security_client = utils.configure_security_client(self._client, security)
        
    
    
    def cancel_run(self, request: operations.CancelRunRequest) -> operations.CancelRunResponse:
        r"""Cancel a project run.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/project/{projectId}/run/{runId}", request.path_params)
        
        headers = {}
        headers["user-agent"] = f"speakeasy-sdk/{self._language} {self._sdk_version} {self._gen_version}"
        
        client = self._security_client
        
        r = client.request("DELETE", url, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.CancelRunResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out
        elif r.status_code == 403:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out
        elif r.status_code == 422:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out

        return res

    def get_project_runs(self, request: operations.GetProjectRunsRequest) -> operations.GetProjectRunsResponse:
        r"""Get the status of the API-triggered runs of a project.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/project/{projectId}/runs", request.path_params)
        
        headers = {}
        query_params = utils.get_query_params(request.query_params)
        headers["user-agent"] = f"speakeasy-sdk/{self._language} {self._sdk_version} {self._gen_version}"
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.GetProjectRunsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ProjectRunsResponsePayload])
                res.project_runs_response_payload = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out
        elif r.status_code == 403:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out
        elif r.status_code == 422:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out

        return res

    def get_run_status(self, request: operations.GetRunStatusRequest) -> operations.GetRunStatusResponse:
        r"""Get the status of a project run.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/project/{projectId}/run/{runId}", request.path_params)
        
        headers = {}
        headers["user-agent"] = f"speakeasy-sdk/{self._language} {self._sdk_version} {self._gen_version}"
        
        client = self._security_client
        
        r = client.request("GET", url, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.GetRunStatusResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ProjectStatusResponsePayload])
                res.project_status_response_payload = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out
        elif r.status_code == 403:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out
        elif r.status_code == 422:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out

        return res

    def run_project(self, request: operations.RunProjectRequest) -> operations.RunProjectResponse:
        r"""Trigger a run of the latest published version of a project.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/project/{projectId}/run", request.path_params)
        
        headers = {}
        req_content_type, data, json, files = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        headers["user-agent"] = f"speakeasy-sdk/{self._language} {self._sdk_version} {self._gen_version}"
        
        client = self._security_client
        
        r = client.request("POST", url, data=data, json=json, files=files, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.RunProjectResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ProjectRunResponsePayload])
                res.project_run_response_payload = out
        elif r.status_code == 400:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out
        elif r.status_code == 403:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out
        elif r.status_code == 422:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[Any])
                res.run_project_422_application_json_any_of = out
        elif r.status_code == 503:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.TsoaErrorResponsePayload])
                res.tsoa_error_response_payload = out

        return res

    