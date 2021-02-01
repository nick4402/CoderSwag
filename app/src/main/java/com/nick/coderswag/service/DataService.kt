package com.nick.coderswag.service

import com.nick.coderswag.model.Category
import com.nick.coderswag.model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$22","hat3"),
            Product("Devslopes Hat Snapback","$24","hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray","$20","hoodie1"),
            Product("Devslopes Hoodie Red","$22","hoodie2"),
            Product("Devslopes Gray Hoodie","$24","hoodie3"),
            Product("Devslopes Black Hoodie","$28","hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","$30","shirt1"),
            Product("Devslopes Bade Light Gray","$32","shirt2"),
            Product("Devslopes Logo Shirt Red","$34","shirt3"),
            Product("Devslopes Hustle","$36","shirt4"),
            Product("Kickfliip Studios","$38","shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProduct(category:String?) : List<Product> {
         return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}