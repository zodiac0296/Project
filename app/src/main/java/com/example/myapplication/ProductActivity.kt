package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.myapplication.models.Cart.Cart
import com.example.myapplication.models.Product

class ProductActivity : AppCompatActivity() {

    lateinit var product: Product


    lateinit var textName: TextView
    lateinit var textDescription: TextView
    lateinit var imageView: ImageView
    lateinit var button: Button
    lateinit var button1: Button
    lateinit var minus: Button
    lateinit var plus: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        product = intent.getSerializableExtra("product") as Product

        textName = findViewById(R.id.textName)
        textDescription = findViewById(R.id.textDescription)
        imageView = findViewById(R.id.imageView)

        button = findViewById(R.id.button)
        minus = findViewById(R.id.minus)
        plus = findViewById(R.id.plus)
        textName.text = product.name
        textDescription.text = product.descriptor
        Glide.with(this,).load(product.image).into(imageView)

        button.setOnClickListener {
            Cart.addProduct(product)
            Log.d("Cart", "addProduct: ${Cart.addProduct}")

            fun addProduct(product: Product){

            }


        }
    }
   //fun addElementToCart(product: Product){
        //if (Constants.Cart.size == 0){
         //   Constants.Cart.add(Cart(1, Product))
        //}else{
        //for(item in Constants.Cart){
          //  if (item.product == Product) {
              //  val index = Constants.Cart.indexOf(item)
              //  Constants.Cart[index].amount += 1
            //}else{
              //  Constants.Cart.add(Cart(1, Product))
            //}
          //}
        //}
        //Log.i("Cart: ", Constants.toString())
    //}
}