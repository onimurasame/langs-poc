package com.onimurasame.langspoc.controller

import com.google.gson.Gson
import com.onimurasame.langspoc.data.BookKotlin
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping(path = ["/kotlin"])
class BookControllerKotlin {

    private val gson: Gson = Gson()

    @GetMapping(path = ["/books"])
    fun getBooks(): ResponseEntity<String> {

        val bookList = arrayOf(BookKotlin(UUID.randomUUID(), "Harry Potter y el paro escolar"), BookKotlin(UUID.randomUUID(), "Harry Potter y la jornada completa"))

        return ResponseEntity(gson.toJson(bookList), HttpStatus.OK)

    }

}