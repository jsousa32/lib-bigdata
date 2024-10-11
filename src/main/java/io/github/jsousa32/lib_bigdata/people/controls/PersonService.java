package io.github.jsousa32.lib_bigdata.people.controls;

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

import java.util.List;

public interface PersonService {

    BasicData basicData(String document);

    Collections collections(String document);

    RelatedLawsuitsDistributionData relatedLawsuitsDistributionData(String document);

    FinancialRisk financialRisk(String document);

    List<FirstLevelRelativesLawsuitsData> firstLevelRelativesLawsuitsData(String document);

    GovernmentDebtors governmentDebtors(String document);

    IndebtednessQuestion indebtednessQuestion(String document);

    KycData kycData(String document);

    LawsuitsDistributionData lawsuitsDistributionData(String document);

    ProfessionData professionData(String document);

    Page<LawsuitDetails> lawsuitDetails(int page, int size, String document);

    Scholarship scholarship(String document);

    Vehicles vehicles(String document);
}
