package com.thadocizn.spring5.repositories

import org.springframework.data.repository.CrudRepository

interface Book:CrudRepository<Book, Long> {
}