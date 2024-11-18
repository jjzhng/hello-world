import javax.xml.bind.annotation.XmlElement;

public class RiskUnit {

    private String extAgeCode;
    private String extGarageZip;
    private String extRatedTerritory;

    @XmlElement(name = "ext_AgeCode")
    public String getExtAgeCode() {
        return extAgeCode;
    }

    public void setExtAgeCode(String extAgeCode) {
        this.extAgeCode = extAgeCode;
    }

    @XmlElement(name = "ext_GarageZip")
    public String getExtGarageZip() {
        return extGarageZip;
    }

    public void setExtGarageZip(String extGarageZip) {
        this.extGarageZip = extGarageZip;
    }

    @XmlElement(name = "ext_RatedTerritory")
    public String getExtRatedTerritory() {
        return extRatedTerritory;
    }

    public void setExtRatedTerritory(String extRatedTerritory) {
        this.extRatedTerritory = extRatedTerritory;
    }
}
