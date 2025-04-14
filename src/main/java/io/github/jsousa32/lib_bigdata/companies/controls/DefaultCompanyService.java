package io.github.jsousa32.lib_bigdata.companies.controls;

import io.github.jsousa32.lib_bigdata.application.entities.enums.Dataset;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Domain;
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
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

final class DefaultCompanyService implements CompanyService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultCompanyService(UriComponentsBuilder uri, HttpHeaders headers) {
        this.uri = uri;
        this.httpEntity = new HttpEntity<>(headers);
    }

    @Override
    public RegistrationData registrationData(String document) {
        return execute(document, Dataset.REGISTRATION, RegistrationData.class);
    }

    @Override
    public BasicData basicData(String document) {
        return execute(document, Dataset.BASIC_DATA, BasicData.class);
    }

    @Override
    public EconomicGroupKycData economicGroupKycData(String document) {
        return execute(document, Dataset.ECONOMIC_GROUP_KYC, EconomicGroupKycData.class);
    }

    @Override
    public EmployeesKycData employeesKycData(String document) {
        return execute(document, Dataset.EMPLOYEES_KYC, EmployeesKycData.class);
    }

    @Override
    public KycData kycData(String document) {
        return execute(document, Dataset.KYC, KycData.class);
    }

    @Override
    public LawsuitsDistributionData lawsuitsDistributionData(String document) {
        return execute(document, Dataset.LAWSUITS_DISTRIBUTION_DATA, LawsuitsDistributionData.class);
    }

    @Override
    public OwnersLawsuits ownersLawsuits(String document) {
        return execute(document, Dataset.OWNERS_LAWSUITS, OwnersLawsuits.class);
    }

    @Override
    public OwnersLawsuitsDistributionData ownersLawsuitsDistributionData(String document) {
        return execute(document, Dataset.OWNERS_LAWSUITS_DISTRIBUTION_DATA, OwnersLawsuitsDistributionData.class);
    }

    @Override
    public Page<LawsuitDetails> lawsuitDetails(int page, int size, String document) {
        return execute(page, size, document, Dataset.PROCESSES, new ParameterizedTypeReference<Page<LawsuitDetails>>() {
        });
    }

    private <T> T execute(String document, Dataset dataset, Class<T> responseType) {
        this.uri.pathSegment(Domain.BIGDATA.getLabel()).pathSegment(Scope.COMPANY.getLabel()).pathSegment(dataset.getLabel()).queryParam("document", document);

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }

    private <T> T execute(int page, int size, String document, Dataset dataset, ParameterizedTypeReference<T> responseType) {
        this.uri.pathSegment(Domain.BIGDATA.getLabel()).pathSegment(Scope.COMPANY.getLabel()).pathSegment(dataset.getLabel())
                .queryParam("page", page).queryParam("size", size).queryParam("document", document);

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }
}
