package io.github.jsousa32.lib_bigdata.people.entities.occupation_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Profession {

    private String source;

    private String sector;

    private String city;

    private String state;

    private String country;

    private String companyIdNumber;

    private String companyName;

    private String area;

    private String level;

    private String status;

    private String incomeRange;

    private double income;

    private double discount;

    private double rating;

    private List<String> declaredSkills;

    private List<String> declaredInterests;

    private String startDate;

    private String endDate;

    private AdditionalDetails additionalDetails;

    private List<IncomeHistory> incomeHistory;

    public String getSource() {
        return source;
    }

    public String getSector() {
        return sector;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getCompanyIdNumber() {
        return companyIdNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getArea() {
        return area;
    }

    public String getLevel() {
        return level;
    }

    public String getStatus() {
        return status;
    }

    public String getIncomeRange() {
        return incomeRange;
    }

    public double getIncome() {
        return income;
    }

    public double getDiscount() {
        return discount;
    }

    public double getRating() {
        return rating;
    }

    public List<String> getDeclaredSkills() {
        return Objects.isNull(declaredSkills) ? new ArrayList<>() : declaredSkills;
    }

    public List<String> getDeclaredInterests() {
        return Objects.isNull(declaredInterests) ? new ArrayList<>() : declaredInterests;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public AdditionalDetails getAdditionalDetails() {
        return Objects.isNull(additionalDetails) ? new AdditionalDetails() : additionalDetails;
    }

    public List<IncomeHistory> getIncomeHistory() {
        return Objects.isNull(incomeHistory) ? new ArrayList<>() : incomeHistory;
    }
}
