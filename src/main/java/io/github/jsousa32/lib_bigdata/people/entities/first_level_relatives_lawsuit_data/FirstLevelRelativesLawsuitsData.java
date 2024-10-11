package io.github.jsousa32.lib_bigdata.people.entities.first_level_relatives_lawsuit_data;

import java.util.Objects;

public class FirstLevelRelativesLawsuitsData {

    private String taxIdNumber;

    private String docNumber;

    private String relationshipType;

    private LawsuitsData lawsuitsData;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public LawsuitsData getLawsuitsData() {
        return Objects.isNull(lawsuitsData) ? new LawsuitsData() : lawsuitsData;
    }
}
