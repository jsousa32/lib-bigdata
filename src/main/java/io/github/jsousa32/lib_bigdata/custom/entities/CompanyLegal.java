package io.github.jsousa32.lib_bigdata.custom.entities;

import io.github.jsousa32.lib_bigdata.custom.enums.TaxRegime;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CompanyLegal extends Company {

    private String tradeName;

    private TaxRegime taxRegime;

    private boolean headquartes;

    private LocalDate openingDate;

    private String capital;

    private Set<Cnae> cnaes = new HashSet<>();

    private Set<LegalRepresentative> legalsRepresentatives = new HashSet<>();

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public TaxRegime getTaxRegime() {
        return taxRegime;
    }

    public void setTaxRegime(TaxRegime taxRegime) {
        this.taxRegime = taxRegime;
    }

    public boolean isHeadquartes() {
        return headquartes;
    }

    public void setHeadquartes(boolean headquartes) {
        this.headquartes = headquartes;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
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

    public Set<LegalRepresentative> getLegalsRepresentatives() {
        return legalsRepresentatives;
    }

    public void setLegalsRepresentatives(Set<LegalRepresentative> legalsRepresentatives) {
        this.legalsRepresentatives = legalsRepresentatives;
    }
}
