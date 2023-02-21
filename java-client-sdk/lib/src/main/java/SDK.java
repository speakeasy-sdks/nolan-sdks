package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import .utils.JSON;
import .utils.SerializedBody;
import .utils.SpeakeasyHTTPClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;


public class SDK {
	public static final String[] SERVERS = {
		"https://app.hex.tech/api/v1",
	};
  		

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private .models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "0.1.0";
	private String _genVersion = "1.3.3";

	public static class Builder {
		private HTTPClient client;
		private .models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		public Builder setSecurity(.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		public SDK build() throws Exception {
			return new SDK(this.client, this.security, this.serverUrl, this.params);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	private SDK(HTTPClient client, .models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = .utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = .utils.Utils.replaceParameters(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}
	}
    
    /**
     * cancelRun - Cancel a project run.
    **/
    public .models.operations.CancelRunResponse cancelRun(.models.operations.CancelRunRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/project/{projectId}/run/{runId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.CancelRunResponse res = new .models.operations.CancelRunResponse() {{
            tsoaErrorResponsePayload = null;
            tsoaErrorResponsePayload = null;
            tsoaErrorResponsePayload = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }

        return res;
    }
    
    /**
     * getProjectRuns - Get the status of the API-triggered runs of a project.
    **/
    public .models.operations.GetProjectRunsResponse getProjectRuns(.models.operations.GetProjectRunsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/project/{projectId}/runs", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GetProjectRunsResponse res = new .models.operations.GetProjectRunsResponse() {{
            projectRunsResponsePayload = null;
            tsoaErrorResponsePayload = null;
            tsoaErrorResponsePayload = null;
            tsoaErrorResponsePayload = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.ProjectRunsResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ProjectRunsResponsePayload.class);
                res.projectRunsResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }

        return res;
    }
    
    /**
     * getRunStatus - Get the status of a project run.
    **/
    public .models.operations.GetRunStatusResponse getRunStatus(.models.operations.GetRunStatusRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/project/{projectId}/run/{runId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.GetRunStatusResponse res = new .models.operations.GetRunStatusResponse() {{
            projectStatusResponsePayload = null;
            tsoaErrorResponsePayload = null;
            tsoaErrorResponsePayload = null;
            tsoaErrorResponsePayload = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.ProjectStatusResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ProjectStatusResponsePayload.class);
                res.projectStatusResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }

        return res;
    }
    
    /**
     * runProject - Trigger a run of the latest published version of a project.
    **/
    public .models.operations.RunProjectResponse runProject(.models.operations.RunProjectRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/project/{projectId}/run", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        .models.operations.RunProjectResponse res = new .models.operations.RunProjectResponse() {{
            projectRunResponsePayload = null;
            tsoaErrorResponsePayload = null;
            tsoaErrorResponsePayload = null;
            runProject422ApplicationJSONAnyOf = null;
            tsoaErrorResponsePayload = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.ProjectRunResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ProjectRunResponsePayload.class);
                res.projectRunResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.runProject422ApplicationJSONAnyOf = out;
            }
        }
        else if (httpRes.statusCode() == 503) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                .models.shared.TsoaErrorResponsePayload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.TsoaErrorResponsePayload.class);
                res.tsoaErrorResponsePayload = out;
            }
        }

        return res;
    }
}