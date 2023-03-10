package org.openapis.openapi.models.shared;

import org.openapis.openapi.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer")
    public SchemeBearerAuth bearerAuth;
    public Security withBearerAuth(SchemeBearerAuth bearerAuth) {
        this.bearerAuth = bearerAuth;
        return this;
    }
    
}
