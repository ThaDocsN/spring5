package com.thadocizn.spring5.repositories

import com.thadocizn.spring5.domain.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository:CrudRepository<Book, Long> {
}