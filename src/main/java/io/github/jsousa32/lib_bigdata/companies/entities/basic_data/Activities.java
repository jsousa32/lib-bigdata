package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * The Class Activities
 *
 * @author João Lucas Silva de Sousa
 * @sincer 07/10/2024
 */
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

    public void setMain(boolean main) {
        isMain = main;
    }

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
