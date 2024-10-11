package io.github.jsousa32.lib_bigdata.companies.controls;

import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
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
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class DefaultCompanyService implements CompanyService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultCompanyService(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        this.uri = uri;
        this.httpEntity = httpEntity;
    }

    @Override
    public RegistrationData registrationData(String document) {
        return execute(document, Scope.REGISTRATION, RegistrationData.class);
    }

    @Override
    public BasicData basicData(String document) {
        return execute(document, Scope.BASIC_DATA, BasicData.class);
    }

    @Override
    public EconomicGroupKycData economicGroupKycData(String document) {
        return execute(document, Scope.ECONOMIC_GROUP_KYC, EconomicGroupKycData.class);
    }

    @Override
    public EmployeesKycData employeesKycData(String document) {
        return execute(document, Scope.EMPLOYEES_KYC, EmployeesKycData.class);
    }

    @Override
    public KycData kycData(String document) {
        return execute(document, Scope.KYC, KycData.class);
    }

    @Override
    public LawsuitsDistributionData lawsuitsDistributionData(String document) {
        return execute(document, Scope.LAWSUITS_DISTRIBUTION_DATA, LawsuitsDistributionData.class);
    }

    @Override
    public OwnersLawsuits ownersLawsuits(String document) {
        return execute(document, Scope.OWNERS_LAWSUITS, OwnersLawsuits.class);
    }

    @Override
    public OwnersLawsuitsDistributionData ownersLawsuitsDistributionData(String document) {
        return execute(document, Scope.OWNERS_LAWSUITS_DISTRIBUTION_DATA, OwnersLawsuitsDistributionData.class);
    }

    @Override
    public Page<LawsuitDetails> lawsuitDetails(int page, int size, String document) {
        return execute(page, size, document, Scope.PROCESSES, new ParameterizedTypeReference<Page<LawsuitDetails>>() {});
    }

    private <T> T execute(String document, Scope scope, Class<T> responseType) {
        this.uri.queryParam("document", document);
        this.uri.path(scope.getDataset());

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }

    private <T> T execute(int page, int size, String document, Scope scope, ParameterizedTypeReference<T> responseType) {
        this.uri.queryParam("page", page);
        this.uri.queryParam("size", size);
        this.uri.queryParam("document", document);
        this.uri.path(scope.getDataset());

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }
}
