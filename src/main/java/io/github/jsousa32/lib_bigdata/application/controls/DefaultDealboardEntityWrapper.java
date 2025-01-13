package io.github.jsousa32.lib_bigdata.application.controls;

import io.github.jsousa32.lib_bigdata.application.entities.enums.IntegrationScope;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.function.Function;

final class DefaultDealboardEntityWrapper<T> implements DealboardEntityWrapper<T> {

    private final static String PATH_BASE = "/api/v1/integration/";

    private T entity;

    private final HttpEntity<T> httpEntity;

    private final String uri;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultDealboardEntityWrapper(T entity, HttpEntity<String> httpEntity, UriComponentsBuilder uri) {
        this.entity = entity;
        this.httpEntity = new HttpEntity<>(entity, httpEntity.getHeaders());
        this.uri = uri.replacePath(PATH_BASE).replaceQuery(null)
                .pathSegment(Scope.COMPANIES.getLabel())
                .pathSegment(IntegrationScope.getSegment(entity.getClass()))
                .toUriString();
    }

    @Override
    public DealboardEntityWrapper<T> map(Function<T, T> function) {
        this.entity = function.apply(entity);
        return this;
    }

    @Override
    public T build() {
        return this.entity;
    }

    @Override
    public void create() {
        restTemplate.exchange(this.uri, HttpMethod.POST, this.httpEntity, Void.class, this.entity);
    }
}
