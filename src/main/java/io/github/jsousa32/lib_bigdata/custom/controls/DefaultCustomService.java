package io.github.jsousa32.lib_bigdata.custom.controls;

import io.github.jsousa32.lib_bigdata.application.controls.DealboardEntityWrapper;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Dataset;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Domain;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegal;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegalSimple;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNatural;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNaturalSimple;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

final class DefaultCustomService implements CustomService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultCustomService(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        this.uri = uri;
        this.httpEntity = httpEntity;
    }

    @Override
    public DealboardEntityWrapper<CompanyLegal> companyLegal(String document) {
        return DealboardEntityWrapper.builder(
                execute(document, Dataset.LEGAL, CompanyLegal.class), this.httpEntity, this.uri);
    }

    @Override
    public DealboardEntityWrapper<CompanyNatural> companyNatural(String document) {
        return DealboardEntityWrapper.builder(
                execute(document, Dataset.NATURAL, CompanyNatural.class), this.httpEntity, this.uri);
    }

    @Override
    public DealboardEntityWrapper<CompanyLegalSimple> companyLegalSimple(String document) {
        return DealboardEntityWrapper.builder(
                execute(document, Dataset.LEGAL_SIMPLE, CompanyLegalSimple.class), this.httpEntity, this.uri);
    }

    @Override
    public DealboardEntityWrapper<CompanyNaturalSimple> companyNaturalSimple(String document) {
        return DealboardEntityWrapper.builder(
                execute(document, Dataset.NATURAL_SIMPLE, CompanyNaturalSimple.class), this.httpEntity, this.uri);
    }

    private <T> T execute(String document, Dataset dataset, Class<T> responseType) {
        this.uri.pathSegment(Domain.CUSTOM.getLabel()).pathSegment(Scope.COMPANY.getLabel()).path(dataset.getLabel())
                .queryParam("document", document);

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }
}
