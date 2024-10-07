package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * The Class TaxRegimes
 *
 * @author João Lucas Silva de Sousa
 * @sincer 07/10/2024
 */
public class TaxRegimes {

    @JsonAlias("Simples")
    private boolean simples;

    public boolean isSimples() {
        return simples;
    }

    public void setSimples(boolean simples) {
        this.simples = simples;
    }
}
