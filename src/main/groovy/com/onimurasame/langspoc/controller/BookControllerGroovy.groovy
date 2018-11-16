package com.onimurasame.langspoc.controller

import com.google.gson.Gson
import com.onimurasame.langspoc.data.BookGroovy
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = "/groovy")
class BookControllerGroovy {

    @GetMapping("books")
    ResponseEntity getBooks() {
        List bookList = [
                new BookGroovy(UUID.randomUUID(), "Harry Potter y el paro escolar"),
                new BookGroovy(UUID.randomUUID(), "Harry Potter y la jornada completa")
        ]

        return new ResponseEntity(new Gson().toJson(bookList), HttpStatus.OK)
    }
}
