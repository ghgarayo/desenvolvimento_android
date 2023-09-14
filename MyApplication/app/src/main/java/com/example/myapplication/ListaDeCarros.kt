package com.example.myapplication

class ListaDeCarros private constructor(){
    companion object{ //atributos e metodos static no java

        private var listaDeCarros = mutableListOf<Carro>()

        init {
            ListaDeCarros.adicionarCarro(Carro("Ford", "Ka","Vermelho",2014,"ABC-1234",81351.25f))
            ListaDeCarros.adicionarCarro(Carro("Chevrolet", "Meriva","Preto",2011,"ALF-2214",160000.25f))
            ListaDeCarros.adicionarCarro(Carro("Honda", "Fit","Cinza",2009,"AQZ-2039",170000.25f))

        }

        fun adicionarCarro(carro: Carro){
            listaDeCarros.add(carro)
        }

        fun getCarro(position: Int) : Carro{
            return listaDeCarros[position]
        }

        fun removerCarro(position: Int){
            listaDeCarros.removeAt(position)
        }

        fun getListSize(): Int {
            return listaDeCarros.size
        }

    }
}