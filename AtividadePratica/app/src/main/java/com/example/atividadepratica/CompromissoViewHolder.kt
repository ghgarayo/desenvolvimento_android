package com.example.atividadepratica

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CompromissoViewHolder(layoutCompromisso: View): RecyclerView.ViewHolder(layoutCompromisso) {
    var textCompromissoHorario = layoutCompromisso.findViewById<TextView>(R.id.textCompromissoHorario)
}