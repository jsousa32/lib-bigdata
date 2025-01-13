package io.github.jsousa32.lib_bigdata.people.controls;

import io.github.jsousa32.lib_bigdata.application.entities.enums.Dataset;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Domain;
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

final class DefaultPersonService implements PersonService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultPersonService(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        this.uri = uri;
        this.httpEntity = httpEntity;
    }

    @Override
    public BasicData basicData(String document) {
        return execute(document, Dataset.BASIC_DATA, BasicData.class);
    }

    @Override
    public Collections collections(String document) {
        return execute(document, Dataset.COLLECTIONS, Collections.class);
    }

    @Override
    public RelatedLawsuitsDistributionData relatedLawsuitsDistributionData(String document) {
        return execute(document, Dataset.FAMILY_LAWSUITS_DISTRIBUTION_DATA, RelatedLawsuitsDistributionData.class);
    }

    @Override
    public FinancialRisk financialRisk(String document) {
        return execute(document, Dataset.FINANCIAL_RISK, FinancialRisk.class);
    }

    @Override
    public List<FirstLevelRelativesLawsuitsData> firstLevelRelativesLawsuitsData(String document) {
        return execute(document, Dataset.FIRST_LEVEL_RELATIVES_LAWSUITS_DATA, new ParameterizedTypeReference<List<FirstLevelRelativesLawsuitsData>>() {
        });
    }

    @Override
    public GovernmentDebtors governmentDebtors(String document) {
        return execute(document, Dataset.GOVERNMENT_DEBTORS, GovernmentDebtors.class);
    }

    @Override
    public IndebtednessQuestion indebtednessQuestion(String document) {
        return execute(document, Dataset.INDEBTEDNESS_QUESTION, IndebtednessQuestion.class);
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
    public ProfessionData professionData(String document) {
        return execute(document, Dataset.OCCUPATION_DATA, ProfessionData.class);
    }

    @Override
    public Page<LawsuitDetails> lawsuitDetails(int page, int size, String document) {
        return execute(page, size, document, Dataset.PROCESSES, new ParameterizedTypeReference<Page<LawsuitDetails>>() {
        });
    }

    @Override
    public Scholarship scholarship(String document) {
        return execute(document, Dataset.UNIVERSITY_STUNDENT_DATA, Scholarship.class);
    }

    @Override
    public Vehicles vehicles(String document) {
        return execute(document, Dataset.VEHICLES, Vehicles.class);
    }

    private <T> T execute(String document, Dataset dataset, Class<T> responseType) {
        this.uri.pathSegment(Domain.BIGDATA.getLabel()).pathSegment(Scope.PERSON.getLabel()).pathSegment(dataset.getLabel()).queryParam("document", document);

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }

    private <T> T execute(String document, Dataset dataset, ParameterizedTypeReference<T> responseType) {
        this.uri.pathSegment(Domain.BIGDATA.getLabel()).pathSegment(Scope.PERSON.getLabel()).pathSegment(dataset.getLabel()).queryParam("document", document);

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }

    private <T> T execute(int page, int size, String document, Dataset dataset, ParameterizedTypeReference<T> responseType) {
        this.uri.pathSegment(Domain.BIGDATA.getLabel()).pathSegment(Scope.PERSON.getLabel()).pathSegment(dataset.getLabel())
                .queryParam("page", page).queryParam("size", size).queryParam("document", document);

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }
}
