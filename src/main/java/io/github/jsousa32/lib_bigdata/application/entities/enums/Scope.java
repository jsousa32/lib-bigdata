package io.github.jsousa32.lib_bigdata.application.entities.enums;

public enum Scope {

    REGISTRATION("registration_data"),

    BASIC_DATA("basic_data"),

    ECONOMIC_GROUP_KYC("economic_group_kyc"),

    EMPLOYEES_KYC("employees_kyc");

    private final String dataset;

    Scope(String dataset) {
        this.dataset = dataset;
    }

    public String getDataset() {
        return dataset;
    }
}
