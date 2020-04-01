package com.thadocizn.spring5.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by charles on 01,Apr,2020
 */
@Entity
data class Publisher(
        val address:String,
        val city:String,
        val state:String,
        val zipCode:String
){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long = 0
}