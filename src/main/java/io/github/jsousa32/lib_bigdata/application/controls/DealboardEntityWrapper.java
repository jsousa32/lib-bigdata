package io.github.jsousa32.lib_bigdata.application.controls;

import org.springframework.http.HttpEntity;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.function.Function;

public interface DealboardEntityWrapper<T> {

    static <T> DealboardEntityWrapper<T> builder(T entity, HttpEntity<String> httpEntity, UriComponentsBuilder uri) {
        return new DefaultDealboardEntityWrapper<>(entity, httpEntity, uri);
    }

    DealboardEntityWrapper<T> map(Function<T, T> mapper);

    T build();

    void create();
}
