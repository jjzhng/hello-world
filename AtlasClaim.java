import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class AtlasClaim {

    private List<Address> addresses;
    private List<Claim> claims;
    private List<ClaimContact> claimContacts;
    private List<Coverage> coverages;
    private List<ExtDiscount> extDiscounts;
    private List<Policy> policies;
    private List<RiskUnit> riskUnits;
    private List<User> users;
    private List<Vehicle> vehicles;

    @XmlElement(name = "Address")
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @XmlElement(name = "Claim")
    public List<Claim> getClaims() {
        return claims;
    }

    public void setClaims(List<Claim> claims) {
        this.claims = claims;
    }

    @XmlElement(name = "ClaimContact")
    public List<ClaimContact> getClaimContacts() {
        return claimContacts;
    }

    public void setClaimContacts(List<ClaimContact> claimContacts) {
        this.claimContacts = claimContacts;
    }

    @XmlElement(name = "Coverage")
    public List<Coverage> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<Coverage> coverages) {
        this.coverages = coverages;
    }

    @XmlElement(name = "Ext_Discount")
    public List<ExtDiscount> getExtDiscounts() {
        return extDiscounts;
    }

    public void setExtDiscounts(List<ExtDiscount> extDiscounts) {
        this.extDiscounts = extDiscounts;
    }

    @XmlElement(name = "Policy")
    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    @XmlElement(name = "RiskUnit")
    public List<RiskUnit> getRiskUnits() {
        return riskUnits;
    }

    public void setRiskUnits(List<RiskUnit> riskUnits) {
        this.riskUnits = riskUnits;
    }

    @XmlElement(name = "User")
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @XmlElement(name = "Vehicle")
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
