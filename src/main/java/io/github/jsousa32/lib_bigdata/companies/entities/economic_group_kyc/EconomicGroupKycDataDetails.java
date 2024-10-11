package io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc;

/**
 * The Class KycData
 *
 * @author João Lucas Silva de Sousa
 * @sincer 09/10/2024
 */
public class EconomicGroupKycDataDetails {

    private String docNumber;

    private String docType;

    private KycData kycData;

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public KycData getKycData() {
        return kycData;
    }

    public void setKycData(KycData kycData) {
        this.kycData = kycData;
    }
}
