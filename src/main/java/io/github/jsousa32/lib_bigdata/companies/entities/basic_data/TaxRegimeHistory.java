package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import java.time.LocalDateTime;

public class TaxRegimeHistory {

    private String value;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

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

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
