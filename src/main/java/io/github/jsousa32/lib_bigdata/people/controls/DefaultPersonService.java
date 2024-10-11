package io.github.jsousa32.lib_bigdata.people.controls;

import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
import io.github.jsousa32.lib_bigdata.people.entities.basic_data.BasicData;
import io.github.jsousa32.lib_bigdata.people.entities.collections.Collections;
import io.github.jsousa32.lib_bigdata.people.entities.family_lawsuits_distribution_data.RelatedLawsuitsDistributionData;
import io.github.jsousa32.lib_bigdata.people.entities.financial_risk.FinancialRisk;
import io.github.jsousa32.lib_bigdata.people.entities.first_level_relatives_lawsuit_data.FirstLevelRelativesLawsuitsData;
import io.github.jsousa32.lib_bigdata.people.entities.government_debtors.GovernmentDebtors;
import io.github.jsousa32.lib_bigdata.people.entities.indebtedness_question.IndebtednessQuestion;
import io.github.jsousa32.lib_bigdata.people.entities.kyc.KycData;
import io.github.jsousa32.lib_bigdata.people.entities.lawsuits_distribution_data.LawsuitsDistributionData;
import io.github.jsousa32.lib_bigdata.people.entities.occupation_data.ProfessionData;
import io.github.jsousa32.lib_bigdata.people.entities.processes.LawsuitDetails;
import io.github.jsousa32.lib_bigdata.people.entities.university_student_data.Scholarship;
import io.github.jsousa32.lib_bigdata.people.entities.vehicles.Vehicles;
import io.github.jsousa32.lib_bigdata.utils.Page;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public class DefaultPersonService implements PersonService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultPersonService(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        this.uri = uri;
        this.httpEntity = httpEntity;
    }

    @Override
    public BasicData basicData(String document) {
        return execute(document, Scope.BASIC_DATA, BasicData.class);
    }

    @Override
    public Collections collections(String document) {
        return execute(document, Scope.COLLECTIONS, Collections.class);
    }

    @Override
    public RelatedLawsuitsDistributionData relatedLawsuitsDistributionData(String document) {
        return execute(document, Scope.FAMILY_LAWSUITS_DISTRIBUTION_DATA, RelatedLawsuitsDistributionData.class);
    }

    @Override
    public FinancialRisk financialRisk(String document) {
        return execute(document, Scope.FINANCIAL_RISK, FinancialRisk.class);
    }

    @Override
    public List<FirstLevelRelativesLawsuitsData> firstLevelRelativesLawsuitsData(String document) {
        return execute(document, Scope.FIRST_LEVEL_RELATIVES_LAWSUITS_DATA, new ParameterizedTypeReference<List<FirstLevelRelativesLawsuitsData>>() {
        });
    }

    @Override
    public GovernmentDebtors governmentDebtors(String document) {
        return execute(document, Scope.GOVERNMENT_DEBTORS, GovernmentDebtors.class);
    }

    @Override
    public IndebtednessQuestion indebtednessQuestion(String document) {
        return execute(document, Scope.INDEBTEDNESS_QUESTION, IndebtednessQuestion.class);
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
    public ProfessionData professionData(String document) {
        return execute(document, Scope.OCCUPATION_DATA, ProfessionData.class);
    }

    @Override
    public Page<LawsuitDetails> lawsuitDetails(int page, int size, String document) {
        return execute(page, size, document, Scope.PROCESSES, new ParameterizedTypeReference<Page<LawsuitDetails>>() {
        });
    }

    @Override
    public Scholarship scholarship(String document) {
        return execute(document, Scope.UNIVERSITY_STUNDENT_DATA, Scholarship.class);
    }

    @Override
    public Vehicles vehicles(String document) {
        return execute(document, Scope.VEHICLES, Vehicles.class);
    }

    private <T> T execute(String document, Scope scope, Class<T> responseType) {
        this.uri.queryParam("document", document);
        this.uri.path(scope.getDataset());

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }

    private <T> T execute(String document, Scope scope, ParameterizedTypeReference<T> responseType) {
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
