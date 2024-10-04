package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Phones {

    @JsonAlias("Number")
    private String number;

    @JsonAlias("AreaCode")
    private String areaCode;

    @JsonAlias("CountryCode")
    private String countryCode;

    @JsonAlias("Complement")
    private String complement;

    @JsonAlias("Type")
    private String type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
