package com.nick.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nick.coderswag.R
import com.nick.coderswag.model.Product
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductAdapter(val context:Context,val products:List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {
    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice  = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product:Product,context:Context) {
            val resouredId = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage?.setImageResource(resouredId)
            productName?.text = product.title
            productPrice?.text = product.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position],context)
    }

    override fun getItemCount(): Int {
        return products.count()
    }
}