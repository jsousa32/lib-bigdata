package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;

/**
* The Class TaxRegimeHistory
*
* @author João Lucas Silva de Sousa
* @sincer 07/10/2024
*/
public class TaxRegimeHistory {

    @JsonAlias("Value")
    private String value;

    @JsonAlias("StartDate")
    private LocalDateTime startDate;

    @JsonAlias("EndDate")
    private LocalDateTime endDate;
}
