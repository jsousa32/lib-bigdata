package io.github.jsousa32.lib_bigdata.companies.entities.owners_kyc;

import java.util.*;

public class OwnersKycData {

    private String taxIdNumber;

    private Map<String, OwnerKycDataDetails> ownersKycData;

    private int totalCurrentlyPEP;

    private int totalHistoricallyPEP;

    private int totalCurrentlySanctioned;

    private int totalHistoricallySanctioned;

    private double averageSanctionsPerOwner;

    private int pepPercentage;

    private int ownerMaxSanctions;

    private int ownerMinSanctions;

    private int last30DaysSanctions;

    private int last90DaysSanctions;

    private int last180DaysSanctions;

    private int last365DaysSanctions;

    private int lastYearPEPOccurence;

    private int last3YearsPEPOccurence;

    private int last5YearsPEPOccurence;

    private int last5PlusYearsPEPOccurence;

    private String firstSanctionDate;

    private String lastSanctionDate;

    private List<String> activeOwners;

    private List<String> inactiveOwners;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public Map<String, OwnerKycDataDetails> getOwnersKycData() {
        return Objects.isNull(ownersKycData) ? new HashMap<>() : ownersKycData;
    }

    public int getTotalCurrentlyPEP() {
        return totalCurrentlyPEP;
    }

    public int getTotalHistoricallyPEP() {
        return totalHistoricallyPEP;
    }

    public int getTotalCurrentlySanctioned() {
        return totalCurrentlySanctioned;
    }

    public int getTotalHistoricallySanctioned() {
        return totalHistoricallySanctioned;
    }

    public double getAverageSanctionsPerOwner() {
        return averageSanctionsPerOwner;
    }

    public int getPepPercentage() {
        return pepPercentage;
    }

    public int getOwnerMaxSanctions() {
        return ownerMaxSanctions;
    }

    public int getOwnerMinSanctions() {
        return ownerMinSanctions;
    }

    public int getLast30DaysSanctions() {
        return last30DaysSanctions;
    }

    public int getLast90DaysSanctions() {
        return last90DaysSanctions;
    }

    public int getLast180DaysSanctions() {
        return last180DaysSanctions;
    }

    public int getLast365DaysSanctions() {
        return last365DaysSanctions;
    }

    public int getLastYearPEPOccurence() {
        return lastYearPEPOccurence;
    }

    public int getLast3YearsPEPOccurence() {
        return last3YearsPEPOccurence;
    }

    public int getLast5YearsPEPOccurence() {
        return last5YearsPEPOccurence;
    }

    public int getLast5PlusYearsPEPOccurence() {
        return last5PlusYearsPEPOccurence;
    }

    public String getFirstSanctionDate() {
        return firstSanctionDate;
    }

    public String getLastSanctionDate() {
        return lastSanctionDate;
    }

    public List<String> getActiveOwners() {
        return Objects.isNull(activeOwners) ? new ArrayList<>() : activeOwners;
    }

    public List<String> getInactiveOwners() {
        return Objects.isNull(inactiveOwners) ? new ArrayList<>() : inactiveOwners;
    }
}
