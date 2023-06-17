package org.mani.bootiful_moni.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/transactions")
public class TransactionController {

    @GetMapping(path = "{userId})")
    public List<String> getTransactions(@PathVariable("userId") Long userId) {
        return List.of(userId.toString(), "Transaction 1", "Transaction 2", "Transaction 3");
    }

    @GetMapping(path = {"{transactionId}"})
    String getTransaction(@PathVariable("transactionId") Long id) {
        return "Transaction-" + id;
    }

    @PostMapping
    String createTransaction(@RequestBody String transactionData) {
        return "Transaction created with data: " + transactionData;
    }

    @DeleteMapping(path = {"{transactionId}"})
    String deleteTransaction(@PathVariable("transactionId") Long id) {
        return "Transaction deleted " + id;
    }

    @PutMapping(path = {"{transactionId}"})
    String updateTransaction(@PathVariable("transactionId") Long id) {
        return "Transaction updated " + id;
    }
}
