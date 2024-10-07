package io.github.jsousa32.lib_bigdata.companies.entities.basic_data;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;

/**
 * The Class AdditionalOutputData
 *
 * @author João Lucas Silva de Sousa
 * @sincer 07/10/2024
 */
public class AdditionalOutputData {

    @JsonAlias("Capital")
    private String capital;

    @JsonAlias("CapitalRS")
    private String capitalRs;

    @JsonAlias("NIRE")
    private String nire;

    @JsonAlias("NIRECompanySize")
    private String nireCompanySize;

    @JsonAlias("NIREHeadquartersType")
    private String nireHeadquartersType;

    @JsonAlias("NIREHeadquartersCapital")
    private String nireHeadquartersCapital;

    @JsonAlias("NIRELastCaptureDate")
    private LocalDateTime nireLastCaptureDate;

    @JsonAlias("COMEX")
    private String comex;

    @JsonAlias("COMEXLastUpdate")
    private LocalDateTime comexLastUpdate;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapitalRs() {
        return capitalRs;
    }

    public void setCapitalRs(String capitalRs) {
        this.capitalRs = capitalRs;
    }

    public String getNire() {
        return nire;
    }

    public void setNire(String nire) {
        this.nire = nire;
    }

    public String getNireCompanySize() {
        return nireCompanySize;
    }

    public void setNireCompanySize(String nireCompanySize) {
        this.nireCompanySize = nireCompanySize;
    }

    public String getNireHeadquartersType() {
        return nireHeadquartersType;
    }

    public void setNireHeadquartersType(String nireHeadquartersType) {
        this.nireHeadquartersType = nireHeadquartersType;
    }

    public String getNireHeadquartersCapital() {
        return nireHeadquartersCapital;
    }

    public void setNireHeadquartersCapital(String nireHeadquartersCapital) {
        this.nireHeadquartersCapital = nireHeadquartersCapital;
    }

    public LocalDateTime getNireLastCaptureDate() {
        return nireLastCaptureDate;
    }

    public void setNireLastCaptureDate(LocalDateTime nireLastCaptureDate) {
        this.nireLastCaptureDate = nireLastCaptureDate;
    }

    public String getComex() {
        return comex;
    }

    public void setComex(String comex) {
        this.comex = comex;
    }

    public LocalDateTime getComexLastUpdate() {
        return comexLastUpdate;
    }

    public void setComexLastUpdate(LocalDateTime comexLastUpdate) {
        this.comexLastUpdate = comexLastUpdate;
    }
}
