package io.github.jsousa32.lib_bigdata.people.controls;

import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * The Class DefaultPersonService
 *
 * @author João Lucas Silva de Sousa
 * @sincer 11/10/2024
 */
public class DefaultPersonService implements PersonService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultPersonService(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        this.uri = uri;
        this.httpEntity = httpEntity;
    }

    private <T> T execute(String document, Scope scope, Class<T> responseType) {
        this.uri.queryParam("document", document);
        this.uri.path(scope.getDataset());

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }
}
