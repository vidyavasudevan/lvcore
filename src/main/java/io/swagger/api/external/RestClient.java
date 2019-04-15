package io.swagger.api.external;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ConfigurationProperties
public class RestClient {
    RestTemplate restTemplate = new RestTemplate();
    String fbBaseUrl = "https://graph.facebook.com/v3.2";

    @Value("${external.fb.client.id}")
    String fbClientId;

    @Value("${external.fb.client.secret}")
    String fbCs;

    public String getFbAccessToken(String code, String state) {
        String path = "client_id="
        ResponseEntity<String> response
                = restTemplate.getForEntity(fbBaseUrl + "/1", String.class);
    }
}
