<!-- Start SDK Example Usage -->
```typescript
import {
  CancelRunRequest,
  CancelRunResponse 
} from "openapi/dist/sdk/models/operations";

import { AxiosError } from "axios";
import { SDK } from "openapi";

const sdk = new SDK({
  security: {
    bearerAuth: {
      authorization: "Bearer YOUR_BEARER_TOKEN_HERE",
    },
  }
});
    
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