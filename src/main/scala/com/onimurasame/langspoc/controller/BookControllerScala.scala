package com.onimurasame.langspoc.controller

import java.util.UUID

import com.google.gson.Gson
import com.onimurasame.langspoc.data.BookScala
import net.liftweb.json._
import org.springframework.http.{HttpStatus, MediaType, ResponseEntity}
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/scala"), produces = Array(MediaType.APPLICATION_JSON_UTF8_VALUE))
class BookControllerScala {

  private val gson = new Gson

  @GetMapping(path = Array("/books"))
  def getBooks: ResponseEntity[String] = {

    val bookList = Array(BookScala(UUID.randomUUID(), "Harry Potter y el paro escolar"), BookScala(UUID.randomUUID(), "Harry Potter y la jornada completa"))

    new ResponseEntity[String](compactRender(parse(gson.toJson(bookList))), HttpStatus.OK)

  }


}
