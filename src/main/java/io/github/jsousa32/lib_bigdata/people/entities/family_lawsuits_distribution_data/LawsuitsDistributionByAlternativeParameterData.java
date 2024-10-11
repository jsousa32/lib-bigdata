package io.github.jsousa32.lib_bigdata.people.entities.family_lawsuits_distribution_data;

import java.util.*;

public class LawsuitsDistributionByAlternativeParameterData {

    private String alternativeParameterName;

    private List<String> distributionFieldNames;

    private Map<String, Map<String, Integer>> lawsuitsDistributionByAlternativeParameterValues;

    public String getAlternativeParameterName() {
        return alternativeParameterName;
    }

    public List<String> getDistributionFieldNames() {
        return Objects.isNull(distributionFieldNames) ? new ArrayList<>() : distributionFieldNames;
    }

    public Map<String, Map<String, Integer>> getLawsuitsDistributionByAlternativeParameterValues() {
        return Objects.isNull(lawsuitsDistributionByAlternativeParameterValues) ? new HashMap<>() : lawsuitsDistributionByAlternativeParameterValues;
    }
}
