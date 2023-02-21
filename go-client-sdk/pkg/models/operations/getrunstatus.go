package operations

import (
	"github.com/speakeasy-sdks/nolan-sdks/pkg/models/shared"
)

type GetRunStatusPathParams struct {
	ProjectID string `pathParam:"style=simple,explode=false,name=projectId"`
	RunID     string `pathParam:"style=simple,explode=false,name=runId"`
}

type GetRunStatusRequest struct {
	PathParams GetRunStatusPathParams
}

type GetRunStatusResponse struct {
	ContentType                  string
	ProjectStatusResponsePayload *shared.ProjectStatusResponsePayload
	StatusCode                   int
	TsoaErrorResponsePayload     *shared.TsoaErrorResponsePayload
}
