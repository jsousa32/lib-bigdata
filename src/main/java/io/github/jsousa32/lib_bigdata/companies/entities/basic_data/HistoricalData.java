package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import java.util.Objects;

public class HistoricalData {

    private boolean hasChangedTradeName;

    private boolean hasChangedTaxRegime;

    private HistoricalDataEvolution historicalDataEvolution;

    public boolean isHasChangedTradeName() {
        return hasChangedTradeName;
    }

    public boolean isHasChangedTaxRegime() {
        return hasChangedTaxRegime;
    }

    public HistoricalDataEvolution getHistoricalDataEvolution() {
        return Objects.isNull(historicalDataEvolution) ? new HistoricalDataEvolution() : historicalDataEvolution;
    }
}
