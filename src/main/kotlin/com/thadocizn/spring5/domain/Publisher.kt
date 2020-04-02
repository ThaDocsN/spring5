package com.thadocizn.spring5.domain

import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import javax.persistence.*

/**
 * Created by charles on 01,Apr,2020
 */
@Entity
data class Publisher (

    var name: String = "",
    var address: String = "",
    var city: String = "",
    var state: String = "",
    var zipCode: String = ""
){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

    @OneToMany
    @JoinColumn(name = "publisher_id")
    var books:MutableSet<Book> = HashSet<Book>()

}