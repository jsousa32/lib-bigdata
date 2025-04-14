package io.github.jsousa32.lib_bigdata.application.entities.enums;

import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegal;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNatural;

public enum IntegrationScope {
    COMPANY_LEGAL(CompanyLegal.class, "create-legal"),

    COMPANY_NATURAL(CompanyNatural.class, "create-natural");

    private final Class<?> clazz;

    private final String segment;

    IntegrationScope(Class<?> clazz, String segment) {
        this.clazz = clazz;
        this.segment = segment;
    }

    public static String getSegment(Class<?> clazz) {
        for (IntegrationScope type : values()) {
            if (type.clazz.equals(clazz)) {
                return type.segment;
            }
        }
        throw new IllegalArgumentException("No avaliable segment.");
    }
}
