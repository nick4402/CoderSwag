package com.nick.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.nick.coderswag.R
import com.nick.coderswag.adapter.CategoryAdapter
import com.nick.coderswag.model.Category
import com.nick.coderswag.service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)

        categoryList.adapter = adapter
    }
}