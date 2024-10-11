package io.github.jsousa32.lib_bigdata.people.entities.university_student_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Scholarship {

    private String taxIdNumber;

    private List<ScholarshipHistory> scholarshipHistory;

    private List<PublicationHistory> publicationHistory;

    private String scholarshipLevel;

    private String educationalLevel;

    private int numberOfUndergraduateCourses;

    private boolean isUniversityStudent;

    private boolean isCurrentlyOnAcademicField;

    private String creationDate;

    private String lastUpdateDate;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public List<ScholarshipHistory> getScholarshipHistory() {
        return Objects.isNull(scholarshipHistory) ? new ArrayList<>() : scholarshipHistory;
    }

    public List<PublicationHistory> getPublicationHistory() {
        return Objects.isNull(publicationHistory) ? new ArrayList<>() : publicationHistory;
    }

    public String getScholarshipLevel() {
        return scholarshipLevel;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public int getNumberOfUndergraduateCourses() {
        return numberOfUndergraduateCourses;
    }

    public boolean isUniversityStudent() {
        return isUniversityStudent;
    }

    public boolean isCurrentlyOnAcademicField() {
        return isCurrentlyOnAcademicField;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }
}
