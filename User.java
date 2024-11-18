import javax.xml.bind.annotation.*;

public class User {

    private String id;
    private String publicId;
    private String tags; // Optional attribute
    private String extPrimaryAdjusterCode;
    private String extPrimaryRACFID;

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

    @XmlElement(name = "ext_PrimaryAdjusterCode")
    public String getExtPrimaryAdjusterCode() {
        return extPrimaryAdjusterCode;
    }

    public void setExtPrimaryAdjusterCode(String extPrimaryAdjusterCode) {
        this.extPrimaryAdjusterCode = extPrimaryAdjusterCode;
    }

    @XmlElement(name = "ext_PrimaryRACFID")
    public String getExtPrimaryRACFID() {
        return extPrimaryRACFID;
    }

    public void setExtPrimaryRACFID(String extPrimaryRACFID) {
        this.extPrimaryRACFID = extPrimaryRACFID;
    }
}
