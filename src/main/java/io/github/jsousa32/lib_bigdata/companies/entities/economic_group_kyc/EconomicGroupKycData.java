package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EconomicGroupKycData {

    private String taxIdNumber;

    private int totalCurrentlyPep;

    private int totalHistoricallyPep;

    private int totalCurrentlySanctioned;

    private int totalHistoricallySanctioned;

    private int averageSanctionsPerCompany;

    private int pepPercentage;

    private int economicGroupMaxSanctions;

    private int economicGroupMinSanctions;

    private int last30DaysSanctions;

    private int last90DaysSanctions;

    private int last180DaysSanctions;

    private int last365DaysSanctions;

    private int lastYearPepOccurence;

    private int last3YearsPepOccurence;

    private int last5YearsPepOccurence;

    private int last5PlusYearsPepOccurence;

    private String firstPepOccurenceDate;

    private String lastPepOccurenceDate;

    private String firstSanctionDate;

    private String lastSanctionDate;

    private List<EconomicGroupKycDataDetails> economicGroupKycDataDetails;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public int getTotalCurrentlyPep() {
        return totalCurrentlyPep;
    }

    public int getTotalHistoricallyPep() {
        return totalHistoricallyPep;
    }

    public int getTotalCurrentlySanctioned() {
        return totalCurrentlySanctioned;
    }

    public int getTotalHistoricallySanctioned() {
        return totalHistoricallySanctioned;
    }

    public int getAverageSanctionsPerCompany() {
        return averageSanctionsPerCompany;
    }

    public int getPepPercentage() {
        return pepPercentage;
    }

    public int getEconomicGroupMaxSanctions() {
        return economicGroupMaxSanctions;
    }

    public int getEconomicGroupMinSanctions() {
        return economicGroupMinSanctions;
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

    public int getLastYearPepOccurence() {
        return lastYearPepOccurence;
    }

    public int getLast3YearsPepOccurence() {
        return last3YearsPepOccurence;
    }

    public int getLast5YearsPepOccurence() {
        return last5YearsPepOccurence;
    }

    public int getLast5PlusYearsPepOccurence() {
        return last5PlusYearsPepOccurence;
    }

    public String getFirstPepOccurenceDate() {
        return firstPepOccurenceDate;
    }

    public String getLastPepOccurenceDate() {
        return lastPepOccurenceDate;
    }

    public String getFirstSanctionDate() {
        return firstSanctionDate;
    }

    public String getLastSanctionDate() {
        return lastSanctionDate;
    }

    public List<EconomicGroupKycDataDetails> getEconomicGroupKycDataDetails() {
        return Objects.isNull(economicGroupKycDataDetails) ? new ArrayList<>() : economicGroupKycDataDetails;
    }
}
