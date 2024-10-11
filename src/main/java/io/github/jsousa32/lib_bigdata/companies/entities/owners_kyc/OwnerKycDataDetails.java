package io.github.jsousa32.lib_bigdata.companies.entities.owners_kyc;

import io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc.PepHistory;

import java.util.*;

public class OwnerKycDataDetails {

    private List<PepHistory> pepHistory;

    private boolean isCurrentlyPEP;

    private List<Sanction> sanctionsHistory;

    private boolean isCurrentlySanctioned;

    private boolean wasPreviouslySanctioned;

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

    private boolean isCurrentlyElectoralDonor;

    private boolean isHistoricalElectoralDonor;

    private int totalElectoralDonations;

    private int totalElectoralDonationAmount;

    private Map<String, Object> electoralDonations;

    public List<PepHistory> getPepHistory() {
        return Objects.isNull(pepHistory) ? new ArrayList<>() : pepHistory;
    }

    public boolean isCurrentlyPEP() {
        return isCurrentlyPEP;
    }

    public List<Sanction> getSanctionsHistory() {
        return Objects.isNull(sanctionsHistory) ? new ArrayList<>() : sanctionsHistory;
    }

    public boolean isCurrentlySanctioned() {
        return isCurrentlySanctioned;
    }

    public boolean isWasPreviouslySanctioned() {
        return wasPreviouslySanctioned;
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

    public boolean isCurrentlyElectoralDonor() {
        return isCurrentlyElectoralDonor;
    }

    public boolean isHistoricalElectoralDonor() {
        return isHistoricalElectoralDonor;
    }

    public int getTotalElectoralDonations() {
        return totalElectoralDonations;
    }

    public int getTotalElectoralDonationAmount() {
        return totalElectoralDonationAmount;
    }

    public Map<String, Object> getElectoralDonations() {
        return Objects.isNull(electoralDonations) ? new HashMap<>() : electoralDonations;
    }
}
