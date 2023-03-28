package com.carrefour.comercial.demo.controller;

import com.carrefour.comercial.demo.model.ConsolidatedTransaction;
import com.carrefour.comercial.demo.model.Transaction;
import com.carrefour.comercial.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static com.carrefour.comercial.demo.model.DateUtil.getDateWithoutTimeUsingFormat;

@RestController
@RequestMapping("/api/dashboard")
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

    @GetMapping("/consolidated")
    public ConsolidatedTransaction getConsolidatedByDate() {
        try{
            List<Transaction> transaction = repository.findAllByData(getDateWithoutTimeUsingFormat());
            Double value = 0.0;
            for (Transaction i : transaction) {
                if (i.getDebito()) {
                    value += i.getValor();
                } else value -= i.getValor();
            }
            ConsolidatedTransaction consolidatedTransaction = new ConsolidatedTransaction();
            consolidatedTransaction.setData(getDateWithoutTimeUsingFormat());
            consolidatedTransaction.setValor(value);
            return consolidatedTransaction;
        } catch (Exception e) {
            return null;
        }
    }


}
