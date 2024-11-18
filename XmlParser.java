import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlParser {

    public static TransactionMessageRequestDto parseXml(String xmlData) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(TransactionMessageRequestDto.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (TransactionMessageRequestDto) unmarshaller.unmarshal(new StringReader(xmlData));
    }
}
