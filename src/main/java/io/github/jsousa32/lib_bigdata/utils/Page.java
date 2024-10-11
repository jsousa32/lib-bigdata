package io.github.jsousa32.lib_bigdata.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The Class Page
 *
 * @author João Lucas Silva de Sousa
 * @sincer 11/10/2024
 */
public class Page<T> {

    private int totalPages;

    private int totalElements;

    private List<T> content;

    public int getTotalPages() {
        return totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public List<T> getContent() {
        return Objects.isNull(content) ? new ArrayList<>() : content;
    }
}
