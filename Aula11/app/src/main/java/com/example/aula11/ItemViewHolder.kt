package com.example.aula11

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ItemViewHolder (layoutView: View) : ViewHolder(layoutView) {
   var nomeView = layoutView.findViewById<TextView>(R.id.txtNomeView)
   var qtdeView = layoutView.findViewById<TextView>(R.id.txtQtdeView)
}