package io.github.jsousa32.lib_bigdata.custom.entities;

import java.util.HashSet;
import java.util.Set;

public class CompanyNatural extends Company {

    private String birthday;

    private Set<LegalRepresentative> legalsRepresentatives = new HashSet<>();

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Set<LegalRepresentative> getLegalsRepresentatives() {
        return legalsRepresentatives;
    }

    public void setLegalsRepresentatives(Set<LegalRepresentative> legalsRepresentatives) {
        this.legalsRepresentatives = legalsRepresentatives;
    }
}
