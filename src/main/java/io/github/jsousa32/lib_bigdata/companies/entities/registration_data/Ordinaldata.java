package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;


public class Ordinaldata<T> {

    private T primary;

    private T secondary;

    private T tertiary;

    public T getPrimary() {
        return primary;
    }

    public T getSecondary() {
        return secondary;
    }

    public T getTertiary() {
        return tertiary;
    }
}
