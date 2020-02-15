package com.osman.springkotlin.security

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : MongoRepository<Product, String>


