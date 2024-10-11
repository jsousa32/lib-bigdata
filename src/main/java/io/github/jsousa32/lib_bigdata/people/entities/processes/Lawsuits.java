package io.github.jsousa32.lib_bigdata.people.entities.processes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lawsuits {

    private List<LawsuitDetails> lawsuits;

    private int totalLawsuits;

    private int totalLawsuitsAsAuthor;

    private int totalLawsuitsAsDefendant;

    private int totalLawsuitsAsOther;

    private String firstLawsuitDate;

    private String lastLawsuitDate;

    private int last30DaysLawsuits;

    private int last90DaysLawsuits;

    private int last180DaysLawsuits;

    private int last365DaysLawsuits;

    public List<LawsuitDetails> getLawsuits() {
        return Objects.isNull(lawsuits) ? new ArrayList<>() : lawsuits;
    }

    public int getTotalLawsuits() {
        return totalLawsuits;
    }

    public int getTotalLawsuitsAsAuthor() {
        return totalLawsuitsAsAuthor;
    }

    public int getTotalLawsuitsAsDefendant() {
        return totalLawsuitsAsDefendant;
    }

    public int getTotalLawsuitsAsOther() {
        return totalLawsuitsAsOther;
    }

    public String getFirstLawsuitDate() {
        return firstLawsuitDate;
    }

    public String getLastLawsuitDate() {
        return lastLawsuitDate;
    }

    public int getLast30DaysLawsuits() {
        return last30DaysLawsuits;
    }

    public int getLast90DaysLawsuits() {
        return last90DaysLawsuits;
    }

    public int getLast180DaysLawsuits() {
        return last180DaysLawsuits;
    }

    public int getLast365DaysLawsuits() {
        return last365DaysLawsuits;
    }
}
