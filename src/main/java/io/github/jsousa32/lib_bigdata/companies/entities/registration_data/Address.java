package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Address {

    @JsonAlias("Typology")
    private String typology;

    @JsonAlias("Title")
    private String title;

    @JsonAlias("AddressMain")
    private String addressMain;

    @JsonAlias("Number")
    private String number;

    @JsonAlias("Complement")
    private String complement;

    @JsonAlias("Neighborhood")
    private String neighborhood;

    @JsonAlias("ZipCode")
    private String zipCode;

    @JsonAlias("City")
    private String city;

    @JsonAlias("State")
    private String state;

    @JsonAlias("Country")
    private String country;

    @JsonAlias("Type")
    private String type;

    @JsonAlias("ComplementType")
    String complementType;

    public String getTypology() {
        return typology;
    }

    public void setTypology(String typology) {
        this.typology = typology;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddressMain() {
        return addressMain;
    }

    public void setAddressMain(String addressMain) {
        this.addressMain = addressMain;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComplementType() {
        return complementType;
    }

    public void setComplementType(String complementType) {
        this.complementType = complementType;
    }
}
