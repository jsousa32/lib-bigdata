package io.github.jsousa32.lib_bigdata.application.entities.enums;

public enum Dataset {

    REGISTRATION("registration-data"),

    BASIC_DATA("basic-data"),

    ECONOMIC_GROUP_KYC("economic-group-kyc"),

    EMPLOYEES_KYC("employees-kyc"),

    KYC("kyc"),

    LAWSUITS_DISTRIBUTION_DATA("lawsuits-distribution-data"),

    OWNERS_LAWSUITS("owners-lawsuits"),

    OWNERS_LAWSUITS_DISTRIBUTION_DATA("owners-lawsuits-distribution-data"),

    PROCESSES("processes"),

    COLLECTIONS("collections"),

    FAMILY_LAWSUITS_DISTRIBUTION_DATA("family-lawsuits-distribution-data"),

    FINANCIAL_RISK("financial-risk"),

    FIRST_LEVEL_RELATIVES_LAWSUITS_DATA("first-level-relatives-lawsuit-data"),

    GOVERNMENT_DEBTORS("government-debtors"),

    INDEBTEDNESS_QUESTION("indebtedness-question"),

    OCCUPATION_DATA("occupation-data"),

    UNIVERSITY_STUNDENT_DATA("university-student-data"),

    VEHICLES("vehicles"),

    LEGAL("legal"),

    LEGAL_SIMPLE("legal-simple"),

    NATURAL("natural"),

    NATURAL_SIMPLE("natural-simple");


    private final String label;

    Dataset(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
