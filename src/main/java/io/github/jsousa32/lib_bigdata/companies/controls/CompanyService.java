package io.github.jsousa32.lib_bigdata.companies.controls;


import io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc.EconomicGroupKycData;
import io.github.jsousa32.lib_bigdata.companies.entities.employees_kyc.EmployeesKycData;
import io.github.jsousa32.lib_bigdata.companies.entities.kyc.KycData;
import io.github.jsousa32.lib_bigdata.companies.entities.lawsuits_distribution_data.LawsuitsDistributionData;
import io.github.jsousa32.lib_bigdata.companies.entities.owners_lawsuits.LawsuitDetails;
import io.github.jsousa32.lib_bigdata.companies.entities.owners_lawsuits.OwnersLawsuits;
import io.github.jsousa32.lib_bigdata.companies.entities.owners_lawsuits_distribution_data.OwnersLawsuitsDistributionData;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.BasicData;
import io.github.jsousa32.lib_bigdata.companies.entities.registration_data.RegistrationData;
import io.github.jsousa32.lib_bigdata.utils.Page;
import org.springframework.http.HttpEntity;
import org.springframework.web.util.UriComponentsBuilder;

public interface CompanyService {

    static CompanyService builder(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        return new DefaultCompanyService(uri, httpEntity);
    }

    RegistrationData registrationData(String document);

    BasicData basicData(String document);

    EconomicGroupKycData economicGroupKycData(String document);

    EmployeesKycData employeesKycData(String document);

    KycData kycData(String document);

    LawsuitsDistributionData lawsuitsDistributionData(String document);

    OwnersLawsuits ownersLawsuits(String document);

    OwnersLawsuitsDistributionData ownersLawsuitsDistributionData(String document);

    Page<LawsuitDetails> lawsuitDetails(int page, int size, String document);
}
