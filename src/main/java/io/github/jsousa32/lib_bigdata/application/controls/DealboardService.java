package io.github.jsousa32.lib_bigdata.application.controls;

public interface DealboardService {

    static Builder builder() {
        return new DefaultDealboardServiceBuilder();
    }

    interface Builder {
        Builder token(String accessToken);

        Builder key(String document);

        DealbordFactory build();
    }
}
