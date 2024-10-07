package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
* The Class Aliases
*
* @author João Lucas Silva de Sousa
* @sincer 07/10/2024
*/
public class Aliases {

    @JsonAlias("UnstandardizedRFOfficialName")
    private String unstandardizedRfOfficialName;

    @JsonAlias("UnstandardizedRFTradeName")
    private String unstandardizedRfTradeName;

    public String getUnstandardizedRfOfficialName() {
        return unstandardizedRfOfficialName;
    }

    public void setUnstandardizedRfOfficialName(String unstandardizedRfOfficialName) {
        this.unstandardizedRfOfficialName = unstandardizedRfOfficialName;
    }

    public String getUnstandardizedRfTradeName() {
        return unstandardizedRfTradeName;
    }

    public void setUnstandardizedRfTradeName(String unstandardizedRfTradeName) {
        this.unstandardizedRfTradeName = unstandardizedRfTradeName;
    }
}
