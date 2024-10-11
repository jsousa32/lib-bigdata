package io.github.jsousa32.lib_bigdata.companies.entities.employees_kyc;

/**
 * The Class SanctionsHistory
 *
 * @author João Lucas Silva de Sousa
 * @sincer 09/10/2024
 */
public class SanctionsHistory {

    private String source;

    private String type;

    private String standardizedSanctionType;

    private int matchRate;

    private double nameUniquenessScore;

    private Details details;

    private NormalizedDetails normalizedDetails;

    private String startDate;

    private String endDate;

    private String creationDate;

    private String lastUpdateDate;

    private boolean isCurrentlyPresentOnSource;

    private boolean wasRecentlyPresentOnSource;

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

    public String getStandardizedSanctionType() {
        return standardizedSanctionType;
    }

    public void setStandardizedSanctionType(String standardizedSanctionType) {
        this.standardizedSanctionType = standardizedSanctionType;
    }

    public int getMatchRate() {
        return matchRate;
    }

    public void setMatchRate(int matchRate) {
        this.matchRate = matchRate;
    }

    public double getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public void setNameUniquenessScore(double nameUniquenessScore) {
        this.nameUniquenessScore = nameUniquenessScore;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public NormalizedDetails getNormalizedDetails() {
        return normalizedDetails;
    }

    public void setNormalizedDetails(NormalizedDetails normalizedDetails) {
        this.normalizedDetails = normalizedDetails;
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

    public boolean isCurrentlyPresentOnSource() {
        return isCurrentlyPresentOnSource;
    }

    public void setCurrentlyPresentOnSource(boolean currentlyPresentOnSource) {
        isCurrentlyPresentOnSource = currentlyPresentOnSource;
    }

    public boolean isWasRecentlyPresentOnSource() {
        return wasRecentlyPresentOnSource;
    }

    public void setWasRecentlyPresentOnSource(boolean wasRecentlyPresentOnSource) {
        this.wasRecentlyPresentOnSource = wasRecentlyPresentOnSource;
    }
}
