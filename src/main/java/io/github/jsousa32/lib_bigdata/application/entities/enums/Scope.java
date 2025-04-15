package io.github.jsousa32.lib_bigdata.application.entities.enums;

public enum Scope {

    COMPANY("company"),

    COMPANIES("companies"),

    PERSON("people"),

    ADDRESS("address");

    private final String label;

    Scope(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
