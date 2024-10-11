package io.github.jsousa32.lib_bigdata.application.controls;

public interface DealboardService {

    static Builder builder() {
        return new DefaultDealboardServiceBuilder();
    }

    interface Builder {
        Builder accessToken(String accessToken);

        Builder document(String document);

        DealbordFactory build();
    }
}
