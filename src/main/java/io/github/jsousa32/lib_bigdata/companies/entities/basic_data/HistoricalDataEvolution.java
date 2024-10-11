package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HistoricalDataEvolution {

    private List<TradeName> tradeName;

    private List<TaxRegimeHistory> taxRegime;

    public List<TradeName> getTradeName() {
        return Objects.isNull(tradeName) ? new ArrayList<>() : tradeName;
    }

    public List<TaxRegimeHistory> getTaxRegime() {
        return Objects.isNull(taxRegime) ? new ArrayList<>() : taxRegime;
    }
}
