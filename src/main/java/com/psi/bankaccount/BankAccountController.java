package com.psi.bankaccount;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {
    
    private final BankAccountRepository repository;

    BankAccountController(BankAccountRepository repository){
            this.repository = repository;
    }

    @GetMapping("/bankaccounts")
    List<BankAccount> all() {
        return repository.findAll();
      }

    @PostMapping("/bankaccounts")
    BankAccount newBankAccount(@RequestBody BankAccount newBankAccount){
        return repository.save(newBankAccount);
    }

}
