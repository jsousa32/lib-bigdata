package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;

/**
 * The Class TradeName
 *
 * @author João Lucas Silva de Sousa
 * @sincer 07/10/2024
 */
public class TradeName {

    @JsonAlias("Value")
    private String value;

    @JsonAlias("StartDate")
    private LocalDateTime startDate;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
}
