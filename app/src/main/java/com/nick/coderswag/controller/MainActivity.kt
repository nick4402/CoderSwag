package com.nick.coderswag.controller

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
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories)
        categoryList.adapter = adapter

        /*
        categoryList.setOnItemClickListener { parent,view,i,id ->
            val category = DataService.categories[i]
            println("title ${category.title}")
            Toast.makeText(this,"You clicked on the ${category.title} cell",Toast.LENGTH_SHORT).show()
        }
         */

        val layoutManager = LinearLayoutManager(this)
        categoryList.layoutManager = layoutManager
        categoryList.setHasFixedSize(true)
    }
}