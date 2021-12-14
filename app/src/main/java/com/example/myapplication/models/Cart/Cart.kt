package com.example.myapplication.models.Cart

import android.util.Log
import com.example.myapplication.models.Product

object Cart {
    val addProduct = ArrayList<Product>()

    fun addProduct(product: Product) {
        if (addProduct.isEmpty()) {
            addProduct.add(product)
        } else {
            for (prod in addProduct) {
                if (prod.id == product.id) {
                    Log.d("Cart", "любой продукт")
                } else {
                    addProduct.add(product)
                }
            }
        }
    }
}