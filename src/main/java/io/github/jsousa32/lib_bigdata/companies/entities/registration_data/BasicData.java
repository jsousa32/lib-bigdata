package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BasicData {

    private String taxIdNumber;

    private String officialName;

    private String tradeName;

    private String foundedDate;

    private boolean isHeadquarter;

    private String taxIdStatus;

    private String taxIdStatusDate;

    private List<Activities> activities;

    private LegalNature legalNature;

    private AdditionalOutputData additionalOutputData;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public String getOfficialName() {
        return officialName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getFoundedDate() {
        return foundedDate;
    }

    public boolean isHeadquarter() {
        return isHeadquarter;
    }

    public String getTaxIdStatus() {
        return taxIdStatus;
    }

    public String getTaxIdStatusDate() {
        return taxIdStatusDate;
    }

    public List<Activities> getActivities() {
        return Objects.isNull(activities) ? new ArrayList<>() : activities;
    }

    public LegalNature getLegalNature() {
        return Objects.isNull(legalNature) ? new LegalNature() : legalNature;
    }

    public AdditionalOutputData getAdditionalOutputData() {
        return Objects.isNull(additionalOutputData) ? new AdditionalOutputData() : additionalOutputData;
    }
}
