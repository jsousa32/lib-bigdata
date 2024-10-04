package io.github.jsousa32.lib_bigdata.companies.controls;

import io.github.jsousa32.lib_bigdata.companies.entities.enums.Scopes;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.RegistrationData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class DefaultCompanyService implements CompanyService {

    private final UriComponentsBuilder uri;

    private final HttpHeaders httpHeaders;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultCompanyService(UriComponentsBuilder uri, HttpHeaders headers) {
        this.uri = uri;
        this.httpHeaders = headers;
    }

    @Override
    public RegistrationData registrationData(String document) {
        HttpEntity<String> httpEntity = new HttpEntity<>(this.httpHeaders);

        this.uri.queryParam("document", document);
        this.uri.path(Scopes.REGISTRATION.getLabel());

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, httpEntity, RegistrationData.class).getBody();
    }
}
