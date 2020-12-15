package cl.devweb.openbanking.demo.service;

import org.springframework.stereotype.Service;

import cl.devweb.openbanking.demo.dto.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class TransactionService {

	private static int min = 1;
	private static int max = 1000;

	public List<Transaction> findAllByAccountNumber(int accountNumber, int numTx) {

		List<Transaction> transactions = new ArrayList<>();

		for(int i=0; i<numTx; i++) {

			int amount = ThreadLocalRandom.current().nextInt(min, max + 1);
			transactions.add(new Transaction(1, accountNumber, 1, amount, "merchant1", "logo1"));
		}


		return transactions;
	}

}

