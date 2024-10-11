package io.github.jsousa32.lib_bigdata.companies.entities.lawsuits_distribution_data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LawsuitsDistributionData {

    private String taxIdNumber;

    private int totalLawsuits;

    private Map<String, Integer> typeDistribution;

    private Map<String, Integer> courtNameDistribution;

    private Map<String, Integer> statusDistribution;

    private Map<String, Integer> stateDistribution;

    private Map<String, Integer> partyTypeDistribution;

    private Map<String, Integer> courtTypeDistribution;

    private Map<String, Integer> courtLevelDistribution;

    private Map<String, Integer> cnjProcedureTypeDistribution;

    private Map<String, Integer> cnjSubjectDistribution;

    private Map<String, Integer> cnjBroadSubjectDistribution;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public int getTotalLawsuits() {
        return totalLawsuits;
    }

    public Map<String, Integer> getTypeDistribution() {
        return Objects.isNull(typeDistribution) ? new HashMap<>() : typeDistribution;
    }

    public Map<String, Integer> getCourtNameDistribution() {
        return Objects.isNull(courtNameDistribution) ? new HashMap<>() : courtNameDistribution;
    }

    public Map<String, Integer> getStatusDistribution() {
        return Objects.isNull(statusDistribution) ? new HashMap<>() : statusDistribution;
    }

    public Map<String, Integer> getStateDistribution() {
        return Objects.isNull(stateDistribution) ? new HashMap<>() : stateDistribution;
    }

    public Map<String, Integer> getPartyTypeDistribution() {
        return Objects.isNull(partyTypeDistribution) ? new HashMap<>() : partyTypeDistribution;
    }

    public Map<String, Integer> getCourtTypeDistribution() {
        return Objects.isNull(courtTypeDistribution) ? new HashMap<>() : courtTypeDistribution;
    }

    public Map<String, Integer> getCourtLevelDistribution() {
        return Objects.isNull(courtLevelDistribution) ? new HashMap<>() : courtLevelDistribution;
    }

    public Map<String, Integer> getCnjProcedureTypeDistribution() {
        return Objects.isNull(cnjProcedureTypeDistribution) ? new HashMap<>() : cnjProcedureTypeDistribution;
    }

    public Map<String, Integer> getCnjSubjectDistribution() {
        return Objects.isNull(cnjSubjectDistribution) ? new HashMap<>() : cnjSubjectDistribution;
    }

    public Map<String, Integer> getCnjBroadSubjectDistribution() {
        return Objects.isNull(cnjBroadSubjectDistribution) ? new HashMap<>() : cnjBroadSubjectDistribution;
    }
}
