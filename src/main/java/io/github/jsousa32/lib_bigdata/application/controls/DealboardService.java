package io.github.jsousa32.lib_bigdata.application.controls;


/**
 * The Interface DealboardService
 *
 * @author João Lucas Silva de Sousa
 * @sincer 10/10/2024
 */
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
