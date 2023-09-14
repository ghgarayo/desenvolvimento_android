package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarroAdapter(var context: Context) : RecyclerView.Adapter<CarroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        var layoutCarro = LayoutInflater.from(parent.context).inflate(R.layout.layout_carro, parent, false)
        var carroViewHolder = CarroViewHolder(layoutCarro)

        return carroViewHolder
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        var carro = ListaDeCarros.getCarro(position)
        holder.textBrandAndModel.text = "${carro.marca} (${carro.modelo})"
        holder.textBrandAndModel.setOnLongClickListener {
            // iniciar a detalhes activity mandando como parametro para a intent,
            // o valor de "position" que é a posição do elemento clicado na lista
            var intent = Intent(context, DetalhesActivity::class.java)
            intent.putExtra("position", position)
            context.startActivity(intent)
            true
        }
    }

    override fun getItemCount(): Int {
        return ListaDeCarros.getListSize()
    }
}
