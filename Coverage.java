import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Coverage {

    private String id;
    private String publicId;
    private String exposureLimit;
    private String extClaimDeductible;
    private String extClaimLimit;
    private Type type;

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

    @XmlElement(name = "Type")
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
