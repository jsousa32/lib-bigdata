package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * The Class Details
 *
 * @author João Lucas Silva de Sousa
 * @sincer 09/10/2024
 */
public class Details {

    private String originalName;

    private String sanctionName;

    private String sanctionAliasesMatchRate;

    private String remarks;

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getSanctionName() {
        return sanctionName;
    }

    public void setSanctionName(String sanctionName) {
        this.sanctionName = sanctionName;
    }

    public String getSanctionAliasesMatchRate() {
        return sanctionAliasesMatchRate;
    }

    public void setSanctionAliasesMatchRate(String sanctionAliasesMatchRate) {
        this.sanctionAliasesMatchRate = sanctionAliasesMatchRate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
