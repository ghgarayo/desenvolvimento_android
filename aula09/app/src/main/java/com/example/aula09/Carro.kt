package com.example.aula09

class Carro() {

    var marca : String
    var modelo : String
    var ano : Int
    var cor : String

    constructor(marca : String, modelo : String, ano : Int) : this(){
        this.marca = marca
        this.modelo = modelo
        this.ano = ano
}

    init{
        marca = "Chevrolet"
        modelo = "Meriva"
        ano = 2012
        cor = "Azul"
    }

    override fun toString(): String {
        return "==== Carro ==== \n" +
                "Marca: $marca \n" +
                "Modelo: $modelo \n" +
                "Ano: $ano" +
                "Cor: $cor"
    }

}