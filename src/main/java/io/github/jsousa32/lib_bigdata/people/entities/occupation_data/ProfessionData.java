package io.github.jsousa32.lib_bigdata.people.entities.occupation_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProfessionData {

    private String taxIdNumber;

    private List<Profession> professions;

    private int totalProfessions;

    private int totalActiveProfessions;

    private double totalIncome;

    private String totalIncomeRange;

    private double totalDiscounts;

    private boolean isEmployed;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public List<Profession> getProfessions() {
        return Objects.isNull(professions) ? new ArrayList<>() : professions;
    }

    public int getTotalProfessions() {
        return totalProfessions;
    }

    public int getTotalActiveProfessions() {
        return totalActiveProfessions;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public String getTotalIncomeRange() {
        return totalIncomeRange;
    }

    public double getTotalDiscounts() {
        return totalDiscounts;
    }

    public boolean isEmployed() {
        return isEmployed;
    }
}
