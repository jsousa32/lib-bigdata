package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * The Class HistoricalData
 *
 * @author João Lucas Silva de Sousa
 * @sincer 07/10/2024
 */
public class HistoricalData {

    @JsonAlias("HasChangedTradeName")
    private boolean hasChangedTradeName;

    @JsonAlias("HasChangedTaxRegime")
    private boolean hasChangedTaxRegime;

    @JsonAlias("HistoricalDataEvolution")
    private HistoricalDataEvolution historicalDataEvolution;
}
