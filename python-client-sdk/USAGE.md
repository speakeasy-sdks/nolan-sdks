<!-- Start SDK Example Usage -->
```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK()
s.config_security(
    security=shared.Security(
        bearer_auth=shared.SchemeBearerAuth(
            authorization="Bearer YOUR_BEARER_TOKEN_HERE",
        ),
    )
)
   
req = operations.CancelRunRequest(
    path_params=operations.CancelRunPathParams(
        project_id="unde",
        run_id="deserunt",
    ),
)
    
res = s.cancel_run(req)

if res.status_code == 200:
    # handle response
```
<!-- End SDK Example Usage -->