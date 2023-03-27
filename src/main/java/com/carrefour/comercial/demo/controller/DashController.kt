package com.carrefour.comercial.demo.controller

import com.carrefour.comercial.demo.model.Transaction
import com.carrefour.comercial.demo.repository.TransactionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/dashboard")
class DashController {

    @Autowired
    private lateinit var controlService: TransactionRepository

    @GetMapping("/debits")
    fun getDebits(): MutableIterable<Transaction>? = controlService.findAllByDebits()

    @GetMapping("/credits")
    fun getCredits(): MutableIterable<Transaction>? = controlService.findAllByCredits()

    @GetMapping("/{date}")
    fun getConsolidatedByDate(date: Date): Transaction {
        val list = controlService.findConsolidatedByDate(date)
        var consolidated = 0.0
        list?.forEach { if (it.debito) consolidated += it.valor else consolidated -= it.valor }

        return Transaction(0L, false, consolidated, Date())
    }

}