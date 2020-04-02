package com.thadocizn.spring5.controllers

import com.thadocizn.spring5.repositories.AuthorRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by charles on 02,Apr,2020
 */
@Controller
class AuthorController(val authorRepository: AuthorRepository) {

    @RequestMapping("/authors")
    fun getAuthors(model: Model): String {
        model.addAttribute("authors", authorRepository.findAll())
        return "authors/list"
    }
}