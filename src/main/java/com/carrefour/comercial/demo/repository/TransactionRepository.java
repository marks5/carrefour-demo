package com.carrefour.comercial.demo.repository;

import com.carrefour.comercial.demo.model.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public
interface TransactionRepository extends CrudRepository<Transaction, String> {
    @Query(value = "Select b from Transaction b where b.debito = TRUE")
    List<Transaction> findAllByDebits();

    @Query(value = "Select b from Transaction b where b.debito = FALSE")
    List<Transaction> findAllByCredits();

    @Query(value = "select a from Transaction a where a.data = :data")
    List<Transaction> findAllByData(Date data);
}