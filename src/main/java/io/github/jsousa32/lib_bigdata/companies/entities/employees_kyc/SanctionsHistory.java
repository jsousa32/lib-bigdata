package io.github.jsousa32.lib_bigdata.companies.entities.employees_kyc;

import java.util.Objects;

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

    public String getType() {
        return type;
    }

    public String getStandardizedSanctionType() {
        return standardizedSanctionType;
    }

    public int getMatchRate() {
        return matchRate;
    }

    public double getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public Details getDetails() {
        return Objects.isNull(details) ? new Details() : details;
    }

    public NormalizedDetails getNormalizedDetails() {
        return Objects.isNull(normalizedDetails) ? new NormalizedDetails() : normalizedDetails;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public boolean isCurrentlyPresentOnSource() {
        return isCurrentlyPresentOnSource;
    }

    public boolean isWasRecentlyPresentOnSource() {
        return wasRecentlyPresentOnSource;
    }
}
