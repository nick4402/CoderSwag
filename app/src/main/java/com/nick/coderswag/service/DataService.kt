package com.nick.coderswag.service

import com.nick.coderswag.model.Category
import com.nick.coderswag.model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTH","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","dititalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$22","hat03"),
            Product("Devslopes Hat Snapback","$24","hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray","$20","hoodie01"),
            Product("Devslopes Hoodie Red","$22","hoodie02"),
            Product("Devslopes Gray Hoodie","$24","hoodie03"),
            Product("Devslopes Black Hoodie","$28","hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","$30","shirt01"),
            Product("Devslopes Bade Light Gray","$32","shirt02"),
            Product("Devslopes Logo Shirt Red","$34","shirt03"),
            Product("Devslopes Hustle","$36","shirt04"),
            Product("Kickfliip Studios","$38","shirt05")
    )
}