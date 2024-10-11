package io.github.jsousa32.lib_bigdata.people.entities.basic_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExtendedDocumentInformation {

    private String documentLast4Digits;

    private String creationDate;

    private String lastUpdateDate;

    private List<String> sources;

    public String getDocumentLast4Digits() {
        return documentLast4Digits;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public List<String> getSources() {
        return Objects.isNull(sources) ? new ArrayList<>() : sources;
    }
}
