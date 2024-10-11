package io.github.jsousa32.lib_bigdata.application.controls;

import io.github.jsousa32.lib_bigdata.addresses.controls.AddressService;
import io.github.jsousa32.lib_bigdata.companies.controls.CompanyService;
import io.github.jsousa32.lib_bigdata.people.controls.PersonService;

public interface DealbordFactory {

    CompanyService company();

    PersonService person();

    AddressService address();
}
