package io.github.jsousa32.lib_bigdata.companies.entities.owners_kyc;

import java.util.Objects;

public class Sanction {

    private String source;

    private String type;

    private String standardizedSanctionType;

    private int matchRate;

    private int nameUniquenessScore;

    private Details details;

    private NormalizedDetails normalizedDetails;

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

    public int getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public Details getDetails() {
        return Objects.isNull(details) ? new Details() : details;
    }

    public NormalizedDetails getNormalizedDetails() {
        return Objects.isNull(normalizedDetails) ? new NormalizedDetails() : normalizedDetails;
    }
}
