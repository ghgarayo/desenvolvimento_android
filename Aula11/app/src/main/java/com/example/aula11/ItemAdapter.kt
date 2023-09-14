package com.example.aula11

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)
        return  ItemViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val itemAtualDaLista = ItemData.listaItens[position]
        holder.nomeView.text = itemAtualDaLista.nome
        holder.qtdeView.text = "Quantidade: " + itemAtualDaLista.qtde.toString()
    }

    override fun getItemCount(): Int {
        return ItemData.getTamanhoLista()
    }
}