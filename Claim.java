import javax.xml.bind.annotation.*;
import java.util.Date;

public class Claim {

    private String id;
    private String publicId;
    private String claimNumber;
    private int countOfVehicleIncident;
    private Date createTime;
    private ExtField extClaimHandleStatusType;
    private ExtField extCRISRPNCCode;
    private ExtField extFCC;
    private boolean extFullOrAbbreLossReportInd;
    private int extGeicoAccidentType;
    private String extLegacyClaimNumber;
    private String extLossTypeCode;
    private double fault;
    private Date lossDate;
    private String lossReportType;
    private Date reportedDate;

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute(name = "public-id")
    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

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
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @XmlElement(name = "ext_ClaimHandleStatusType")
    public ExtField getExtClaimHandleStatusType() {
        return extClaimHandleStatusType;
    }

    public void setExtClaimHandleStatusType(ExtField extClaimHandleStatusType) {
        this.extClaimHandleStatusType = extClaimHandleStatusType;
    }

    @XmlElement(name = "ext_CRISRPNCCode")
    public ExtField getExtCRISRPNCCode() {
        return extCRISRPNCCode;
    }

    public void setExtCRISRPNCCode(ExtField extCRISRPNCCode) {
        this.extCRISRPNCCode = extCRISRPNCCode;
    }

    @XmlElement(name = "ext_FCC")
    public ExtField getExtFCC() {
        return extFCC;
    }

    public void setExtFCC(ExtField extFCC) {
        this.extFCC = extFCC;
    }

    @XmlElement(name = "ext_FullOrAbbreLossReportInd")
    public boolean isExtFullOrAbbreLossReportInd() {
        return extFullOrAbbreLossReportInd;
    }

    public void setExtFullOrAbbreLossReportInd(boolean extFullOrAbbreLossReportInd) {
        this.extFullOrAbbreLossReportInd = extFullOrAbbreLossReportInd;
    }

    @XmlElement(name = "ext_GeicoAccidentType")
    public int getExtGeicoAccidentType() {
        return extGeicoAccidentType;
    }

    public void setExtGeicoAccidentType(int extGeicoAccidentType) {
        this.extGeicoAccidentType = extGeicoAccidentType;
    }

    @XmlElement(name = "ext_LegacyClaimNumber")
    public String getExtLegacyClaimNumber() {
        return extLegacyClaimNumber;
    }

    public void setExtLegacyClaimNumber(String extLegacyClaimNumber) {
        this.extLegacyClaimNumber = extLegacyClaimNumber;
    }

    @XmlElement(name = "ext_LossTypeCode")
    public String getExtLossTypeCode() {
        return extLossTypeCode;
    }

    public void setExtLossTypeCode(String extLossTypeCode) {
        this.extLossTypeCode = extLossTypeCode;
    }

    @XmlElement(name = "Fault")
    public double getFault() {
        return fault;
    }

    public void setFault(double fault) {
        this.fault = fault;
    }

    @XmlElement(name = "LossDate")
    public Date getLossDate() {
        return lossDate;
    }

    public void setLossDate(Date lossDate) {
        this.lossDate = lossDate;
    }

    @XmlElement(name = "LossReportType")
    public String getLossReportType() {
        return lossReportType;
    }

    public void setLossReportType(String lossReportType) {
        this.lossReportType = lossReportType;
    }

    @XmlElement(name = "ReportedDate")
    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }
}
