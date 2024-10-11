package io.github.jsousa32.lib_bigdata.companies.entities.processes;

import java.util.Objects;

public class Party {

    private String doc;

    private boolean isPartyActive;

    private String name;

    private String polarity;

    private String type;

    private boolean isInference;

    private PartyDetails partyDetails;

    private String lastCaptureDate;

    public String getDoc() {
        return doc;
    }

    public boolean isPartyActive() {
        return isPartyActive;
    }

    public String getName() {
        return name;
    }

    public String getPolarity() {
        return polarity;
    }

    public String getType() {
        return type;
    }

    public boolean isInference() {
        return isInference;
    }

    public PartyDetails getPartyDetails() {
        return Objects.isNull(partyDetails) ? new PartyDetails() : partyDetails;
    }

    public String getLastCaptureDate() {
        return lastCaptureDate;
    }
}
