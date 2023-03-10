import * as utils from "../internal/utils";
import * as operations from "./models/operations";
import * as shared from "./models/shared";
import axios, { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";
import { plainToInstance } from "class-transformer";

export const ServerList = [
	"https://app.hex.tech/api/v1",
] as const;



export type SDKProps = {
  defaultClient?: AxiosInstance;

  security?: shared.Security;

  serverUrl?: string;
}


export class SDK {

  public _defaultClient: AxiosInstance;
  public _securityClient: AxiosInstance;
  public _serverURL: string;
  private _language = "typescript";
  private _sdkVersion = "0.3.2";
  private _genVersion = "1.5.4";

  constructor(props: SDKProps) {
    this._serverURL = props.serverUrl ?? ServerList[0];

    this._defaultClient = props.defaultClient ?? axios.create({ baseURL: this._serverURL });
    if (props.security) {
      let security: shared.Security = props.security;
      if (!(props.security instanceof utils.SpeakeasyBase))
        security = new shared.Security(props.security);
      this._securityClient = utils.createSecurityClient(
        this._defaultClient,
        security
      );
    } else {
      this._securityClient = this._defaultClient;
    }
  }
  
  /**
   * cancelRun - Cancel a project run.
  **/
  cancelRun(
    req: operations.CancelRunRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.CancelRunResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.CancelRunRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/project/{projectId}/run/{runId}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...config?.headers};
    headers["user-agent"] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;
    
    const r = client.request({
      url: url,
      method: "delete",
      headers: headers,
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.CancelRunResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 403:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 422:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
        }

        return res;
      })
  }

  /**
   * getProjectRuns - Get the status of the API-triggered runs of a project.
  **/
  getProjectRuns(
    req: operations.GetProjectRunsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetProjectRunsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetProjectRunsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/project/{projectId}/runs", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...config?.headers};
    const queryParams: string = utils.serializeQueryParams(req.queryParams);
    headers["user-agent"] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;
    
    const r = client.request({
      url: url + queryParams,
      method: "get",
      headers: headers,
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetProjectRunsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.projectRunsResponsePayload = plainToInstance(
                shared.ProjectRunsResponsePayload,
                httpRes?.data as shared.ProjectRunsResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 403:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 422:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
        }

        return res;
      })
  }

  /**
   * getRunStatus - Get the status of a project run.
  **/
  getRunStatus(
    req: operations.GetRunStatusRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetRunStatusResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetRunStatusRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/project/{projectId}/run/{runId}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...config?.headers};
    headers["user-agent"] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;
    
    const r = client.request({
      url: url,
      method: "get",
      headers: headers,
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetRunStatusResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.projectStatusResponsePayload = plainToInstance(
                shared.ProjectStatusResponsePayload,
                httpRes?.data as shared.ProjectStatusResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 403:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 422:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
        }

        return res;
      })
  }

  /**
   * runProject - Trigger a run of the latest published version of a project.
  **/
  runProject(
    req: operations.RunProjectRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.RunProjectResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.RunProjectRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/project/{projectId}/run", req.pathParams);

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req);
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...reqBodyHeaders, ...config?.headers};
    headers["user-agent"] = `speakeasy-sdk/${this._language} ${this._sdkVersion} ${this._genVersion}`;
    
    const r = client.request({
      url: url,
      method: "post",
      headers: headers,
      data: reqBody, 
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.RunProjectResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 201:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.projectRunResponsePayload = plainToInstance(
                shared.ProjectRunResponsePayload,
                httpRes?.data as shared.ProjectRunResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 400:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 403:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 422:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.runProject422ApplicationJSONAnyOf = plainToInstance(
                ,
                httpRes?.data as ,
                { excludeExtraneousValues: true }
              );
            }
            break;
          case httpRes?.status == 503:
            if (utils.matchContentType(contentType, `application/json`)) {
              res.tsoaErrorResponsePayload = plainToInstance(
                shared.TsoaErrorResponsePayload,
                httpRes?.data as shared.TsoaErrorResponsePayload,
                { excludeExtraneousValues: true }
              );
            }
            break;
        }

        return res;
      })
  }

}