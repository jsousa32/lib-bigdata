package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;

import java.util.List;

/**
 * The Class KycData
 *
 * @author João Lucas Silva de Sousa
 * @sincer 09/10/2024
 */
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
        return pepHistory;
    }

    public void setPepHistory(List<PepHistory> pepHistory) {
        this.pepHistory = pepHistory;
    }

    public boolean isCurrentlyPep() {
        return isCurrentlyPep;
    }

    public void setCurrentlyPep(boolean currentlyPep) {
        isCurrentlyPep = currentlyPep;
    }

    public List<SanctionsHistory> getSanctionsHistory() {
        return sanctionsHistory;
    }

    public void setSanctionsHistory(List<SanctionsHistory> sanctionsHistory) {
        this.sanctionsHistory = sanctionsHistory;
    }

    public boolean isCurrentlySanctioned() {
        return isCurrentlySanctioned;
    }

    public void setCurrentlySanctioned(boolean currentlySanctioned) {
        isCurrentlySanctioned = currentlySanctioned;
    }

    public int getLast30DaysSanctions() {
        return last30DaysSanctions;
    }

    public void setLast30DaysSanctions(int last30DaysSanctions) {
        this.last30DaysSanctions = last30DaysSanctions;
    }

    public int getLast90DaysSanctions() {
        return last90DaysSanctions;
    }

    public void setLast90DaysSanctions(int last90DaysSanctions) {
        this.last90DaysSanctions = last90DaysSanctions;
    }

    public int getLast180DaysSanctions() {
        return last180DaysSanctions;
    }

    public void setLast180DaysSanctions(int last180DaysSanctions) {
        this.last180DaysSanctions = last180DaysSanctions;
    }

    public int getLast365DaysSanctions() {
        return last365DaysSanctions;
    }

    public void setLast365DaysSanctions(int last365DaysSanctions) {
        this.last365DaysSanctions = last365DaysSanctions;
    }

    public int getLastYearPepOccurence() {
        return lastYearPepOccurence;
    }

    public void setLastYearPepOccurence(int lastYearPepOccurence) {
        this.lastYearPepOccurence = lastYearPepOccurence;
    }

    public int getLast3YearsPepOccurence() {
        return last3YearsPepOccurence;
    }

    public void setLast3YearsPepOccurence(int last3YearsPepOccurence) {
        this.last3YearsPepOccurence = last3YearsPepOccurence;
    }

    public int getLast5YearsPepOccurence() {
        return last5YearsPepOccurence;
    }

    public void setLast5YearsPepOccurence(int last5YearsPepOccurence) {
        this.last5YearsPepOccurence = last5YearsPepOccurence;
    }

    public int getLast5PlusYearsPepOccurence() {
        return last5PlusYearsPepOccurence;
    }

    public void setLast5PlusYearsPepOccurence(int last5PlusYearsPepOccurence) {
        this.last5PlusYearsPepOccurence = last5PlusYearsPepOccurence;
    }

    public String getFirstSanctionDate() {
        return firstSanctionDate;
    }

    public void setFirstSanctionDate(String firstSanctionDate) {
        this.firstSanctionDate = firstSanctionDate;
    }

    public String getLastSanctionDate() {
        return lastSanctionDate;
    }

    public void setLastSanctionDate(String lastSanctionDate) {
        this.lastSanctionDate = lastSanctionDate;
    }
}
