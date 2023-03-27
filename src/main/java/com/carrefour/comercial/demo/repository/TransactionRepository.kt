package com.carrefour.comercial.demo.repository

import com.carrefour.comercial.demo.model.Transaction
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.Date

@Repository
interface TransactionRepository : CrudRepository<Transaction, String> {
    @Query(value = "Select b from Transaction b where b.debito = TRUE")
    fun findAllByDebits(): MutableIterable<Transaction>?
    @Query(value = "Select b from Transaction b where b.debito = FALSE")
    fun findAllByCredits() : MutableIterable<Transaction>?

    @Query(value = "Select b from Transaction b where b.date = ?1")
    fun findConsolidatedByDate(date: Date) : MutableIterable<Transaction>?
}
