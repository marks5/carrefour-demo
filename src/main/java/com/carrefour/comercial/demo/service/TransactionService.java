package com.carrefour.comercial.demo.service;

import com.carrefour.comercial.demo.model.Transaction;
import com.carrefour.comercial.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TransactionService implements CrudRepository<Transaction, String> {

    @Autowired
    private TransactionRepository repository;

    @Override
    public <S extends Transaction> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public <S extends Transaction> Iterable<S> saveAll(Iterable<S> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public Optional<Transaction> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Transaction> findAll() {
        return null;
    }

    @Override
    public Iterable<Transaction> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Transaction entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Transaction> entities) {

    }

    @Override
    public void deleteAll() {

    }
}