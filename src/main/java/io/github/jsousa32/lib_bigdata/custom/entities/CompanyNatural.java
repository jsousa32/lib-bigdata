package io.github.jsousa32.lib_bigdata.custom.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CompanyNatural extends Company {

    private LocalDate birthday;

    private Set<LegalRepresentative> legalsRepresentatives = new HashSet<>();

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Set<LegalRepresentative> getLegalsRepresentatives() {
        return legalsRepresentatives;
    }

    public void setLegalsRepresentatives(Set<LegalRepresentative> legalsRepresentatives) {
        this.legalsRepresentatives = legalsRepresentatives;
    }
}
