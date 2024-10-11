package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;

import java.util.Objects;

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

    public String getType() {
        return type;
    }

    public int getMatchRate() {
        return matchRate;
    }

    public int getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public Details getDetails() {
        return Objects.isNull(details) ? new Details() : details;
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
}
