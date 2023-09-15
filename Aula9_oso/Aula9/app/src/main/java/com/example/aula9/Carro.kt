package com.example.aula9

class Carro() {

    var marca : String
    var modelo : String
    var ano : Int
    var cor : String

    constructor(marca : String, modelo: String, ano: Int) : this(){
        this.marca = marca
        this.modelo = modelo
        this.ano = ano
    }

    init {
        marca = "Ford"
        modelo = "Ka"
        ano = 2023
        cor = "Preto"
    }

    override fun toString(): String {
        return "Carro => Marca: $marca. Modelo: $modelo. Ano: $ano . Cor: $cor"
    }


}