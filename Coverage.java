import javax.xml.bind.annotation.*;

public class Coverage {

    private String id;
    private String publicId;
    private String tags; // Optional attribute
    private String exposureLimit;
    private String extClaimDeductible;
    private String extClaimLimit;
    private String extClaimLimitOnPol;
    private String extDeductible;
    private String extDisplayExposureLimit;
    private String extIndividualDeductible;
    private String extLimit;
    private String extLimitOptionCode;
    private String extVehicleValueAmount;
    private String extVehicleValueType;
    private LabeledValue type; // Handle `label` attribute and value
    private String vehCovCd;

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

    @XmlAttribute(name = "tags")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @XmlElement(name = "ExposureLimit")
    public String getExposureLimit() {
        return exposureLimit;
    }

    public void setExposureLimit(String exposureLimit) {
        this.exposureLimit = exposureLimit;
    }

    @XmlElement(name = "ext_ClaimDeductible")
    public String getExtClaimDeductible() {
        return extClaimDeductible;
    }

    public void setExtClaimDeductible(String extClaimDeductible) {
        this.extClaimDeductible = extClaimDeductible;
    }

    @XmlElement(name = "ext_ClaimLimit")
    public String getExtClaimLimit() {
        return extClaimLimit;
    }

    public void setExtClaimLimit(String extClaimLimit) {
        this.extClaimLimit = extClaimLimit;
    }

    @XmlElement(name = "ext_ClaimLimitOnPol")
    public String getExtClaimLimitOnPol() {
        return extClaimLimitOnPol;
    }

    public void setExtClaimLimitOnPol(String extClaimLimitOnPol) {
        this.extClaimLimitOnPol = extClaimLimitOnPol;
    }

    @XmlElement(name = "ext_Deductible")
    public String getExtDeductible() {
        return extDeductible;
    }

    public void setExtDeductible(String extDeductible) {
        this.extDeductible = extDeductible;
    }

    @XmlElement(name = "ext_displayExposureLimit")
    public String getExtDisplayExposureLimit() {
        return extDisplayExposureLimit;
    }

    public void setExtDisplayExposureLimit(String extDisplayExposureLimit) {
        this.extDisplayExposureLimit = extDisplayExposureLimit;
    }

    @XmlElement(name = "ext_IndividualDeductible")
    public String getExtIndividualDeductible() {
        return extIndividualDeductible;
    }

    public void setExtIndividualDeductible(String extIndividualDeductible) {
        this.extIndividualDeductible = extIndividualDeductible;
    }

    @XmlElement(name = "ext_Limit")
    public String getExtLimit() {
        return extLimit;
    }

    public void setExtLimit(String extLimit) {
        this.extLimit = extLimit;
    }

    @XmlElement(name = "ext_LimitOptionCode")
    public String getExtLimitOptionCode() {
        return extLimitOptionCode;
    }

    public void setExtLimitOptionCode(String extLimitOptionCode) {
        this.extLimitOptionCode = extLimitOptionCode;
    }

    @XmlElement(name = "ext_VehicleValueAmount")
    public String getExtVehicleValueAmount() {
        return extVehicleValueAmount;
    }

    public void setExtVehicleValueAmount(String extVehicleValueAmount) {
        this.extVehicleValueAmount = extVehicleValueAmount;
    }

    @XmlElement(name = "ext_VehicleValueType")
    public String getExtVehicleValueType() {
        return extVehicleValueType;
    }

    public void setExtVehicleValueType(String extVehicleValueType) {
        this.extVehicleValueType = extVehicleValueType;
    }

    @XmlElement(name = "Type")
    public LabeledValue getType() {
        return type;
    }

    public void setType(LabeledValue type) {
        this.type = type;
    }

    @XmlElement(name = "VehCovCd")
    public String getVehCovCd() {
        return vehCovCd;
    }

    public void setVehCovCd(String vehCovCd) {
        this.vehCovCd = vehCovCd;
    }
}
