import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;

@Service
public class TransactionRecordService {

    private final Voltage voltage;
    private final TransactionRecordRepository transactionRecordRepository;

    @Autowired
    public TransactionRecordService(Voltage voltage, TransactionRecordRepository transactionRecordRepository) {
        this.voltage = voltage;
        this.transactionRecordRepository = transactionRecordRepository;
    }

    public void processTransactionRecordRequest(String encryptedXmlData) throws JAXBException {
        // Step 1: Decrypt XML
        String xmlData = voltage.decrypt(encryptedXmlData);

        // Step 2: Parse XML to DTO
        TransactionMessageRequestDto transactionMessage = XmlParser.parseXml(xmlData);

        // Step 3: Extract data and map to TransactionRecord
        TransactionMessageContext context = transactionMessage.getTransactionMessageContext();
        TransactionRecord record = new TransactionRecord();
        record.setTransactionType(context.getTransactionType());
        record.setTransactionSubType(context.getTransactionSubType());
        record.setTransactionVersion(context.getTransactionVersion());
        record.setPolicyNumber(context.getPolicyNumber());
        record.setClaimNumber(context.getClaimNumber());
        record.setMessageId(context.getMessageId());

        // Step 4: Save to database
        transactionRecordRepository.save(record);
    }

    public TransactionRecord getTransactionRecordById(Long id) {
        return transactionRecordRepository.findById(id).orElseThrow(() -> new RuntimeException("Record not found"));
    }
}
