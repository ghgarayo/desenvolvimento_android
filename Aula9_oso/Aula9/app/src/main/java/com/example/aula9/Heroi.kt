package com.example.aula9

class Heroi {

    var nome : String = ""
        set(value) {
            if (value == "") {
                field = "NPC"
            } else {
                field = value
            }
        }
        get() {
            if (field == "") {
                return "NPC"
            } else {
                return field
            }
        }

    var nivel : Int = 0
        set(value) {
            if (value < 0 || value > 100) {
                field = 0
            } else {
                field = value
            }
        }

    override fun toString(): String {
        return "$nome (Nivel: $nivel)"
    }

}