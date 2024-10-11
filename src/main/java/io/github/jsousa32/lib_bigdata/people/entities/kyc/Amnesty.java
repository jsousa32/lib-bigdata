package io.github.jsousa32.lib_bigdata.people.entities.kyc;

import java.util.Objects;

public class Amnesty {

    private String source;

    private String type;

    private double matchRate;

    private double nameUniquenessScore;

    private AmnestyDetails details;

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public double getMatchRate() {
        return matchRate;
    }

    public double getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public AmnestyDetails getDetails() {
        return Objects.isNull(details) ? new AmnestyDetails() : details;
    }
}
