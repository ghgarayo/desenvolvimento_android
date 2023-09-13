package com.example.myapplication

class ListaDeCarros private constructor(){
    companion object{ //atributos e metodos static no java

        private var listaDeCarros = mutableListOf<Carro>()

        fun adicionarCarro(carro: Carro){
            listaDeCarros.add(carro)
        }

        fun getCarro(id: Int) : Carro{
            return listaDeCarros[id]
        }

        fun removerCarro(id: Int){
            listaDeCarros.removeAt(id)
        }

        fun getListSize(): Int {
            return listaDeCarros.size
        }

    }
}