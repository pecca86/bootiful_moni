package org.mani.bootiful_moni.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/accounts")
public class AccountController {

    @GetMapping
    public List<String> getAccounts() {
        return List.of("Pekka", "Kalle", "Olle");
    }

    @GetMapping(path = {"{accountId}"})
    String getAccount(@PathVariable("accountId") Long id) {
        return "Account-" + id;
    }

    @PostMapping
    String createAccount(@RequestBody String accountData) {
        return "Account created with data: " + accountData;
    }

    @DeleteMapping(path = {"{accountId}"})
    String deleteAccount(@PathVariable("accountId") Long id) {
        return "Account deleted " + id;
    }

    @PutMapping(path = {"{accountId}"})
    String updateAccount(@PathVariable("accountId") Long id) {
        return "Account updated " + id;
    }
}
