package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BasicData {

    private String taxIdNumber;

    private String taxIdCountry;

    private String officialName;

    private String tradeName;

    private Aliases aliases;

    private int nameUniquenessScore;

    private int officialNameUniquenessScore;

    private int tradeNameUniquenessScore;

    private LocalDateTime foundedDate;

    private int age;

    private boolean isHeadquarter;

    private String headquarterState;

    private boolean isConglomerate;

    private String taxIdStatus;

    private String taxIdOrigin;

    private LocalDateTime taxIdStatusDate;

    private LocalDateTime taxIdStatusRegistrationDate;

    private String taxRegime;

    private String companyTypeReceitaFederal;

    private TaxRegimes taxRegimes;

    private List<Activities> activities;

    private LegalNature legalNature;

    private String specialSituation;

    private LocalDateTime creationDate;

    private LocalDateTime lastUpdateDate;

    private AdditionalOutputData additionalOutputData;

    private HistoricalData historicalData;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public String getTaxIdCountry() {
        return taxIdCountry;
    }

    public String getOfficialName() {
        return officialName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public Aliases getAliases() {
        return Objects.isNull(aliases) ?  new Aliases() : aliases;
    }

    public int getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public int getOfficialNameUniquenessScore() {
        return officialNameUniquenessScore;
    }

    public int getTradeNameUniquenessScore() {
        return tradeNameUniquenessScore;
    }

    public LocalDateTime getFoundedDate() {
        return foundedDate;
    }

    public int getAge() {
        return age;
    }

    public boolean isHeadquarter() {
        return isHeadquarter;
    }

    public String getHeadquarterState() {
        return headquarterState;
    }

    public boolean isConglomerate() {
        return isConglomerate;
    }

    public String getTaxIdStatus() {
        return taxIdStatus;
    }

    public String getTaxIdOrigin() {
        return taxIdOrigin;
    }

    public LocalDateTime getTaxIdStatusDate() {
        return taxIdStatusDate;
    }

    public LocalDateTime getTaxIdStatusRegistrationDate() {
        return taxIdStatusRegistrationDate;
    }

    public String getTaxRegime() {
        return taxRegime;
    }

    public String getCompanyTypeReceitaFederal() {
        return companyTypeReceitaFederal;
    }

    public TaxRegimes getTaxRegimes() {
        return Objects.isNull(taxRegimes) ? new TaxRegimes() : taxRegimes;
    }

    public List<Activities> getActivities() {
        return Objects.isNull(activities) ? new ArrayList<>() : activities;
    }

    public LegalNature getLegalNature() {
        return Objects.isNull(legalNature) ? new LegalNature() : legalNature;
    }

    public String getSpecialSituation() {
        return specialSituation;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public AdditionalOutputData getAdditionalOutputData() {
        return Objects.isNull(additionalOutputData) ? new AdditionalOutputData() : additionalOutputData;
    }

    public HistoricalData getHistoricalData() {
        return Objects.isNull(historicalData) ? new HistoricalData() : historicalData;
    }
}
