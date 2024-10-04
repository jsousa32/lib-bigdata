package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Activities {

    @JsonAlias("IsMain")
    private boolean isMain;

    @JsonAlias("Code")
    private String code;

    @JsonAlias("Activity")
    private String activity;

    public boolean isMain() {
        return isMain;
    }

    public String getCode() {
        return code;
    }

    public String getActivity() {
        return activity;
    }
}
