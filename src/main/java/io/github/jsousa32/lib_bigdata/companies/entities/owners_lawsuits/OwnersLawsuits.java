package io.github.jsousa32.lib_bigdata.companies.entities.owners_lawsuits;

import java.util.*;

public class OwnersLawsuits {

    private String taxIdNumber;

    private int totalLawsuits;

    private int totalReplacedLawsuits;

    private int totalLawsuitsAsAuthor;

    private int totalLawsuitsAsDefendant;

    private int totalLawsuitsAsOther;

    private double averageLawsuitsPerOwner;

    private int ownerMaxLawsuits;

    private int ownerMinLawsuits;

    private int lawsuitsWithAllOwners;

    private int last30DaysLawsuits;

    private int last90DaysLawsuits;

    private int last180DaysLawsuits;

    private int last365DaysLawsuits;

    private String firstLawsuitDate;

    private String lastLawsuitDate;

    private Map<String, LawsuitDetails> lawsuits;

    private List<String> activeOwners;

    private List<String> inactiveOwners;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public int getTotalLawsuits() {
        return totalLawsuits;
    }

    public int getTotalReplacedLawsuits() {
        return totalReplacedLawsuits;
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

    public double getAverageLawsuitsPerOwner() {
        return averageLawsuitsPerOwner;
    }

    public int getOwnerMaxLawsuits() {
        return ownerMaxLawsuits;
    }

    public int getOwnerMinLawsuits() {
        return ownerMinLawsuits;
    }

    public int getLawsuitsWithAllOwners() {
        return lawsuitsWithAllOwners;
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

    public String getFirstLawsuitDate() {
        return firstLawsuitDate;
    }

    public String getLastLawsuitDate() {
        return lastLawsuitDate;
    }

    public Map<String, LawsuitDetails> getLawsuits() {
        return Objects.isNull(lawsuits) ? new HashMap<>() : lawsuits;
    }

    public List<String> getActiveOwners() {
        return Objects.isNull(activeOwners) ? new ArrayList<>() : activeOwners;
    }

    public List<String> getInactiveOwners() {
        return Objects.isNull(inactiveOwners) ? new ArrayList<>() : inactiveOwners;
    }
}
