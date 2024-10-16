package io.github.jsousa32.lib_bigdata.application.entities.enums;

public enum Scope {

    COMPANY("company"),

    PERSON("person"),

    ADDRESS("address");

    private final String label;

    Scope(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
