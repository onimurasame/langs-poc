package com.onimurasame.langspoc.controller;

import com.google.gson.Gson;
import com.onimurasame.langspoc.data.BookJava;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/java")
class BookControllerJava {

    private final Gson gson = new Gson();

    @GetMapping("books")
    public ResponseEntity<String> getBooks() {
        List<BookJava> bookList = new ArrayList<>();

        bookList.add(new BookJava(UUID.randomUUID(), "Harry Potter y el paro escolar"));
        bookList.add(new BookJava(UUID.randomUUID(), "Harry Potter y la jornada completa"));

        return new ResponseEntity<>(gson.toJson(bookList), HttpStatus.OK);
    }
}
