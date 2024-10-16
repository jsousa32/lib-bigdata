package io.github.jsousa32.lib_bigdata.custom.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CompanyNatural extends Company {

    private LocalDate birthday;

    private Set<LegalRepresentative> legalRepresentatives = new HashSet<>();

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Set<LegalRepresentative> getLegalRepresentatives() {
        return legalRepresentatives;
    }

    public void setLegalRepresentatives(Set<LegalRepresentative> legalRepresentatives) {
        this.legalRepresentatives = legalRepresentatives;
    }
}
