package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import com.fasterxml.jackson.annotation.JsonAlias;

public class LegalNature {

    @JsonAlias("Code")
    private String code;

    @JsonAlias("Activity")
    private String activity;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
