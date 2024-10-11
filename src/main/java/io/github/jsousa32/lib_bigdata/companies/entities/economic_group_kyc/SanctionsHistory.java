package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;


/**
 * The Class SanctionsHistory
 *
 * @author João Lucas Silva de Sousa
 * @sincer 09/10/2024
 */
public class SanctionsHistory {

    private String source;

    private String type;

    private int matchRate;

    private int nameUniquenessScore;

    private Details details;

    private String startDate;

    private String endDate;

    private String creationDate;

    private String lastUpdateDate;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMatchRate() {
        return matchRate;
    }

    public void setMatchRate(int matchRate) {
        this.matchRate = matchRate;
    }

    public int getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public void setNameUniquenessScore(int nameUniquenessScore) {
        this.nameUniquenessScore = nameUniquenessScore;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
