package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

/**
 * The Class HistoricalDataEvolution
 *
 * @author João Lucas Silva de Sousa
 * @sincer 07/10/2024
 */
public class HistoricalDataEvolution {

    @JsonAlias("TradeName")
    private List<TradeName> tradeName;

    @JsonAlias("TaxRegime")
    private List<TaxRegimeHistory> taxRegime;

    public List<TradeName> getTradeName() {
        return tradeName;
    }

    public void setTradeName(List<TradeName> tradeName) {
        this.tradeName = tradeName;
    }

    public List<TaxRegimeHistory> getTaxRegime() {
        return taxRegime;
    }

    public void setTaxRegime(List<TaxRegimeHistory> taxRegime) {
        this.taxRegime = taxRegime;
    }
}
