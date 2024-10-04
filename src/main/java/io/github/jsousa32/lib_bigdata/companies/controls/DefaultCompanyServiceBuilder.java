package io.github.jsousa32.lib_bigdata.companies.controls;

import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

public class DefaultCompanyServiceBuilder implements CompanyService.Builder {

    private static final String BASE_URL = "http://192.168.0.125:8080/v1/api/bigdata/company/";

    private static final String ACCESS_TOKEN = "AccessToken";

    private static final String DOCUMENT = "Document";

    private String accessToken;

    private String document;

    @Override
    public DefaultCompanyServiceBuilder accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    @Override
    public DefaultCompanyServiceBuilder document(String document) {
        this.document = document;
        return this;
    }

    @Override
    public CompanyService build() {
        return new DefaultCompanyService(this.generateUri(), this.generateHeaders());
    }

    private UriComponentsBuilder generateUri() {
        return UriComponentsBuilder.fromHttpUrl(BASE_URL);
    }

    private HttpHeaders generateHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add(ACCESS_TOKEN, this.accessToken);
        httpHeaders.add(DOCUMENT, this.document);

        return httpHeaders;
    }
}
