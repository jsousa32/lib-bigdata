package io.github.jsousa32.lib_bigdata.custom.controls;

import io.github.jsousa32.lib_bigdata.application.controls.DealboardEntityWrapper;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegal;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegalSimple;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNatural;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNaturalSimple;

public interface CustomService {

    DealboardEntityWrapper<CompanyLegal> companyLegal(String document);

    DealboardEntityWrapper<CompanyNatural> companyNatural(String document);

    DealboardEntityWrapper<CompanyLegalSimple> companyLegalSimple(String document);

    DealboardEntityWrapper<CompanyNaturalSimple> companyNaturalSimple(String document);
}
