package io.github.jsousa32.lib_bigdata.application.entities.enums;

/**
 * The Enum Scope
 *
 * @author João Lucas Silva de Sousa
 * @sincer 11/10/2024
 */
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
