package io.github.jsousa32.lib_bigdata.people.entities.financial_risk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FinancialRisk {

    private String taxIdNumber;

    private String totalAssets;

    private String estimatedIncomeRange;

    private boolean isCurrentlyEmployed;

    private boolean isCurrentlyOwner;

    private String lastOccupationStartDate;

    private boolean isCurrentlyOnCollection;

    private int last365DaysCollectionOccurrences;

    private int currentConsecutiveCollectionMonths;

    private boolean isCurrentlyReceivingAssistance;

    private int financialRiskScore;

    private String financialRiskLevel;

    private List<String> reasons;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public String getTotalAssets() {
        return totalAssets;
    }

    public String getEstimatedIncomeRange() {
        return estimatedIncomeRange;
    }

    public boolean isCurrentlyEmployed() {
        return isCurrentlyEmployed;
    }

    public boolean isCurrentlyOwner() {
        return isCurrentlyOwner;
    }

    public String getLastOccupationStartDate() {
        return lastOccupationStartDate;
    }

    public boolean isCurrentlyOnCollection() {
        return isCurrentlyOnCollection;
    }

    public int getLast365DaysCollectionOccurrences() {
        return last365DaysCollectionOccurrences;
    }

    public int getCurrentConsecutiveCollectionMonths() {
        return currentConsecutiveCollectionMonths;
    }

    public boolean isCurrentlyReceivingAssistance() {
        return isCurrentlyReceivingAssistance;
    }

    public int getFinancialRiskScore() {
        return financialRiskScore;
    }

    public String getFinancialRiskLevel() {
        return financialRiskLevel;
    }

    public List<String> getReasons() {
        return Objects.isNull(reasons) ? new ArrayList<>() : reasons;
    }
}
