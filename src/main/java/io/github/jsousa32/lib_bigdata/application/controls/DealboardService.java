package io.github.jsousa32.lib_bigdata.application.controls;

import io.github.jsousa32.lib_bigdata.addresses.controls.AddressService;
import io.github.jsousa32.lib_bigdata.companies.controls.CompanyService;
import io.github.jsousa32.lib_bigdata.custom.controls.CustomService;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyLegal;
import io.github.jsousa32.lib_bigdata.custom.entities.CompanyNatural;
import io.github.jsousa32.lib_bigdata.people.controls.PersonService;

public interface DealboardService {

    CompanyService company();

    PersonService person();

    AddressService address();

    CustomService custom();

    void create(CompanyLegal companyLegal);

    void create(CompanyNatural companyNatural);
}
