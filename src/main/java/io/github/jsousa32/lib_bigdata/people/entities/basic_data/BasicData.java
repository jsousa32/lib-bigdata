package io.github.jsousa32.lib_bigdata.people.entities.basic_data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BasicData {

    private String taxIdNumber;

    private String taxIdCountry;

    private Map<String, Object> alternativeIdNumbers;

    private Map<String, ExtendedDocumentInformation> extendedDocumentInformation;

    private String name;

    private Aliases aliases;

    private String gender;

    private int nameWordCount;

    private int numberOfFullNameNamesakes;

    private double nameUniquenessScore;

    private String firstNameUniquenessScore;

    private String firstAndLastNameUniquenessScore;

    private String birthDate;

    private int age;

    private String zodiacSign;

    private String chineseSign;

    private String birthCountry;

    private String motherName;

    private String fatherName;

    private Map<String, Object> maritalStatusData;

    private String taxIdStatus;

    private String taxIdOrigin;

    private String taxIdFiscalRegion;

    private boolean hasObitIndication;

    private String taxIdStatusDate;

    private String taxIdStatusRegistrationDate;

    private String creationDate;

    private String lastUpdateDate;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public String getTaxIdCountry() {
        return taxIdCountry;
    }

    public Map<String, Object> getAlternativeIdNumbers() {
        return Objects.isNull(alternativeIdNumbers) ? new HashMap<>() : alternativeIdNumbers;
    }

    public Map<String, ExtendedDocumentInformation> getExtendedDocumentInformation() {
        return Objects.isNull(extendedDocumentInformation) ? new HashMap<>() : extendedDocumentInformation;
    }

    public String getName() {
        return name;
    }

    public Aliases getAliases() {
        return Objects.isNull(aliases) ? new Aliases() : aliases;
    }

    public String getGender() {
        return gender;
    }

    public int getNameWordCount() {
        return nameWordCount;
    }

    public int getNumberOfFullNameNamesakes() {
        return numberOfFullNameNamesakes;
    }

    public double getNameUniquenessScore() {
        return nameUniquenessScore;
    }

    public String getFirstNameUniquenessScore() {
        return firstNameUniquenessScore;
    }

    public String getFirstAndLastNameUniquenessScore() {
        return firstAndLastNameUniquenessScore;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public String getChineseSign() {
        return chineseSign;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Map<String, Object> getMaritalStatusData() {
        return maritalStatusData;
    }

    public String getTaxIdStatus() {
        return taxIdStatus;
    }

    public String getTaxIdOrigin() {
        return taxIdOrigin;
    }

    public String getTaxIdFiscalRegion() {
        return taxIdFiscalRegion;
    }

    public boolean isHasObitIndication() {
        return hasObitIndication;
    }

    public String getTaxIdStatusDate() {
        return taxIdStatusDate;
    }

    public String getTaxIdStatusRegistrationDate() {
        return taxIdStatusRegistrationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }
}
