package com.nick.coderswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.nick.coderswag.R
import com.nick.coderswag.adapter.ProductAdapter
import com.nick.coderswag.service.DataService
import com.nick.coderswag.utilitys.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var  adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataService.getProduct(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this,spanCount)
        productList.layoutManager = layoutManager
        productList.adapter = adapter
    }
}