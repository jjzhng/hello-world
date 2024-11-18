import javax.xml.bind.annotation.*;

public class Vehicle {

    private String id;
    private String publicId;
    private String extBoatLength;
    private String extBoatVesselType;
    private LabeledValue extCRISVehicleTypeCode; // Handle `label` attribute and value
    private String extPremiumTownCd;
    private String make;
    private String model;
    private String vin;
    private String year;

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

    @XmlElement(name = "ext_BoatLength")
    public String getExtBoatLength() {
        return extBoatLength;
    }

    public void setExtBoatLength(String extBoatLength) {
        this.extBoatLength = extBoatLength;
    }

    @XmlElement(name = "ext_BoatVesselType")
    public String getExtBoatVesselType() {
        return extBoatVesselType;
    }

    public void setExtBoatVesselType(String extBoatVesselType) {
        this.extBoatVesselType = extBoatVesselType;
    }

    @XmlElement(name = "ext_CRISVehicleTypeCode")
    public LabeledValue getExtCRISVehicleTypeCode() {
        return extCRISVehicleTypeCode;
    }

    public void setExtCRISVehicleTypeCode(LabeledValue extCRISVehicleTypeCode) {
        this.extCRISVehicleTypeCode = extCRISVehicleTypeCode;
    }

    @XmlElement(name = "ext_PremiumTownCd")
    public String getExtPremiumTownCd() {
        return extPremiumTownCd;
    }

    public void setExtPremiumTownCd(String extPremiumTownCd) {
        this.extPremiumTownCd = extPremiumTownCd;
    }

    @XmlElement(name = "Make")
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @XmlElement(name = "Model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @XmlElement(name = "Vin")
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @XmlElement(name = "Year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
