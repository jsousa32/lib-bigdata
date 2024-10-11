package io.github.jsousa32.lib_bigdata.people.entities.university_student_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PublicationHistory {

    private String type;

    private String title;

    private String summary;

    private String abstractText;

    private String source;

    private String role;

    private String yearPublished;

    private List<String> keywords;

    private List<String> authors;

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public String getSource() {
        return source;
    }

    public String getRole() {
        return role;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public List<String> getKeywords() {
        return Objects.isNull(keywords) ? new ArrayList<>() : keywords;
    }

    public List<String> getAuthors() {
        return Objects.isNull(authors) ? new ArrayList<>() : authors;
    }
}
