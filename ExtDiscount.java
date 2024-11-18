import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class ExtDiscount {

    private String id;
    private String publicId;
    private String extDiscountCode;
    private ExtDiscountType extDiscountType;

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

    @XmlElement(name = "ext_DiscountCode")
    public String getExtDiscountCode() {
        return extDiscountCode;
    }

    public void setExtDiscountCode(String extDiscountCode) {
        this.extDiscountCode = extDiscountCode;
    }

    @XmlElement(name = "ext_DiscountType")
    public ExtDiscountType getExtDiscountType() {
        return extDiscountType;
    }

    public void setExtDiscountType(ExtDiscountType extDiscountType) {
        this.extDiscountType = extDiscountType;
    }
}
