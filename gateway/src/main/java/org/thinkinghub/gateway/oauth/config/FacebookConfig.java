package org.thinkinghub.gateway.oauth.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "facebook")
@Getter
public class FacebookConfig extends GatewayOAuthConfig{
    private String apiVersion;
}
