package io.github.jsousa32.lib_bigdata.application.controls;

import io.github.jsousa32.lib_bigdata.application.entities.enums.IntegrationScope;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;

final class DefaultDealboardEntityWrapper<T> implements DealboardEntityWrapper<T> {

    private final static String PATH_BASE = "/api/v1/integration/";

    private T entity;

    private UUID registrationTypeId;

    private final HttpEntity<T> httpEntity;

    private final UriComponentsBuilder uri;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultDealboardEntityWrapper(T entity, HttpEntity<String> httpEntity, UriComponentsBuilder uri) {
        this.entity = entity;
        this.httpEntity = new HttpEntity<>(entity, httpEntity.getHeaders());
        this.uri = uri.replacePath(PATH_BASE).replaceQuery(null)
                .pathSegment(Scope.COMPANIES.getLabel())
                .pathSegment(IntegrationScope.getSegment(entity.getClass()));

    }

    @Override
    public DealboardEntityWrapper<T> mutate(Function<T, T> function) {
        this.entity = function.apply(entity);
        return this;
    }

    @Override
    public <R> R map(Function<T, R> function) {
        return function.apply(entity);
    }

    @Override
    public T build() {
        return this.entity;
    }

    @Override
    public DealboardEntityWrapper<T> setRegistrationTypeId(UUID registrationTypeId) {
        this.registrationTypeId = registrationTypeId;
        this.uri.queryParam("registrationTypeId", registrationTypeId);
        return this;
    }

    @Override
    public void create() {
        this.validate();
        restTemplate.exchange(this.uri.toUriString(), HttpMethod.POST, this.httpEntity, Void.class, this.entity);
    }

    private void validate() {
        if (Objects.isNull(this.registrationTypeId)) {
            throw new IllegalArgumentException("Missing required parameter: registrationTypeId");
        }
    }
}
