package io.github.jsousa32.lib_bigdata.people.entities.collections;

public class Collections {

    private String taxIdNumber;

    private boolean isCurrentlyOnCollection;

    private int totalCollectionOccurrences;

    private int totalCollectionOrigins;

    private int last30DaysCollectionOccurrences;

    private int last90DaysCollectionOccurrences;

    private int last180DaysCollectionOccurrences;

    private int last365DaysCollectionOccurrences;

    private int last30DaysCollectionOrigins;

    private int last90DaysCollectionOrigins;

    private int last180DaysCollectionOrigins;

    private int last365DaysCollectionOrigins;

    private int totalCollectionMonths;

    private int currentConsecutiveCollectionMonths;

    private int maxConsecutiveCollectionMonths;

    private String firstCollectionDate;

    private String lastCollectionDate;

    private String creationDate;

    private String lastUpdateDate;

    private int collectionOccurrences;

    private int collectionOrigins;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public boolean isCurrentlyOnCollection() {
        return isCurrentlyOnCollection;
    }

    public int getTotalCollectionOccurrences() {
        return totalCollectionOccurrences;
    }

    public int getTotalCollectionOrigins() {
        return totalCollectionOrigins;
    }

    public int getLast30DaysCollectionOccurrences() {
        return last30DaysCollectionOccurrences;
    }

    public int getLast90DaysCollectionOccurrences() {
        return last90DaysCollectionOccurrences;
    }

    public int getLast180DaysCollectionOccurrences() {
        return last180DaysCollectionOccurrences;
    }

    public int getLast365DaysCollectionOccurrences() {
        return last365DaysCollectionOccurrences;
    }

    public int getLast30DaysCollectionOrigins() {
        return last30DaysCollectionOrigins;
    }

    public int getLast90DaysCollectionOrigins() {
        return last90DaysCollectionOrigins;
    }

    public int getLast180DaysCollectionOrigins() {
        return last180DaysCollectionOrigins;
    }

    public int getLast365DaysCollectionOrigins() {
        return last365DaysCollectionOrigins;
    }

    public int getTotalCollectionMonths() {
        return totalCollectionMonths;
    }

    public int getCurrentConsecutiveCollectionMonths() {
        return currentConsecutiveCollectionMonths;
    }

    public int getMaxConsecutiveCollectionMonths() {
        return maxConsecutiveCollectionMonths;
    }

    public String getFirstCollectionDate() {
        return firstCollectionDate;
    }

    public String getLastCollectionDate() {
        return lastCollectionDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public int getCollectionOccurrences() {
        return collectionOccurrences;
    }

    public int getCollectionOrigins() {
        return collectionOrigins;
    }
}
