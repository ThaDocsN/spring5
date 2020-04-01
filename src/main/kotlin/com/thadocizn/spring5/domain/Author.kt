package com.thadocizn.spring5.domain

import javax.persistence.*

@Entity
data class Author(
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       val id: Long,
       val firstName: String,
       val lastName: String,
       @ManyToMany(mappedBy = "authors")
       val books:Set<Book>
){

}