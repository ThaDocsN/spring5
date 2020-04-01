package com.thadocizn.spring5.domain

import javax.persistence.*

@Entity
data class Book(
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       val id:Long,
       val title:String,
       val ibsn:String,
       @ManyToMany
       @JoinTable(name = "author_book", joinColumns = [JoinColumn(name = "book_id")],
       inverseJoinColumns = [JoinColumn(name = "author_id")])
       val authors:Set<Author>
)