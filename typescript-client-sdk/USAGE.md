<!-- Start SDK Example Usage -->
```typescript
import { SDK, withSecurity} from "";
import { CancelRunRequest, CancelRunResponse } from "/src/sdk/models/operations";
import { AxiosError } from "axios";

const sdk = new SDK(withSecurity(
  security: {
    bearerAuth: {
      authorization: "Bearer YOUR_BEARER_TOKEN_HERE",
    },
  }
));
    
const req: CancelRunRequest = {
  pathParams: {
    projectId: "unde",
    runId: "deserunt",
  },
};

sdk.cancelRun(req).then((res: CancelRunResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->