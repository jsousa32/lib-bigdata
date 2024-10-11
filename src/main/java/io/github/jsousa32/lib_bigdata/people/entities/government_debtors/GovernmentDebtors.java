package io.github.jsousa32.lib_bigdata.people.entities.government_debtors;

import java.util.*;

public class GovernmentDebtors {

    private String taxIdNumber;

    private String debtorName;

    private double totalDebtValue;

    private Map<String, Double> totalDebtValuePerOrigin;

    private int totalDebts;

    private Map<String, Integer> totalDebtsPerOrigin;

    private List<Debt> debts;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public String getDebtorName() {
        return debtorName;
    }

    public double getTotalDebtValue() {
        return totalDebtValue;
    }

    public Map<String, Double> getTotalDebtValuePerOrigin() {
        return Objects.isNull(totalDebtValuePerOrigin) ? new HashMap<>() : totalDebtValuePerOrigin;
    }

    public int getTotalDebts() {
        return totalDebts;
    }

    public Map<String, Integer> getTotalDebtsPerOrigin() {
        return Objects.isNull(totalDebtsPerOrigin) ? new HashMap<>() : totalDebtsPerOrigin;
    }

    public List<Debt> getDebts() {
        return Objects.isNull(debts) ? new ArrayList<>() : debts;
    }
}
