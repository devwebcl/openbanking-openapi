package cl.devweb.openbanking.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.devweb.openbanking.demo.dto.Transaction;
import cl.devweb.openbanking.demo.service.TransactionService;

import java.util.List;

@RestController
public class TransactionController {

	@Autowired
    private TransactionService transactionService;

    @GetMapping(path = "/transactions/{accountNumber}")
    public List<Transaction> getTransactions(@PathVariable("accountNumber") int accountNumber) {

        return transactionService.findAllByAccountNumber(accountNumber, 5);

    }


}
