package cl.devweb.openbanking.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.devweb.openbanking.demo.dto.Transaction;


@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class TransactionServiceTest {

	//@MockBean
	@Autowired
	private TransactionService transactionService;

	@Test
	void findAllByAccountNumber_List_Return() {

		List<Transaction> txs = transactionService.findAllByAccountNumber(1, 10);

		System.out.println(">"+txs.size());

		assertFalse(txs.isEmpty());

	}

}

