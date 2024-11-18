import javax.xml.bind.annotation.*;
import java.util.Date;

public class Claim {

    private String id;
    private String publicId;
    private String claimNumber;
    private int countOfVehicleIncident;
    private Date createTime;
    private LabeledValue extClaimHandleStatusType;
    private LabeledValue extCRISRPNCCode;
    private LabeledValue extFCC;

    // Same mapping logic as before, with the updated class name:
    @XmlElement(name = "ext_ClaimHandleStatusType")
    public LabeledValue getExtClaimHandleStatusType() {
        return extClaimHandleStatusType;
    }

    public void setExtClaimHandleStatusType(LabeledValue extClaimHandleStatusType) {
        this.extClaimHandleStatusType = extClaimHandleStatusType;
    }

    @XmlElement(name = "ext_CRISRPNCCode")
    public LabeledValue getExtCRISRPNCCode() {
        return extCRISRPNCCode;
    }

    public void setExtCRISRPNCCode(LabeledValue extCRISRPNCCode) {
        this.extCRISRPNCCode = extCRISRPNCCode;
    }

    @XmlElement(name = "ext_FCC")
    public LabeledValue getExtFCC() {
        return extFCC;
    }

    public void setExtFCC(LabeledValue extFCC) {
        this.extFCC = extFCC;
    }
}
