# 

<!-- Start SDK Installation -->
## SDK Installation

### NPM

```bash
npm add openapi
```

### Yarn

```bash
yarn add openapi
```
<!-- End SDK Installation -->

## SDK Example Usage
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

<!-- Start SDK Available Operations -->
## SDK Available Operations

### SDK SDK

* `cancelRun` - Cancel a project run.
* `getProjectRuns` - Get the status of the API-triggered runs of a project.
* `getRunStatus` - Get the status of a project run.
* `runProject` - Trigger a run of the latest published version of a project.
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)