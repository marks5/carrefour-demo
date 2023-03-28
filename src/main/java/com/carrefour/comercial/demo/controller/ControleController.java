package com.carrefour.comercial.demo.controller;

import com.carrefour.comercial.demo.model.Transaction;
import com.carrefour.comercial.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transaction")
public class ControleController {

    @Autowired
    private TransactionRepository repository;

    @PostMapping
    public Transaction insert(@RequestBody Transaction transaction) {
        return repository.save(transaction);
    }
}
