package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;

import java.util.List;

/**
 * The Class EconomicGroupKycData
 *
 * @author João Lucas Silva de Sousa
 * @sincer 09/10/2024
 */
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

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public int getTotalCurrentlyPep() {
        return totalCurrentlyPep;
    }

    public void setTotalCurrentlyPep(int totalCurrentlyPep) {
        this.totalCurrentlyPep = totalCurrentlyPep;
    }

    public int getTotalHistoricallyPep() {
        return totalHistoricallyPep;
    }

    public void setTotalHistoricallyPep(int totalHistoricallyPep) {
        this.totalHistoricallyPep = totalHistoricallyPep;
    }

    public int getTotalCurrentlySanctioned() {
        return totalCurrentlySanctioned;
    }

    public void setTotalCurrentlySanctioned(int totalCurrentlySanctioned) {
        this.totalCurrentlySanctioned = totalCurrentlySanctioned;
    }

    public int getTotalHistoricallySanctioned() {
        return totalHistoricallySanctioned;
    }

    public void setTotalHistoricallySanctioned(int totalHistoricallySanctioned) {
        this.totalHistoricallySanctioned = totalHistoricallySanctioned;
    }

    public int getAverageSanctionsPerCompany() {
        return averageSanctionsPerCompany;
    }

    public void setAverageSanctionsPerCompany(int averageSanctionsPerCompany) {
        this.averageSanctionsPerCompany = averageSanctionsPerCompany;
    }

    public int getPepPercentage() {
        return pepPercentage;
    }

    public void setPepPercentage(int pepPercentage) {
        this.pepPercentage = pepPercentage;
    }

    public int getEconomicGroupMaxSanctions() {
        return economicGroupMaxSanctions;
    }

    public void setEconomicGroupMaxSanctions(int economicGroupMaxSanctions) {
        this.economicGroupMaxSanctions = economicGroupMaxSanctions;
    }

    public int getEconomicGroupMinSanctions() {
        return economicGroupMinSanctions;
    }

    public void setEconomicGroupMinSanctions(int economicGroupMinSanctions) {
        this.economicGroupMinSanctions = economicGroupMinSanctions;
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

    public String getFirstPepOccurenceDate() {
        return firstPepOccurenceDate;
    }

    public void setFirstPepOccurenceDate(String firstPepOccurenceDate) {
        this.firstPepOccurenceDate = firstPepOccurenceDate;
    }

    public String getLastPepOccurenceDate() {
        return lastPepOccurenceDate;
    }

    public void setLastPepOccurenceDate(String lastPepOccurenceDate) {
        this.lastPepOccurenceDate = lastPepOccurenceDate;
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

    public List<EconomicGroupKycDataDetails> getEconomicGroupKycDataDetails() {
        return economicGroupKycDataDetails;
    }

    public void setEconomicGroupKycDataDetails(List<EconomicGroupKycDataDetails> economicGroupKycDataDetails) {
        this.economicGroupKycDataDetails = economicGroupKycDataDetails;
    }
}
