package io.github.jsousa32.lib_bigdata.companies.entities.employees_kyc;

import java.util.Map;

/**
 * The Class EmployeesKycData
 *
 * @author João Lucas Silva de Sousa
 * @sincer 09/10/2024
 */
public class EmployeesKycData {

    private String taxIdNumber;

    private Map<String, EmployeeDataDetails> employeeDataDetails;

    private int totalCurrentlyPep;

    private int totalHistoricallyPep;

    private int totalCurrentlySanctioned;

    private int totalHistoricallySanctioned;

    private int averageSanctionsPerEmployee;

    private int pepPercentage;

    private int employeeMaxSanctions;

    private int employeeMinSanctions;

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

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public Map<String, EmployeeDataDetails> getEmployeeDataDetails() {
        return employeeDataDetails;
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

    public int getAverageSanctionsPerEmployee() {
        return averageSanctionsPerEmployee;
    }

    public int getPepPercentage() {
        return pepPercentage;
    }

    public int getEmployeeMaxSanctions() {
        return employeeMaxSanctions;
    }

    public int getEmployeeMinSanctions() {
        return employeeMinSanctions;
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
