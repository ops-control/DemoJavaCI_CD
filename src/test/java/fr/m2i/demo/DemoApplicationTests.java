package fr.m2i.demo;

import fr.m2i.demo.service.BankService;
import fr.m2i.demo.service.ServiceResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	BankService bankService;
	@Test
	void contextLoads() {
	}

	@Test
	void RG_15215(){
		// Cas 789
		ServiceResponseDTO responseDTO789 = bankService.debit(15215);
		assertEquals("789",responseDTO789.code);

		//Cas 207
		ServiceResponseDTO responseDTO207 = bankService.debit(215);
		assertEquals("607",responseDTO207.code);
	}

}
