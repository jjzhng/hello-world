import javax.xml.bind.annotation.*;

public class Policy {

    private String id;
    private String publicId;
    private String effectiveDate;
    private String expirationDate;
    private String extClassSegment;
    private String extFileLocation;
    private String extGroup;
    private String extInceptionDate;
    private String extLOBCode;
    private String extPolicyFormCode;
    private String extPolicySymbolCode;
    private String extPolRateStructure;
    private String extPolRiskSegment;
    private String extProgramCd;
    private String extRateTierCd;
    private LabeledValue extRiskState; // Handle `label` attribute and value
    private String extSOB;
    private String extYearsInForce;
    private String gpupIndicator;
    private String policyNumber;
    private LabeledValue underwritingCo; // Handle `label` attribute and value

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

    @XmlElement(name = "EffectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @XmlElement(name = "ExpirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @XmlElement(name = "Ext_ClassSegment")
    public String getExtClassSegment() {
        return extClassSegment;
    }

    public void setExtClassSegment(String extClassSegment) {
        this.extClassSegment = extClassSegment;
    }

    @XmlElement(name = "ext_FileLocation")
    public String getExtFileLocation() {
        return extFileLocation;
    }

    public void setExtFileLocation(String extFileLocation) {
        this.extFileLocation = extFileLocation;
    }

    @XmlElement(name = "ext_Group")
    public String getExtGroup() {
        return extGroup;
    }

    public void setExtGroup(String extGroup) {
        this.extGroup = extGroup;
    }

    @XmlElement(name = "ext_InceptionDate")
    public String getExtInceptionDate() {
        return extInceptionDate;
    }

    public void setExtInceptionDate(String extInceptionDate) {
        this.extInceptionDate = extInceptionDate;
    }

    @XmlElement(name = "ext_LOBCode")
    public String getExtLOBCode() {
        return extLOBCode;
    }

    public void setExtLOBCode(String extLOBCode) {
        this.extLOBCode = extLOBCode;
    }

    @XmlElement(name = "ext_PolicyFormCode")
    public String getExtPolicyFormCode() {
        return extPolicyFormCode;
    }

    public void setExtPolicyFormCode(String extPolicyFormCode) {
        this.extPolicyFormCode = extPolicyFormCode;
    }

    @XmlElement(name = "ext_PolicySymbolCode")
    public String getExtPolicySymbolCode() {
        return extPolicySymbolCode;
    }

    public void setExtPolicySymbolCode(String extPolicySymbolCode) {
        this.extPolicySymbolCode = extPolicySymbolCode;
    }

    @XmlElement(name = "ext_PolRateStructure")
    public String getExtPolRateStructure() {
        return extPolRateStructure;
    }

    public void setExtPolRateStructure(String extPolRateStructure) {
        this.extPolRateStructure = extPolRateStructure;
    }

    @XmlElement(name = "ext_PolRiskSegment")
    public String getExtPolRiskSegment() {
        return extPolRiskSegment;
    }

    public void setExtPolRiskSegment(String extPolRiskSegment) {
        this.extPolRiskSegment = extPolRiskSegment;
    }

    @XmlElement(name = "ext_ProgramCd")
    public String getExtProgramCd() {
        return extProgramCd;
    }

    public void setExtProgramCd(String extProgramCd) {
        this.extProgramCd = extProgramCd;
    }

    @XmlElement(name = "ext_RateTierCd")
    public String getExtRateTierCd() {
        return extRateTierCd;
    }

    public void setExtRateTierCd(String extRateTierCd) {
        this.extRateTierCd = extRateTierCd;
    }

    @XmlElement(name = "ext_RiskState")
    public LabeledValue getExtRiskState() {
        return extRiskState;
    }

    public void setExtRiskState(LabeledValue extRiskState) {
        this.extRiskState = extRiskState;
    }

    @XmlElement(name = "ext_SOB")
    public String getExtSOB() {
        return extSOB;
    }

    public void setExtSOB(String extSOB) {
        this.extSOB = extSOB;
    }

    @XmlElement(name = "ext_YearsInForce")
    public String getExtYearsInForce() {
        return extYearsInForce;
    }

    public void setExtYearsInForce(String extYearsInForce) {
        this.extYearsInForce = extYearsInForce;
    }

    @XmlElement(name = "GPUPIndicator")
    public String getGpupIndicator() {
        return gpupIndicator;
    }

    public void setGpupIndicator(String gpupIndicator) {
        this.gpupIndicator = gpupIndicator;
    }

    @XmlElement(name = "PolicyNumber")
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @XmlElement(name = "UnderwritingCo")
    public LabeledValue getUnderwritingCo() {
        return underwritingCo;
    }

    public void setUnderwritingCo(LabeledValue underwritingCo) {
        this.underwritingCo = underwritingCo;
    }
}
