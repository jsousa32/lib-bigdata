package io.github.jsousa32.lib_bigdata.application.entities.enums;

public enum Domain {

    BIGDATA("bigdata"),

    CUSTOM("custom");

    private final String label;

    Domain(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
