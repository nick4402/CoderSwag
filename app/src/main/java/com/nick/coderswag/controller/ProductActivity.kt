package com.nick.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nick.coderswag.R
import com.nick.coderswag.utilitys.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}