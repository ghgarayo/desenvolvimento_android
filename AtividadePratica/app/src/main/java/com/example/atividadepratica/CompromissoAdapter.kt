package com.example.atividadepratica

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class CompromissoAdapter(var context: Context) : Adapter<CompromissoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompromissoViewHolder {
        var layoutCompromisso =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_compromisso, parent, false)
        var compromissoViewHolder = CompromissoViewHolder(layoutCompromisso)

        return compromissoViewHolder
    }

    override fun onBindViewHolder(holder: CompromissoViewHolder, position: Int) {
        var compromisso = ListaCompromissos.getCompromisso(position)
        holder.textCompromissoHorario.text="${compromisso.titulo} (${compromisso.horaInicio})"
        holder.textCompromissoHorario.setOnLongClickListener {
            var intent = Intent(context, DetalhesActivity::class.java)
            intent.putExtra("position", position)
            context.startActivity(intent)
            true
        }
    }

    override fun getItemCount(): Int {
        return ListaCompromissos.getListSize()
    }


}