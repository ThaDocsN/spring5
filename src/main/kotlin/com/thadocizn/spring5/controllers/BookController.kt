package com.thadocizn.spring5.controllers

import com.thadocizn.spring5.repositories.BookRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by charles on 02,Apr,2020
 */
@Controller
class BookController(val bookRepository: BookRepository){

    @RequestMapping("/books")
    fun getBooks(model: Model): String {
        model.addAttribute("books", bookRepository.findAll())
        return "books/list"
    }
}