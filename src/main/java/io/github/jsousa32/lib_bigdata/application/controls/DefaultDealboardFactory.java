package io.github.jsousa32.lib_bigdata.application.controls;

import io.github.jsousa32.lib_bigdata.addresses.controls.AddressService;
import io.github.jsousa32.lib_bigdata.addresses.controls.DefaultAddressService;
import io.github.jsousa32.lib_bigdata.application.entities.enums.IntegrationScope;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
import io.github.jsousa32.lib_bigdata.companies.controls.CompanyService;
import io.github.jsousa32.lib_bigdata.companies.controls.DefaultCompanyService;
import io.github.jsousa32.lib_bigdata.custom.controls.CustomService;
import io.github.jsousa32.lib_bigdata.custom.controls.DefaultCustomService;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegal;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNatural;
import io.github.jsousa32.lib_bigdata.people.controls.DefaultPersonService;
import io.github.jsousa32.lib_bigdata.people.controls.PersonService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class DefaultDealboardFactory implements DealbordFactory {

    private final static String PATH_BASE = "/api/v1/integration/";

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

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

    @Override
    public AddressService address() {
        return new DefaultAddressService(this.uri, this.httpEntity);
    }

    @Override
    public CustomService custom() {
        return new DefaultCustomService(this.uri, this.httpEntity);
    }

    @Override
    public void create(CompanyLegal companyLegal) {
        restTemplate.exchange(uri(CompanyLegal.class), HttpMethod.POST, this.httpEntity, Void.class, companyLegal);
    }

    @Override
    public void create(CompanyNatural companyNatural) {
        restTemplate.exchange(uri(CompanyNatural.class), HttpMethod.POST, this.httpEntity, Void.class, companyNatural);
    }

    private String uri(Class<?> clazz) {
        return uri.replacePath(PATH_BASE).replaceQuery(null).pathSegment(Scope.COMPANIES.getLabel()).pathSegment(IntegrationScope.getSegment(clazz))
                .toUriString();
    }
}
