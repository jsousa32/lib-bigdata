package io.github.jsousa32.lib_bigdata.custom.controls;

import io.github.jsousa32.lib_bigdata.application.controls.DealboardEntityWrapper;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegal;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegalSimple;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNatural;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNaturalSimple;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

public interface CustomService {

    static CustomService builder(UriComponentsBuilder uri, HttpHeaders headers) {
        return new DefaultCustomService(uri, headers);
    }

    DealboardEntityWrapper<CompanyLegal> companyLegal(String document);

    DealboardEntityWrapper<CompanyNatural> companyNatural(String document);

    DealboardEntityWrapper<CompanyLegalSimple> companyLegalSimple(String document);

    DealboardEntityWrapper<CompanyNaturalSimple> companyNaturalSimple(String document);
}
