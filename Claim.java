import javax.xml.bind.annotation.XmlElement;

public class Claim {

    private String claimNumber;
    private int countOfVehicleIncident;
    private String createTime;
    private String extClaimHandleStatusType;
    private String extCRISRPNCCode;

    @XmlElement(name = "ClaimNumber")
    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    @XmlElement(name = "CountOfVehicleIncident")
    public int getCountOfVehicleIncident() {
        return countOfVehicleIncident;
    }

    public void setCountOfVehicleIncident(int countOfVehicleIncident) {
        this.countOfVehicleIncident = countOfVehicleIncident;
    }

    @XmlElement(name = "CreateTime")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @XmlElement(name = "ext_ClaimHandleStatusType")
    public String getExtClaimHandleStatusType() {
        return extClaimHandleStatusType;
    }

    public void setExtClaimHandleStatusType(String extClaimHandleStatusType) {
        this.extClaimHandleStatusType = extClaimHandleStatusType;
    }

    @XmlElement(name = "ext_CRISRPNCCode")
    public String getExtCRISRPNCCode() {
        return extCRISRPNCCode;
    }

    public void setExtCRISRPNCCode(String extCRISRPNCCode) {
        this.extCRISRPNCCode = extCRISRPNCCode;
    }
}
