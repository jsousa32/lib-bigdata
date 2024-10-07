package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The Class BasicData
 *
 * @author João Lucas Silva de Sousa
 * @sincer 07/10/2024
 */
public class BasicData {

    @JsonAlias("TaxIdNumber")
    private String taxIdNumber;

    @JsonAlias("TaxIdCountry")
    private String taxIdCountry;

    @JsonAlias("OfficialName")
    private String officialName;

    @JsonAlias("TradeName")
    private String tradeName;

    @JsonAlias("Aliases")
    private Aliases aliases;

    @JsonAlias("NameUniquenessScore")
    private int nameUniquenessScore;

    @JsonAlias("OfficialNameUniquenessScore")
    private int officialNameUniquenessScore;

    @JsonAlias("TradeNameUniquenessScore")
    private int tradeNameUniquenessScore;

    @JsonAlias("FoundedDate")
    private LocalDateTime foundedDate;

    @JsonAlias("Age")
    private int age;

    @JsonAlias("IsHeadquarter")
    private boolean isHeadquarter;

    @JsonAlias("HeadquarterState")
    private String headquarterState;

    @JsonAlias("IsConglomerate")
    private boolean isConglomerate;

    @JsonAlias("TaxIdStatus")
    private String taxIdStatus;

    @JsonAlias("TaxIdOrigin")
    private String taxIdOrigin;

    @JsonAlias("TaxIdStatusDate")
    private LocalDateTime taxIdStatusDate;

    @JsonAlias("TaxIdStatusRegistrationDate")
    private LocalDateTime taxIdStatusRegistrationDate;

    @JsonAlias("TaxRegime")
    private String taxRegime;

    @JsonAlias("CompanyType_ReceitaFederal")
    private String companyTypeReceitaFederal;

    @JsonAlias("TaxRegimes")
    private TaxRegimes taxRegimes;

    @JsonAlias("Activities")
    private List<Activities> activities;

    @JsonAlias("LegalNature")
    private LegalNature legalNature;

    @JsonAlias("SpecialSituation")
    private String specialSituation;

    @JsonAlias("CreationDate")
    private LocalDateTime creationDate;

    @JsonAlias("LastUpdateDate")
    private LocalDateTime lastUpdateDate;

    @JsonAlias("AdditionalOutputData")
    private AdditionalOutputData additionalOutputData;

    @JsonAlias("HistoricalData")
    private HistoricalData historicalData;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public String getTaxIdCountry() {
        return taxIdCountry;
    }

    public void setTaxIdCountry(String taxIdCountry) {
        this.taxIdCountry = taxIdCountry;
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

    public Aliases getAliases() {
        return aliases;
    }

    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    public int getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public void setNameUniquenessScore(int nameUniquenessScore) {
        this.nameUniquenessScore = nameUniquenessScore;
    }

    public int getOfficialNameUniquenessScore() {
        return officialNameUniquenessScore;
    }

    public void setOfficialNameUniquenessScore(int officialNameUniquenessScore) {
        this.officialNameUniquenessScore = officialNameUniquenessScore;
    }

    public int getTradeNameUniquenessScore() {
        return tradeNameUniquenessScore;
    }

    public void setTradeNameUniquenessScore(int tradeNameUniquenessScore) {
        this.tradeNameUniquenessScore = tradeNameUniquenessScore;
    }

    public LocalDateTime getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(LocalDateTime foundedDate) {
        this.foundedDate = foundedDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHeadquarter() {
        return isHeadquarter;
    }

    public void setHeadquarter(boolean headquarter) {
        isHeadquarter = headquarter;
    }

    public String getHeadquarterState() {
        return headquarterState;
    }

    public void setHeadquarterState(String headquarterState) {
        this.headquarterState = headquarterState;
    }

    public boolean isConglomerate() {
        return isConglomerate;
    }

    public void setConglomerate(boolean conglomerate) {
        isConglomerate = conglomerate;
    }

    public String getTaxIdStatus() {
        return taxIdStatus;
    }

    public void setTaxIdStatus(String taxIdStatus) {
        this.taxIdStatus = taxIdStatus;
    }

    public String getTaxIdOrigin() {
        return taxIdOrigin;
    }

    public void setTaxIdOrigin(String taxIdOrigin) {
        this.taxIdOrigin = taxIdOrigin;
    }

    public LocalDateTime getTaxIdStatusDate() {
        return taxIdStatusDate;
    }

    public void setTaxIdStatusDate(LocalDateTime taxIdStatusDate) {
        this.taxIdStatusDate = taxIdStatusDate;
    }

    public LocalDateTime getTaxIdStatusRegistrationDate() {
        return taxIdStatusRegistrationDate;
    }

    public void setTaxIdStatusRegistrationDate(LocalDateTime taxIdStatusRegistrationDate) {
        this.taxIdStatusRegistrationDate = taxIdStatusRegistrationDate;
    }

    public String getTaxRegime() {
        return taxRegime;
    }

    public void setTaxRegime(String taxRegime) {
        this.taxRegime = taxRegime;
    }

    public String getCompanyTypeReceitaFederal() {
        return companyTypeReceitaFederal;
    }

    public void setCompanyTypeReceitaFederal(String companyTypeReceitaFederal) {
        this.companyTypeReceitaFederal = companyTypeReceitaFederal;
    }

    public TaxRegimes getTaxRegimes() {
        return taxRegimes;
    }

    public void setTaxRegimes(TaxRegimes taxRegimes) {
        this.taxRegimes = taxRegimes;
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

    public String getSpecialSituation() {
        return specialSituation;
    }

    public void setSpecialSituation(String specialSituation) {
        this.specialSituation = specialSituation;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public AdditionalOutputData getAdditionalOutputData() {
        return additionalOutputData;
    }

    public void setAdditionalOutputData(AdditionalOutputData additionalOutputData) {
        this.additionalOutputData = additionalOutputData;
    }

    public HistoricalData getHistoricalData() {
        return historicalData;
    }

    public void setHistoricalData(HistoricalData historicalData) {
        this.historicalData = historicalData;
    }
}
