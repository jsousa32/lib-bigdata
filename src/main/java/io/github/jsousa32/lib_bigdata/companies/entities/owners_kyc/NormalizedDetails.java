package io.github.jsousa32.lib_bigdata.companies.entities.owners_kyc;

public class NormalizedDetails {

    private String originalName;

    private String sanctionName;

    private String nationalities;

    private String birthDate;

    private String standardizedBirthDate;

    public String getOriginalName() {
        return originalName;
    }

    public String getSanctionName() {
        return sanctionName;
    }

    public String getNationalities() {
        return nationalities;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getStandardizedBirthDate() {
        return standardizedBirthDate;
    }
}
