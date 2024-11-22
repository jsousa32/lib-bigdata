package io.github.jsousa32.lib_bigdata.application.controls;

public interface DealboardBuilder {

    static DealboardService builder(String token, String key) {
        return new DefaultDealboardBuilder(token, key).build();
    }

    interface Builder {
        DealboardService build();
    }
}
