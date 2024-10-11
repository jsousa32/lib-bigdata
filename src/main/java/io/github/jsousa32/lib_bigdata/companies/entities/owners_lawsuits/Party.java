package io.github.jsousa32.lib_bigdata.companies.entities.owners_lawsuits;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Party {

    private String doc;

    private boolean isPartyActive;

    private String name;

    private String polarity;

    private String type;

    private boolean isInference;

    private Map<String, String> partyDetails;

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

    public Map<String, String> getPartyDetails() {
        return Objects.isNull(partyDetails) ? new HashMap<>() : partyDetails;
    }

    public String getLastCaptureDate() {
        return lastCaptureDate;
    }
}
