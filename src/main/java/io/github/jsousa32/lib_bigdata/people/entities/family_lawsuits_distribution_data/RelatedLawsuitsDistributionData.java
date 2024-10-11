package io.github.jsousa32.lib_bigdata.people.entities.family_lawsuits_distribution_data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RelatedLawsuitsDistributionData {

    private String taxIdNumber;

    private int totalRelationships;

    private Map<String, Integer> totalLawsuitsByRelationshipType;

    private double averageLawsuitsByEntity;

    private int maximumLawsuitsByEntity;

    private int minimunLawsuitsByEntity;

    private boolean isRelatedToLawyers;

    private boolean isRelatedToJudges;

    private int totalLawsuits;

    private String firstLawsuitDate;

    private String lastLawsuitDate;

    private int last30DaysLawsuits;

    private int last90DaysLawsuits;

    private int last180DaysLawsuits;

    private int last365DaysLawsuits;

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

    private LawsuitsDistributionByAlternativeParameterData lawsuitsDistributionByAlternativeParameterData;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public int getTotalRelationships() {
        return totalRelationships;
    }

    public Map<String, Integer> getTotalLawsuitsByRelationshipType() {
        return Objects.isNull(totalLawsuitsByRelationshipType) ? new HashMap<>() : totalLawsuitsByRelationshipType;
    }

    public double getAverageLawsuitsByEntity() {
        return averageLawsuitsByEntity;
    }

    public int getMaximumLawsuitsByEntity() {
        return maximumLawsuitsByEntity;
    }

    public int getMinimunLawsuitsByEntity() {
        return minimunLawsuitsByEntity;
    }

    public boolean isRelatedToLawyers() {
        return isRelatedToLawyers;
    }

    public boolean isRelatedToJudges() {
        return isRelatedToJudges;
    }

    public int getTotalLawsuits() {
        return totalLawsuits;
    }

    public String getFirstLawsuitDate() {
        return firstLawsuitDate;
    }

    public String getLastLawsuitDate() {
        return lastLawsuitDate;
    }

    public int getLast30DaysLawsuits() {
        return last30DaysLawsuits;
    }

    public int getLast90DaysLawsuits() {
        return last90DaysLawsuits;
    }

    public int getLast180DaysLawsuits() {
        return last180DaysLawsuits;
    }

    public int getLast365DaysLawsuits() {
        return last365DaysLawsuits;
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

    public LawsuitsDistributionByAlternativeParameterData getLawsuitsDistributionByAlternativeParameterData() {
        return Objects.isNull(lawsuitsDistributionByAlternativeParameterData) ? new LawsuitsDistributionByAlternativeParameterData() : lawsuitsDistributionByAlternativeParameterData;
    }
}
