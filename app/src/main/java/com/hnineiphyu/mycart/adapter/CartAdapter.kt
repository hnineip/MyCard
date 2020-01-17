package com.hnineiphyu.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.mycart.R
import com.hnineiphyu.mycart.model.Carts
import kotlinx.android.synthetic.main.item_cart.view.*


class CartsViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

    var cartImage = itemView.findViewById<ImageView>(R.id.cart_image)
    var cartName = itemView.findViewById<TextView>(R.id.txt_name)
    var cartPrice = itemView.findViewById<TextView>(R.id.txt_price)
    var cartKilogram = itemView.findViewById<TextView>(R.id.txt_kilogram)
    var Count = itemView.findViewById<TextView>(R.id.txt_count)
    var CountIncrease = itemView.findViewById<Button>(R.id.btn_plus)
    var CountDecrease = itemView.findViewById<Button>(R.id.btn_minus)
}

class CartAdapter (val cartsList: ArrayList<Carts>):RecyclerView.Adapter<CartsViewHolder>() {

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartsViewHolder {

    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cart, parent, false)
    return CartsViewHolder(view)
}

    override fun getItemCount(): Int {
        return cartsList.size
    }

    override fun onBindViewHolder(holder: CartsViewHolder, position: Int) {
    holder.cartImage.setImageResource(cartsList[position].image)
    holder.cartName.text = cartsList[position].name
    holder.cartPrice.text = cartsList[position].price

        holder.CountIncrease.setOnClickListener {

            var count: Int = holder.Count.text.toString().toInt()
            count++
            holder.Count.text = count.toString()

        }

        holder.CountDecrease.setOnClickListener {

            var count: Int = holder.Count.text.toString().toInt()
            count--
            holder.Count.text = count.toString()

        }
    }
}