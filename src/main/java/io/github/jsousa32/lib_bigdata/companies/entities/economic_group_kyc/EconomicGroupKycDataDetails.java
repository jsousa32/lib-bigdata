package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;

import java.util.Objects;

public class EconomicGroupKycDataDetails {

    private String docNumber;

    private String docType;

    private KycData kycData;

    public String getDocNumber() {
        return docNumber;
    }

    public String getDocType() {
        return docType;
    }

    public KycData getKycData() {
        return Objects.isNull(kycData) ? new KycData() : kycData;
    }
}
