package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import com.fasterxml.jackson.annotation.JsonAlias;

public class AdditionalOutputData {

    @JsonAlias("Capital")
    private String capital;

    @JsonAlias("CapitalRS")
    private String capitalRS;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapitalRS() {
        return capitalRS;
    }

    public void setCapitalRS(String capitalRS) {
        this.capitalRS = capitalRS;
    }
}
