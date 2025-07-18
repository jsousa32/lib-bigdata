package io.github.jsousa32.lib_bigdata.custom.entities;

import io.github.jsousa32.lib_bigdata.custom.enums.Country;
import io.github.jsousa32.lib_bigdata.custom.enums.InvestorProfile;
import io.github.jsousa32.lib_bigdata.custom.enums.MaritalStatus;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CompanyNatural extends Company {

    private String birthday;

    private String birthCountry;

    private String fatherName;

    private String motherName;

    private String issuingAuthority;

    private LocalDate dateOfIssue;

    private MaritalStatus maritalStatus;

    private String profession;

    private Double monthlyIncome;

    private Double financialInvestment;

    private Double totalAssets;

    private String currentEmployer;

    private String employerDocument;

    private LocalDate startDateOfActivities;

    private Boolean hasResidenceInAnotherCountry;

    private String nif;

    private String nifType;

    private Country country;

    private InvestorProfile investorProfile;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Double getFinancialInvestment() {
        return financialInvestment;
    }

    public void setFinancialInvestment(Double financialInvestment) {
        this.financialInvestment = financialInvestment;
    }

    public Double getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(Double totalAssets) {
        this.totalAssets = totalAssets;
    }

    public String getCurrentEmployer() {
        return currentEmployer;
    }

    public void setCurrentEmployer(String currentEmployer) {
        this.currentEmployer = currentEmployer;
    }

    public String getEmployerDocument() {
        return employerDocument;
    }

    public void setEmployerDocument(String employerDocument) {
        this.employerDocument = employerDocument;
    }

    public LocalDate getStartDateOfActivities() {
        return startDateOfActivities;
    }

    public void setStartDateOfActivities(LocalDate startDateOfActivities) {
        this.startDateOfActivities = startDateOfActivities;
    }

    public Boolean getHasResidenceInAnotherCountry() {
        return hasResidenceInAnotherCountry;
    }

    public void setHasResidenceInAnotherCountry(Boolean hasResidenceInAnotherCountry) {
        this.hasResidenceInAnotherCountry = hasResidenceInAnotherCountry;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNifType() {
        return nifType;
    }

    public void setNifType(String nifType) {
        this.nifType = nifType;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public InvestorProfile getInvestorProfile() {
        return investorProfile;
    }

    public void setInvestorProfile(InvestorProfile investorProfile) {
        this.investorProfile = investorProfile;
    }
}
