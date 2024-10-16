package io.github.jsousa32.lib_bigdata.custom.entities;

import java.time.LocalDate;

public class CompanyNaturalSimple extends Company {

    private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
