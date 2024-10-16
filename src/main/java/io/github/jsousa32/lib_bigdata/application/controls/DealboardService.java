package io.github.jsousa32.lib_bigdata.application.controls;

public interface DealboardService {

    static Builder builder() {
        return new DefaultDealboardServiceBuilder();
    }

    interface Builder {
        Builder token(String token);

        Builder key(String key);

        DealbordFactory build();
    }
}
