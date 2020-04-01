package com.thadocizn.spring5.bootStrap

import com.thadocizn.spring5.domain.Author
import com.thadocizn.spring5.domain.Book
import com.thadocizn.spring5.repositories.AuthorRepository
import com.thadocizn.spring5.repositories.BookRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


@Component
class BootStrapData(private val authorRepository: AuthorRepository, private val bookRepository:BookRepository):CommandLineRunner {

    override fun run(vararg args: String?) {
        val eric = Author("Eric", "Evans")
        val ddd = Book("Domain Driven Design", "123123")
        eric.books.add(ddd)
        ddd.authors.add(eric)

        authorRepository.save(eric)
        bookRepository.save(ddd)

        val rod = Author("Rod", "Johnson")
        val noEJB = Book("J2EE Development without EJB", "3939459459")
        rod.books.add(noEJB)
        noEJB.authors.add(rod)

        authorRepository.save(rod)
        bookRepository.save(noEJB)

        println("Started in Bootstrap")
        println("Number of Books: " + bookRepository.count())

    }
}