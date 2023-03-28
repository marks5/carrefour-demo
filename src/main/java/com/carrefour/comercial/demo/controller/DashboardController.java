package com.carrefour.comercial.demo.controller;

import com.carrefour.comercial.demo.model.Transaction;
import com.carrefour.comercial.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("/api/transaction")
public class DashboardController {

    @Autowired
    private TransactionRepository repository;

    @GetMapping("/debits")
    public List<Transaction> getDebits() {
        return repository.findAllByDebits();
    }

    @GetMapping("/credits")
    public List<Transaction> getCredits() {
        return repository.findAllByCredits();
    }

    @GetMapping("/{date}")
    public Transaction getConsolidatedByDate(Date date) {
        List<Transaction> transaction = repository.findAllByData(date);
        AtomicReference<Double> consolidated = new AtomicReference<>(0.0);
        transaction.forEach( it -> {
            if (it.getDebito()) {
                consolidated.updateAndGet(v -> v + it.getValor());
            } else {
                consolidated.updateAndGet(v -> v - it.getValor());
            }
        });

        Transaction transaction1 = new Transaction();
        transaction1.setData(new Date(0,0,0));
        transaction1.setValor(consolidated.get());
        transaction1.setDebito(false);
        return transaction1;
    }


}
