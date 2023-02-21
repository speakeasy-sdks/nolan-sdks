<!-- Start SDK Example Usage -->
```java
package hello.world;

import .SDK;
import .models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK.Builder builder = SDK.builder();

            builder.setSecurity(
                new Security() {{
                    bearerAuth = new SchemeBearerAuth() {{
                        authorization = "Bearer YOUR_BEARER_TOKEN_HERE";
                    }};
                }}
            );

            SDK sdk = builder.build();

            CancelRunRequest req = new CancelRunRequest() {{
                pathParams = new CancelRunPathParams() {{
                    projectId = "unde";
                    runId = "deserunt";
                }};
            }};

            CancelRunResponse res = sdk.cancelRun(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->