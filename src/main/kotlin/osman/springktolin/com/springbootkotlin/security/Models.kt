package osman.springktolin.com.springbootkotlin.security

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Product(val name : String, val  description : String, val price:  Int, val quantity : Int) {
    @Id val id: String = UUID.randomUUID().toString()
}



@Document
data class OrderProduct(val name: String, val description :String, val price : Int, val quantity : Int) {
    @Id val id: String = UUID.randomUUID().toString()
}


