package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class BasicData {

    @JsonAlias("TaxIdNumber")
    private String taxIdNumber;

    @JsonAlias("OfficialName")
    private String officialName;

    @JsonAlias("TradeName")
    private String tradeName;

    @JsonAlias("FoundedDate")
    private String foundedDate;

    @JsonAlias("IsHeadquarter")
    private boolean isHeadquarter;

    @JsonAlias("TaxIdStatus")
    private String taxIdStatus;

    @JsonAlias("TaxIdStatusDate")
    private String taxIdStatusDate;

    @JsonAlias("Activities")
    private List<Activities> activities;

    @JsonAlias("LegalNature")
    private LegalNature legalNature;

    @JsonAlias("AdditionalOutputData")
    private AdditionalOutputData additionalOutputData;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(String foundedDate) {
        this.foundedDate = foundedDate;
    }

    public boolean isHeadquarter() {
        return isHeadquarter;
    }

    public void setHeadquarter(boolean headquarter) {
        isHeadquarter = headquarter;
    }

    public String getTaxIdStatus() {
        return taxIdStatus;
    }

    public void setTaxIdStatus(String taxIdStatus) {
        this.taxIdStatus = taxIdStatus;
    }

    public String getTaxIdStatusDate() {
        return taxIdStatusDate;
    }

    public void setTaxIdStatusDate(String taxIdStatusDate) {
        this.taxIdStatusDate = taxIdStatusDate;
    }

    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }

    public LegalNature getLegalNature() {
        return legalNature;
    }

    public void setLegalNature(LegalNature legalNature) {
        this.legalNature = legalNature;
    }

    public AdditionalOutputData getAdditionalOutputData() {
        return additionalOutputData;
    }

    public void setAdditionalOutputData(AdditionalOutputData additionalOutputData) {
        this.additionalOutputData = additionalOutputData;
    }
}
