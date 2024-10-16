package io.github.jsousa32.lib_bigdata.custom.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CompanyLegal extends Company {

    private String legalNature;

    private boolean headquartes;

    private LocalDate openingDate;

    private String capital;

    private Set<Cnae> cnaes = new HashSet<>();

    private Set<LegalRepresentative> legalRepresentativeSchemas = new HashSet<>();

    public String getLegalNature() {
        return legalNature;
    }

    public void setLegalNature(String legalNature) {
        this.legalNature = legalNature;
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

    public Set<LegalRepresentative> getLegalRepresentativeSchemas() {
        return legalRepresentativeSchemas;
    }

    public void setLegalRepresentativeSchemas(Set<LegalRepresentative> legalRepresentativeSchemas) {
        this.legalRepresentativeSchemas = legalRepresentativeSchemas;
    }
}
