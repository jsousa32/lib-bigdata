package io.github.jsousa32.lib_bigdata.application.entities.dtos;

public class DealboardCredentials {

    private final String token;

    private final String key;

    private final String url;

    public DealboardCredentials(String token, String key, String url) {
        this.token = token;
        this.key = key;
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }
}
