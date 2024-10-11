package io.github.jsousa32.lib_bigdata.companies.controls;


import io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc.EconomicGroupKycData;
import io.github.jsousa32.lib_bigdata.companies.entities.employees_kyc.EmployeesKycData;
import io.github.jsousa32.lib_bigdata.companies.entities.kyc.KycData;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.BasicData;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.RegistrationData;

public interface CompanyService {

    RegistrationData registrationData(String document);

    BasicData basicData(String document);

    EconomicGroupKycData economicGroupKycData(String document);

    EmployeesKycData employeesKycData(String document);

    KycData kycData(String document);
}
