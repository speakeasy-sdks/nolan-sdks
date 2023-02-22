package org.openapis.openapi.models.shared;

import org.openapis.openapi.utils.SpeakeasyMetadata;

public class SchemeBearerAuth {
    @SpeakeasyMetadata("security:name=Authorization")
    public String authorization;
    public SchemeBearerAuth withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
