import javax.xml.bind.annotation.XmlAttribute;

public class State {

    private String label;
    private String code;

    @XmlAttribute(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @XmlValue
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
