package io.github.jsousa32.lib_bigdata.application.entities.dtos;

public class DealboardCredentials {

    private final String token;

    private final String key;

    public DealboardCredentials(String token, String key) {
        this.token = token;
        this.key = key;
    }

    public String getToken() {
        return token;
    }

    public String getKey() {
        return key;
    }
}