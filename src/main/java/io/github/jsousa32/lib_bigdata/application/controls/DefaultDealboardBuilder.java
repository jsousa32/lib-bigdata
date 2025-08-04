package io.github.jsousa32.lib_bigdata.application.controls;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

final class DefaultDealboardBuilder implements DealboardBuilder.Builder {

    private static final String TOKEN = "Token";

    private static final String KEY = "Key";

    private final String token;

    private final String key;

    private final String url;

    public DefaultDealboardBuilder(String token, String key, String url) {
        this.token = token;
        this.key = key;
        this.url = url.concat("/api/v1/integration/");
    }

    @Override
    public DealboardService build() {
        validatedFields();

        return new DefaultDealboardService(this.generateUri(), this.generateHeaders());
    }

    private void validatedFields() {
        if (this.token == null || this.token.isEmpty() || this.token.isBlank()) {
            throw new IllegalArgumentException("Missing required parameter: token");
        }

        if (this.key == null || this.key.isEmpty() || this.key.isBlank()) {
            throw new IllegalArgumentException("Missing required parameter: key");
        }

        if (this.url == null || this.url.isEmpty() || this.url.isBlank()) {
            throw new IllegalArgumentException("Missing required parameter: url");
        }
    }

    private UriComponentsBuilder generateUri() {
        return UriComponentsBuilder.fromHttpUrl(this.url);
    }

    private HttpHeaders generateHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        httpHeaders.add(TOKEN, this.token);
        httpHeaders.add(KEY, this.key);

        return httpHeaders;
    }
}
