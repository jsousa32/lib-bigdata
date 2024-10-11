package io.github.jsousa32.lib_bigdata.people.entities.first_level_relatives_lawsuit_data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LawsuitsData {

    private List<LawsuitDetails> lawsuits;

    public List<LawsuitDetails> getLawsuits() {
        return Objects.isNull(lawsuits) ? new ArrayList<>() : lawsuits;
    }
}
