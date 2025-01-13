package io.github.jsousa32.lib_bigdata.application.controls;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

final class DefaultDealboardBuilder implements DealboardBuilder.Builder {

    private static final String BASE_URL = "http://192.168.0.105:8080/api/v1/integration/";

    private static final String TOKEN = "Token";

    private static final String KEY = "Key";

    private final String token;

    private final String key;

    public DefaultDealboardBuilder(String token, String key) {
        this.token = token;
        this.key = key;
    }

    @Override
    public DealboardService build() {
        validatedFields();

        return new DefaultDealboardService(this.generateUri(), this.generateHeaders());
    }

    private void validatedFields() {
        if (this.token == null || this.token.isEmpty() || this.token.isBlank()) {
            throw new IllegalArgumentException("Missing required parameter: accessToken");
        }

        if (this.key == null || this.key.isEmpty() || this.key.isBlank()) {
            throw new IllegalArgumentException("Missing required parameter: document");
        }
    }

    private UriComponentsBuilder generateUri() {
        return UriComponentsBuilder.fromHttpUrl(BASE_URL);
    }

    private HttpHeaders generateHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        httpHeaders.add(TOKEN, this.token);
        httpHeaders.add(KEY, this.key);

        return httpHeaders;
    }
}
