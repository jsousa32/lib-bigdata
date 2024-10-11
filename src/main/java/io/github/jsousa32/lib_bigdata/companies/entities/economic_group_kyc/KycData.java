package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KycData {

    private List<PepHistory> pepHistory;

    private boolean isCurrentlyPep;

    private List<SanctionsHistory> sanctionsHistory;

    private boolean isCurrentlySanctioned;

    private int last30DaysSanctions;

    private int last90DaysSanctions;

    private int last180DaysSanctions;

    private int last365DaysSanctions;

    private int lastYearPepOccurence;

    private int last3YearsPepOccurence;

    private int last5YearsPepOccurence;

    private int last5PlusYearsPepOccurence;

    private String firstSanctionDate;

    private String lastSanctionDate;

    public List<PepHistory> getPepHistory() {
        return Objects.isNull(pepHistory) ? new ArrayList<>() : pepHistory;
    }

    public boolean isCurrentlyPep() {
        return isCurrentlyPep;
    }

    public List<SanctionsHistory> getSanctionsHistory() {
        return Objects.isNull(sanctionsHistory) ? new ArrayList<>() : sanctionsHistory;
    }

    public boolean isCurrentlySanctioned() {
        return isCurrentlySanctioned;
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

    public String getFirstSanctionDate() {
        return firstSanctionDate;
    }

    public String getLastSanctionDate() {
        return lastSanctionDate;
    }
}
