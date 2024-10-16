package io.github.jsousa32.lib_bigdata.custom.controls;

import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegal;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegalSimple;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNatural;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNaturalSimple;

public interface CustomService {

    CompanyLegal companyLegal(String document);

    CompanyNatural companyNatural(String document);

    CompanyLegalSimple companyLegalSimple(String document);

    CompanyNaturalSimple companyNaturalSimple(String document);
}
