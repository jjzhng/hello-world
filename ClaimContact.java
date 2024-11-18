import javax.xml.bind.annotation.*;

public class ClaimContact {

    private String id;
    private String publicId;
    private String tags;
    private String refEntityPublicId;
    private String clmtType;
    private String extAirbagProtectionInd;
    private String extChildPassengerRestraintInd;
    private LabeledValue extInjuryInd; // Using LabeledValue for elements with attributes and values
    private String extPassengerPositionCd;
    private String extSeatbeltWornInd;

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

    @XmlElement(name = "ClmtType")
    public String getClmtType() {
        return clmtType;
    }

    public void setClmtType(String clmtType) {
        this.clmtType = clmtType;
    }

    @XmlElement(name = "ext_AirbagProtectionInd")
    public String getExtAirbagProtectionInd() {
        return extAirbagProtectionInd;
    }

    public void setExtAirbagProtectionInd(String extAirbagProtectionInd) {
        this.extAirbagProtectionInd = extAirbagProtectionInd;
    }

    @XmlElement(name = "ext_ChildPassengerRestraintInd")
    public String getExtChildPassengerRestraintInd() {
        return extChildPassengerRestraintInd;
    }

    public void setExtChildPassengerRestraintInd(String extChildPassengerRestraintInd) {
        this.extChildPassengerRestraintInd = extChildPassengerRestraintInd;
    }

    @XmlElement(name = "ext_InjuryInd")
    public LabeledValue getExtInjuryInd() {
        return extInjuryInd;
    }

    public void setExtInjuryInd(LabeledValue extInjuryInd) {
        this.extInjuryInd = extInjuryInd;
    }

    @XmlElement(name = "ext_PassengerPositionCd")
    public String getExtPassengerPositionCd() {
        return extPassengerPositionCd;
    }

    public void setExtPassengerPositionCd(String extPassengerPositionCd) {
        this.extPassengerPositionCd = extPassengerPositionCd;
    }

    @XmlElement(name = "ext_SeatbeltWornInd")
    public String getExtSeatbeltWornInd() {
        return extSeatbeltWornInd;
    }

    public void setExtSeatbeltWornInd(String extSeatbeltWornInd) {
        this.extSeatbeltWornInd = extSeatbeltWornInd;
    }
}
