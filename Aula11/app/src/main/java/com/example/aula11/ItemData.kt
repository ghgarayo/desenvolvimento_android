package com.example.aula11

class ItemData private constructor() {
    companion object {
        val listaItens = mutableListOf<Item>()

        init {
            listaItens.add(Item("Arroz", 1))
            listaItens.add(Item("Leite", 3))
            listaItens.add(Item("Bolacha", 2))
        }

        fun getTamanhoLista() : Int {
            return listaItens.size
        }

        fun adicionarItem(item: Item) {
            listaItens.add(item)
        }
    }
}