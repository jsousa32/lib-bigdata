package io.github.jsousa32.lib_bigdata.custom.entities;

import java.util.HashSet;
import java.util.Set;

public class CompanyLegalSimple extends Company {

    private String tradeName;

    private String taxRegime;

    private boolean headquartes;

    private String openingDate;

    private String capital;

    private Double averageRavenue;

    private String registrationMunicipal;

    private String registrationState;

    private String registrationSuframa;

    private Set<Cnae> cnaes = new HashSet<>();

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTaxRegime() {
        return taxRegime;
    }

    public void setTaxRegime(String taxRegime) {
        this.taxRegime = taxRegime;
    }

    public boolean isHeadquartes() {
        return headquartes;
    }

    public void setHeadquartes(boolean headquartes) {
        this.headquartes = headquartes;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Set<Cnae> getCnaes() {
        return cnaes;
    }

    public void setCnaes(Set<Cnae> cnaes) {
        this.cnaes = cnaes;
    }

    public Double getAverageRavenue() {
        return averageRavenue;
    }

    public void setAverageRavenue(Double averageRavenue) {
        this.averageRavenue = averageRavenue;
    }

    public String getRegistrationMunicipal() {
        return registrationMunicipal;
    }

    public void setRegistrationMunicipal(String registrationMunicipal) {
        this.registrationMunicipal = registrationMunicipal;
    }

    public String getRegistrationState() {
        return registrationState;
    }

    public void setRegistrationState(String registrationState) {
        this.registrationState = registrationState;
    }

    public String getRegistrationSuframa() {
        return registrationSuframa;
    }

    public void setRegistrationSuframa(String registrationSuframa) {
        this.registrationSuframa = registrationSuframa;
    }
}
