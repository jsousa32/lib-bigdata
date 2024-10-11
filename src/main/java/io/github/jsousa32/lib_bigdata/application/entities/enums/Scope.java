package io.github.jsousa32.lib_bigdata.application.entities.enums;

public enum Scope {

    REGISTRATION("registration_data"),

    BASIC_DATA("basic_data"),

    ECONOMIC_GROUP_KYC("economic_group_kyc"),

    EMPLOYEES_KYC("employees_kyc"),

    KYC("kyc"),

    LAWSUITS_DISTRIBUTION_DATA("lawsuits_distribution_data"),

    OWNERS_LAWSUITS("owners_lawsuits"),

    OWNERS_LAWSUITS_DISTRIBUTION_DATA("owners_lawsuits_distribution_data"),

    PROCESSES("processes"),

    COLLECTIONS("collections"),

    FAMILY_LAWSUITS_DISTRIBUTION_DATA("family_lawsuits_distribution_data"),

    FINANCIAL_RISK("financial_risk"),

    FIRST_LEVEL_RELATIVES_LAWSUITS_DATA("first_level_relatives_lawsuit_data"),

    GOVERNMENT_DEBTORS("government_debtors"),

    INDEBTEDNESS_QUESTION("indebtedness_question"),

    OCCUPATION_DATA("occupation_data"),

    UNIVERSITY_STUNDENT_DATA("university_student_data"),

    VEHICLES("vehicles");

    private final String dataset;

    Scope(String dataset) {
        this.dataset = dataset;
    }

    public String getDataset() {
        return dataset;
    }
}
