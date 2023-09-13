package com.example.myapplication

data class Carro(
    var id : Int, // verificar uuid
    var marca: String,
    var modelo: String,
    var cor: String,
    var ano: Int,
    var placa: String,
    var quilometragem: Float
    ) {

}