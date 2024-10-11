package io.github.jsousa32.lib_bigdata.companies.controls;


import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.BasicData;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.RegistrationData;

public interface CompanyService {

    RegistrationData registrationData(String document);

    BasicData basicData(String document);
}
