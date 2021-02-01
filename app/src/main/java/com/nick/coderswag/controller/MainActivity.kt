package com.nick.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.nick.coderswag.R
import com.nick.coderswag.adapter.CategoryAdapter
import com.nick.coderswag.adapter.CategoryRecycleAdapter
import com.nick.coderswag.model.Category
import com.nick.coderswag.service.DataService
import com.nick.coderswag.utilitys.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories) { category ->
            val productInten = Intent(this,ProductActivity::class.java)
            productInten.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productInten)
        }
        categoryList.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryList.layoutManager = layoutManager
        categoryList.setHasFixedSize(true)


    }
}