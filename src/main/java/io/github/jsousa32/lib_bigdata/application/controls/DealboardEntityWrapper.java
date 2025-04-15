package io.github.jsousa32.lib_bigdata.application.controls;

import org.springframework.http.HttpEntity;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;
import java.util.function.Function;

public interface DealboardEntityWrapper<T> {

    static <T> DealboardEntityWrapper<T> builder(T entity, HttpEntity<String> httpEntity, UriComponentsBuilder uri) {
        return new DefaultDealboardEntityWrapper<>(entity, httpEntity, uri);
    }

    DealboardEntityWrapper<T> mutate(Function<T, T> function);

    <R> R map(Function<T, R> function);

    T build();

    DealboardEntityWrapper<T> setRegistrationTypeId(UUID registrationTypeId);

    void create();
}
