package io.github.jsousa32.lib_bigdata.companies.entities.enums;

public enum Scopes {

    REGISTRATION("registration"),

    BASIC_DATA("basic");


    private final String label;

    Scopes(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
