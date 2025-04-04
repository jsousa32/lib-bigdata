package io.github.jsousa32.lib_bigdata.application.controls;

public interface DealboardBuilder {

    static DealboardService builder(String token, String key, String url) {
        return new DefaultDealboardBuilder(token, key, url).build();
    }

    interface Builder {
        DealboardService build();
    }
}
