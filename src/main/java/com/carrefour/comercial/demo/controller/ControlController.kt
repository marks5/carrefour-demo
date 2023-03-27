package com.carrefour.comercial.demo.controller

import com.carrefour.comercial.demo.model.Transaction
import com.carrefour.comercial.demo.repository.TransactionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/transaction")
class ControlController {

    @Autowired
    private lateinit var controlService: TransactionRepository

    @PostMapping
    fun insert(@RequestBody transaction: Transaction): Transaction = controlService.save(transaction)

}