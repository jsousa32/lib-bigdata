package io.github.jsousa32.lib_bigdata.companies.controls;

import io.github.jsousa32.lib_bigdata.companies.entities.enums.Scopes;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.BasicData;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.RegistrationData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class DefaultCompanyService implements CompanyService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultCompanyService(UriComponentsBuilder uri, HttpHeaders headers) {
        this.uri = uri;
        this.httpEntity = new HttpEntity<>(headers);
    }

    @Override
    public RegistrationData registrationData(String document) {
        return execute(document, Scopes.REGISTRATION, RegistrationData.class);
    }

    @Override
    public BasicData basicData(String document) {
        return execute(document, Scopes.BASIC_DATA, BasicData.class);
    }

    private <T> T execute(String document, Scopes scopes, Class<T> responseType) {
        this.uri.queryParam("document", document);
        this.uri.path(scopes.getLabel());

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }
}
