package com.thadocizn.spring5.domain

import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import javax.persistence.*

@Entity
data class Book(
       val title:String,
       val ibsn:String

){
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       val id:Long = 0

       @ManyToOne
       var publisher: Publisher = Publisher()

       @ManyToMany
       @JoinTable(name = "author_book", joinColumns = [JoinColumn(name = "book_id")],
               inverseJoinColumns = [JoinColumn(name = "author_id")])
       val authors:MutableSet<Author> = HashSet<Author>()


}