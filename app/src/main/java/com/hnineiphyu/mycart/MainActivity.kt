package com.hnineiphyu.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.mycart.adapter.CartAdapter
import com.hnineiphyu.mycart.model.Carts
import android.widget.LinearLayout as LinearLayout1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.cart_recycler)

        val cartArray = ArrayList<Carts>()

        cartArray.add(Carts(R.drawable.sugar, "Find Grain Sugar", "Price - $20.00"))

        cartArray.add(Carts(R.drawable.peanuts, "Peanuts", "Price - $20.00"))

        cartArray.add(Carts(R.drawable.daawat, "Dawat", "Price - $80.00"))

        val shoesAdapter = CartAdapter(cartArray)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = shoesAdapter
    }
}
