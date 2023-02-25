<!-- Start SDK Example Usage -->
```go
package main

import (
    "context"
    "log"
    "github.com/speakeasy-sdks/nolan-sdks"
    "github.com/speakeasy-sdks/nolan-sdks/pkg/models/shared"
    "github.com/speakeasy-sdks/nolan-sdks/pkg/models/operations"
)

func main() {
    opts := []sdk.SDKOption{
        sdk.WithSecurity(
            shared.Security{
                BearerAuth: shared.SchemeBearerAuth{
                    Authorization: "Bearer YOUR_BEARER_TOKEN_HERE",
                },
            },
        ),
    }

    s := sdk.New(opts...)
    
    req := operations.CancelRunRequest{
        PathParams: operations.CancelRunPathParams{
            ProjectID: "unde",
            RunID: "deserunt",
        },
    }

    ctx := context.Background()
    res, err := s.CancelRun(ctx, req)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```
<!-- End SDK Example Usage -->