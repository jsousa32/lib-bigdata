package io.github.jsousa32.lib_bigdata.application.controls;

import io.github.jsousa32.lib_bigdata.companies.controls.CompanyService;
import io.github.jsousa32.lib_bigdata.companies.controls.DefaultCompanyService;
import io.github.jsousa32.lib_bigdata.person.controls.DefaultPersonService;
import io.github.jsousa32.lib_bigdata.person.controls.PersonService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * The Class DefaultDealboardScopeBuilder
 *
 * @author João Lucas Silva de Sousa
 * @sincer 10/10/2024
 */
public class DefaultDealboardFactory implements DealbordFactory {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    public DefaultDealboardFactory(UriComponentsBuilder uri, HttpHeaders headers) {
        this.uri = uri;
        this.httpEntity = new HttpEntity<>(headers);
    }

    @Override
    public CompanyService company() {
        return new DefaultCompanyService(this.uri, this.httpEntity);
    }

    @Override
    public PersonService person() {
        return new DefaultPersonService(this.uri, this.httpEntity);
    }
}
