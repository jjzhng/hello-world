import javax.xml.bind.annotation.XmlElement;

public class Policy {

    private String effectiveDate;
    private String expirationDate;
    private String extFileLocation;
    private String policyNumber;
    private String underwritingCo;

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

    @XmlElement(name = "ext_FileLocation")
    public String getExtFileLocation() {
        return extFileLocation;
    }

    public void setExtFileLocation(String extFileLocation) {
        this.extFileLocation = extFileLocation;
    }

    @XmlElement(name = "PolicyNumber")
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @XmlElement(name = "UnderwritingCo")
    public String getUnderwritingCo() {
        return underwritingCo;
    }

    public void setUnderwritingCo(String underwritingCo) {
        this.underwritingCo = underwritingCo;
    }
}
