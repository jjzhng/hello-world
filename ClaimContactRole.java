import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class ClaimContactRole {

    private String id;
    private String publicId;
    private String refEntityPublicId;
    private String extInterestedPartyNumber;

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

    @XmlAttribute(name = "ref-entity-public-id")
    public String getRefEntityPublicId() {
        return refEntityPublicId;
    }

    public void setRefEntityPublicId(String refEntityPublicId) {
        this.refEntityPublicId = refEntityPublicId;
    }

    @XmlElement(name = "ext_InterestedPartyNumber")
    public String getExtInterestedPartyNumber() {
        return extInterestedPartyNumber;
    }

    public void setExtInterestedPartyNumber(String extInterestedPartyNumber) {
        this.extInterestedPartyNumber = extInterestedPartyNumber;
    }
}
