package com.thadocizn.spring5.repositories

import com.thadocizn.spring5.domain.Publisher
import org.springframework.data.repository.CrudRepository

/**
 * Created by charles on 01,Apr,2020
 */
interface PublisherRepository:CrudRepository<Publisher, Long> {
}