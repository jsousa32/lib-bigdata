package io.github.jsousa32.lib_bigdata.people.entities.kyc;

import io.github.jsousa32.lib_bigdata.companies.entities.economic_group_kyc.PepHistory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KycData {

    private String taxIdNumber;

    private List<PepHistory> pepHistory;

    private boolean isCurentlyElectoralDonor;

    private boolean isHitoricalElectoralDonor;

    private int totalElectoralDonationsLastTwoElections;

    private int totalElectoralDonations;

    private double totalElectoralDonationAmountLastTwoElections;

    private double totalElectoralDonationAmount;

    private boolean isHiredByPublicAgency;

    private boolean isHistoricallyHiredByPublicAgency;

    private boolean isHiredForPolitalCampaign;

    private boolean isHistoricallyHiredForPoliticalCampaign;

    private String politicalEngagementLevel;

    private boolean isCurrentlyPEP;

    private List<Amnesty> amnestiesHistory;

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public List<PepHistory> getPepHistory() {
        return Objects.isNull(pepHistory) ? new ArrayList<>() : pepHistory;
    }

    public boolean isCurentlyElectoralDonor() {
        return isCurentlyElectoralDonor;
    }

    public boolean isHitoricalElectoralDonor() {
        return isHitoricalElectoralDonor;
    }

    public int getTotalElectoralDonationsLastTwoElections() {
        return totalElectoralDonationsLastTwoElections;
    }

    public int getTotalElectoralDonations() {
        return totalElectoralDonations;
    }

    public double getTotalElectoralDonationAmountLastTwoElections() {
        return totalElectoralDonationAmountLastTwoElections;
    }

    public double getTotalElectoralDonationAmount() {
        return totalElectoralDonationAmount;
    }

    public boolean isHiredByPublicAgency() {
        return isHiredByPublicAgency;
    }

    public boolean isHistoricallyHiredByPublicAgency() {
        return isHistoricallyHiredByPublicAgency;
    }

    public boolean isHiredForPolitalCampaign() {
        return isHiredForPolitalCampaign;
    }

    public boolean isHistoricallyHiredForPoliticalCampaign() {
        return isHistoricallyHiredForPoliticalCampaign;
    }

    public String getPoliticalEngagementLevel() {
        return politicalEngagementLevel;
    }

    public boolean isCurrentlyPEP() {
        return isCurrentlyPEP;
    }

    public List<Amnesty> getAmnestiesHistory() {
        return Objects.isNull(amnestiesHistory) ? new ArrayList<>() : amnestiesHistory;
    }
}
