package io.github.jsousa32.lib_bigdata.application.entities.enums;

public enum Scope {

    REGISTRATION("registration_data"),

    BASIC_DATA("basic_data");


    private final String dataset;

    Scope(String dataset) {
        this.dataset = dataset;
    }

    public String getDataset() {
        return dataset;
    }
}
