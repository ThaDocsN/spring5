package com.thadocizn.spring5.domain

import javax.persistence.*

@Entity
data class Author(
       val firstName: String,
       val lastName: String

){
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       val id: Long = 0

       @ManyToMany(mappedBy = "authors")
       var books:MutableSet<Book> = HashSet<Book>()
}