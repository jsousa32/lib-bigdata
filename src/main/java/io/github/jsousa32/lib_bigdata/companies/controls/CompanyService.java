package io.github.jsousa32.lib_bigdata.companies.controls;


import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.BasicData;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.RegistrationData;

public interface CompanyService {

    static Builder builder() {
        return new DefaultCompanyServiceBuilder();
    }

    interface Builder {

        Builder accessToken(String accessToken);

        Builder document(String document);

        CompanyService build();
    }

    RegistrationData registrationData(String document);

    BasicData basicData(String document);
}
