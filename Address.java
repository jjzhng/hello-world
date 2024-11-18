import javax.xml.bind.annotation.*;
import java.util.List;

public class Address {

    private String id;
    private String publicId;
    private String tags;
    private String refEntityPublicId; // Optional attribute
    private String county;
    private String postalCode;
    private LabeledValue state;

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

    @XmlAttribute(name = "ref-entity-public-id")
    public String getRefEntityPublicId() {
        return refEntityPublicId;
    }

    public void setRefEntityPublicId(String refEntityPublicId) {
        this.refEntityPublicId = refEntityPublicId;
    }

    @XmlElement(name = "County")
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @XmlElement(name = "PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @XmlElement(name = "State")
    public LabeledValue getState() {
        return state;
    }

    public void setState(LabeledValue state) {
        this.state = state;
    }
}
