package com.thadocizn.spring5.repositories

import com.thadocizn.spring5.domain.Author
import org.springframework.data.repository.CrudRepository

interface AuthorRepository:CrudRepository<Author, Long> {
}