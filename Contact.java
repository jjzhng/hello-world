import javax.xml.bind.annotation.*;

public class Contact {

    private String id;
    private String publicId;
    private String tags;
    private String displayName;
    private String extDriverNumber;
    private String extIPOccupationTxt; // This field can be `null` if the element is empty

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

    @XmlElement(name = "DisplayName")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @XmlElement(name = "ext_DriverNumber")
    public String getExtDriverNumber() {
        return extDriverNumber;
    }

    public void setExtDriverNumber(String extDriverNumber) {
        this.extDriverNumber = extDriverNumber;
    }

    @XmlElement(name = "ext_IPOccupationTxt")
    public String getExtIPOccupationTxt() {
        return extIPOccupationTxt;
    }

    public void setExtIPOccupationTxt(String extIPOccupationTxt) {
        this.extIPOccupationTxt = extIPOccupationTxt;
    }
}
