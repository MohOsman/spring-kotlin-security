package com.osman.springkotlin.ecommerce

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : MongoRepository<Product, String>


@Repository
interface OrderRepository : MongoRepository<Order, String>