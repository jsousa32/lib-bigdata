package io.github.jsousa32.lib_bigdata.application.controls;

import java.util.function.Function;

public interface DealboardEntityWrapper<T> {

    DealboardEntityWrapper<T> map(Function<T, T> mapper);

    T build();

    void create();
}
