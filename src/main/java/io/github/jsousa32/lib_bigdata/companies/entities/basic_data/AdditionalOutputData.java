package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import java.time.LocalDateTime;

public class AdditionalOutputData {

    private String capital;

    private String capitalRs;

    private String nire;

    private String nireCompanySize;

    private String nireHeadquartersType;

    private String nireHeadquartersCapital;

    private LocalDateTime nireLastCaptureDate;

    private String comex;

    private LocalDateTime comexLastUpdate;

    public String getCapital() {
        return capital;
    }

    public String getCapitalRs() {
        return capitalRs;
    }

    public String getNire() {
        return nire;
    }

    public String getNireCompanySize() {
        return nireCompanySize;
    }

    public String getNireHeadquartersType() {
        return nireHeadquartersType;
    }

    public String getNireHeadquartersCapital() {
        return nireHeadquartersCapital;
    }

    public LocalDateTime getNireLastCaptureDate() {
        return nireLastCaptureDate;
    }

    public String getComex() {
        return comex;
    }

    public LocalDateTime getComexLastUpdate() {
        return comexLastUpdate;
    }
}
