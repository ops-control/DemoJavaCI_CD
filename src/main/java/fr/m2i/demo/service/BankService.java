package fr.m2i.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class BankService {


    /**
     * @param
     */
    public ServiceResponseDTO<Float> debit(float amount) {
        if (amount > 2300) {
            return ServiceResponseDTO.buildResponse("prelevement echoue","789");
        }
        return ServiceResponseDTO.buildResponse("prelevement reussi","607",2000-amount);

    }
}
