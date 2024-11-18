import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("/transactions")
public class TransactionRecordController {

    private final TransactionRecordService transactionRecordService;

    @Autowired
    public TransactionRecordController(TransactionRecordService transactionRecordService) {
        this.transactionRecordService = transactionRecordService;
    }

    @PostMapping("/process")
    public String processTransaction(@RequestBody String encryptedXmlData) {
        try {
            transactionRecordService.processTransactionRecordRequest(encryptedXmlData);
            return "Transaction processed successfully!";
        } catch (JAXBException e) {
            return "Error processing transaction: " + e.getMessage();
        }
    }

    @GetMapping("/{id}")
    public TransactionRecord getTransactionRecord(@PathVariable Long id) {
        return transactionRecordService.getTransactionRecordById(id);
    }
}
