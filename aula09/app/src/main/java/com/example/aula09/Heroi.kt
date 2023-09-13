package com.example.aula09

class Heroi() {

    var nome : String = ""
        set(value) {
            if (value.isEmpty()) {
                field = "NPC"
            } else {
                field = value
            }
        }
        get(){
            if (field == ""){
                return "NPC"
            } else {
                return field
            }
        }

    var nivel : Int = 0
        set(value){
            if(value < 0 || value > 100){
                field = 0
            } else {
                field = value
            }
        }

    constructor(nome : String, nivel : Int): this(){
        this.nome = nome
        this.nivel = nivel
    }

    override fun toString() : String{
        return "$nome | Nivel: $nivel"
    }

}