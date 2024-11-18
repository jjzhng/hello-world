import javax.xml.bind.annotation.XmlAttribute;

public class ExtDiscountType {

    private String label;

    @XmlAttribute(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
