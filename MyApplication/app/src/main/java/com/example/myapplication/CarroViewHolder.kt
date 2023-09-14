package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarroViewHolder(layoutCarro : View): RecyclerView.ViewHolder(layoutCarro){
    var textBrandAndModel = layoutCarro.findViewById<TextView>(R.id.textBrandAndModel)
}