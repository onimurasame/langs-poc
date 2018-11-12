package com.onimurasame.langspoc.controller

import com.google.gson.Gson
import com.onimurasame.langspoc.data.BookJava
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = "/groovy")
class BookControllerGroovy {

    private final Gson gson = new Gson()

    @GetMapping("books")
    ResponseEntity getBooks() {
        List bookList = [
                new BookJava(UUID.randomUUID(), "Harry Potter y el paro escolar"),
                new BookJava(UUID.randomUUID(), "Harry Potter y la jornada completa")
        ]

        return new ResponseEntity(gson.toJson(bookList), HttpStatus.OK)
    }
}
