package io.github.jsousa32.lib_bigdata.companies.entities.owners_lawsuits;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LawsuitDetails {

    private String number;

    private String type;

    private String mainSubject;

    private String courtName;

    private String courtLevel;

    private String courtType;

    private String courtDistrict;

    private String judge;

    private String judgingBody;

    private String state;

    private String status;

    private String lawsuitHostService;

    private String inferredCNJSubjectName;

    private int inferredCNJSubjectNumber;

    private String inferredCNJProcedureTypeName;

    private int inferredCNJProcedureTypeNumber;

    private String inferredBroadCNJSubjectName;

    private int inferredBroadCNJSubjectNumber;

    private List<String> otherSubjects;

    private int numberOfVolumes;

    private int numberOfPages;

    private String value;

    private String resJudicataDate;

    private String closeDate;

    private String redistributionDate;

    private String publicationDate;

    private String noticeDate;

    private String lastMovementDate;

    private String captureDate;

    private String lastUpdate;

    private int numberOfParties;

    private int numberOfUpdates;

    private int lawSuitAge;

    private double averageNumberOfUpdatesPerMonth;

    private int reasonForConcealedData;

    private List<Party> parties;

    private List<Update> updates;

    private List<Object> petitions;

    private List<Decision> decisions;

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public String getCourtName() {
        return courtName;
    }

    public String getCourtLevel() {
        return courtLevel;
    }

    public String getCourtType() {
        return courtType;
    }

    public String getCourtDistrict() {
        return courtDistrict;
    }

    public String getJudge() {
        return judge;
    }

    public String getJudgingBody() {
        return judgingBody;
    }

    public String getState() {
        return state;
    }

    public String getStatus() {
        return status;
    }

    public String getLawsuitHostService() {
        return lawsuitHostService;
    }

    public String getInferredCNJSubjectName() {
        return inferredCNJSubjectName;
    }

    public int getInferredCNJSubjectNumber() {
        return inferredCNJSubjectNumber;
    }

    public String getInferredCNJProcedureTypeName() {
        return inferredCNJProcedureTypeName;
    }

    public int getInferredCNJProcedureTypeNumber() {
        return inferredCNJProcedureTypeNumber;
    }

    public String getInferredBroadCNJSubjectName() {
        return inferredBroadCNJSubjectName;
    }

    public int getInferredBroadCNJSubjectNumber() {
        return inferredBroadCNJSubjectNumber;
    }

    public List<String> getOtherSubjects() {
        return otherSubjects;
    }

    public int getNumberOfVolumes() {
        return numberOfVolumes;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getValue() {
        return value;
    }

    public String getResJudicataDate() {
        return resJudicataDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public String getRedistributionDate() {
        return redistributionDate;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getNoticeDate() {
        return noticeDate;
    }

    public String getLastMovementDate() {
        return lastMovementDate;
    }

    public String getCaptureDate() {
        return captureDate;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public int getNumberOfParties() {
        return numberOfParties;
    }

    public int getNumberOfUpdates() {
        return numberOfUpdates;
    }

    public int getLawSuitAge() {
        return lawSuitAge;
    }

    public double getAverageNumberOfUpdatesPerMonth() {
        return averageNumberOfUpdatesPerMonth;
    }

    public int getReasonForConcealedData() {
        return reasonForConcealedData;
    }

    public List<Party> getParties() {
        return Objects.isNull(parties) ? new ArrayList<>() : parties;
    }

    public List<Update> getUpdates() {
        return Objects.isNull(updates) ? new ArrayList<>() : updates;
    }

    public List<Object> getPetitions() {
        return Objects.isNull(petitions) ? new ArrayList<>() : petitions;
    }

    public List<Decision> getDecisions() {
        return Objects.isNull(decisions) ? new ArrayList<>() : decisions;
    }
}
