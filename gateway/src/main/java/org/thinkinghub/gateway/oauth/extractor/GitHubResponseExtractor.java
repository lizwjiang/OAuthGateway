package org.thinkinghub.gateway.oauth.extractor;

import org.springframework.stereotype.Component;
import org.thinkinghub.gateway.oauth.entity.ServiceType;

@Component("GitHub")
public class GitHubResponseExtractor extends BaseResponseExtractor {
    @Override
    ServiceType getServiceType() {
        return ServiceType.GITHUB;
    }

    @Override
    String getUserIdFieldName() {
        return "id";
    }

    @Override
    String getNickNameFieldName() {
        return "name";
    }

    @Override
    String getHeadImageUrlFieldName() {
        return "avatar_url";
    }

    @Override
    String getErrorCodeFieldName() {
        //there is no error code return
        return "";
    }

    @Override
    String getErrorDescFieldName() {
        return "message";
    }
}
