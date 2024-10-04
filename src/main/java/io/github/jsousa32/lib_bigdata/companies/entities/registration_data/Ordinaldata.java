package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Ordinaldata<T> {

    @JsonAlias("Primary")
    private T primary;

    @JsonAlias("Secondary")
    private T secondary;

    @JsonAlias("Tertiary")
    private T tertiary;

    public T getPrimary() {
        return primary;
    }

    public void setPrimary(T primary) {
        this.primary = primary;
    }

    public T getSecondary() {
        return secondary;
    }

    public void setSecondary(T secondary) {
        this.secondary = secondary;
    }

    public T getTertiary() {
        return tertiary;
    }

    public void setTertiary(T tertiary) {
        this.tertiary = tertiary;
    }
}
