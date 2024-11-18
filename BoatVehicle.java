import javax.xml.bind.annotation.XmlElement;

public class Vehicle {

    private String extBoatLength;
    private String extBoatVesselType;
    private String extCRISVehicleTypeCode;
    private String make;
    private String model;
    private String vin;
    private int year;

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
    public String getExtCRISVehicleTypeCode() {
        return extCRISVehicleTypeCode;
    }

    public void setExtCRISVehicleTypeCode(String extCRISVehicleTypeCode) {
        this.extCRISVehicleTypeCode = extCRISVehicleTypeCode;
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
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
