package fr.m2i.demo.api;

import fr.m2i.demo.bo.Article;
import fr.m2i.demo.service.BankService;
import fr.m2i.demo.service.DebitRequestDTO;
import fr.m2i.demo.service.ServiceResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @Autowired
    BankService bankService;

    @PostMapping("/debit")
    public ServiceResponseDTO debit(@RequestBody DebitRequestDTO debitRequestDTO) {
        return bankService.debit(debitRequestDTO.amount);


    }
}
