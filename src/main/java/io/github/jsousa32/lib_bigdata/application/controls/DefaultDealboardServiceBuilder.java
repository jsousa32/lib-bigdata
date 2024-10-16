package io.github.jsousa32.lib_bigdata.application.controls;

import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

public class DefaultDealboardServiceBuilder implements DealboardService.Builder {

    private static final String BASE_URL = "http://192.168.0.125:8080/v1/api/bigdata/";

    private static final String TOKEN = "Token";

    private static final String KEY = "Key";

    private String token;

    private String key;

    @Override
    public DealboardService.Builder token(String accessToken) {
        this.token = accessToken;
        return this;
    }

    @Override
    public DealboardService.Builder key(String document) {
        this.key = document;
        return this;
    }

    @Override
    public DealbordFactory build() {
        validatedFields();

        return new DefaultDealboardFactory(this.generateUri(), this.generateHeaders());
    }

    private void validatedFields() {
        if (this.token == null) {
            throw new IllegalArgumentException("Missing required parameter: accessToken");
        }

        if (this.key == null) {
            throw new IllegalArgumentException("Missing required parameter: document");
        }
    }

    private UriComponentsBuilder generateUri() {
        return UriComponentsBuilder.fromHttpUrl(BASE_URL);
    }

    private HttpHeaders generateHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add(TOKEN, this.token);
        httpHeaders.add(KEY, this.key);

        return httpHeaders;
    }
}
