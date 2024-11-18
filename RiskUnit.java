import javax.xml.bind.annotation.*;

public class RiskUnit {

    private String id;
    private String publicId;
    private String extAgeCode;
    private String extAnnualMileage;
    private String extCompSymbol;
    private String extGarageZip;
    private String extMerit;
    private String extOtherRating;
    private String extRatedCity;
    private String extRatedTerritory;
    private String extRating;
    private String ruNumber;

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

    @XmlElement(name = "ext_AgeCode")
    public String getExtAgeCode() {
        return extAgeCode;
    }

    public void setExtAgeCode(String extAgeCode) {
        this.extAgeCode = extAgeCode;
    }

    @XmlElement(name = "ext_AnnualMileage")
    public String getExtAnnualMileage() {
        return extAnnualMileage;
    }

    public void setExtAnnualMileage(String extAnnualMileage) {
        this.extAnnualMileage = extAnnualMileage;
    }

    @XmlElement(name = "ext_CompSymbol")
    public String getExtCompSymbol() {
        return extCompSymbol;
    }

    public void setExtCompSymbol(String extCompSymbol) {
        this.extCompSymbol = extCompSymbol;
    }

    @XmlElement(name = "ext_GarageZip")
    public String getExtGarageZip() {
        return extGarageZip;
    }

    public void setExtGarageZip(String extGarageZip) {
        this.extGarageZip = extGarageZip;
    }

    @XmlElement(name = "ext_Merit")
    public String getExtMerit() {
        return extMerit;
    }

    public void setExtMerit(String extMerit) {
        this.extMerit = extMerit;
    }

    @XmlElement(name = "ext_OtherRating")
    public String getExtOtherRating() {
        return extOtherRating;
    }

    public void setExtOtherRating(String extOtherRating) {
        this.extOtherRating = extOtherRating;
    }

    @XmlElement(name = "ext_RatedCity")
    public String getExtRatedCity() {
        return extRatedCity;
    }

    public void setExtRatedCity(String extRatedCity) {
        this.extRatedCity = extRatedCity;
    }

    @XmlElement(name = "ext_RatedTerritory")
    public String getExtRatedTerritory() {
        return extRatedTerritory;
    }

    public void setExtRatedTerritory(String extRatedTerritory) {
        this.extRatedTerritory = extRatedTerritory;
    }

    @XmlElement(name = "ext_Rating")
    public String getExtRating() {
        return extRating;
    }

    public void setExtRating(String extRating) {
        this.extRating = extRating;
    }

    @XmlElement(name = "RUNumber")
    public String getRuNumber() {
        return ruNumber;
    }

    public void setRuNumber(String ruNumber) {
        this.ruNumber = ruNumber;
    }
}
