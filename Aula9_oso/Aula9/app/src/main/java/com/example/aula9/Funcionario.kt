package com.example.aula9

class Funcionario (var nome: String, var valorHora: Float, var horasTrab: Int) {

    var salBruto : Float

    init {
        salBruto = valorHora * horasTrab
    }

    override fun toString(): String {
        return "DADOS DO FUNCIONÁRIO\n" +
                "Funcionário: $nome\n" +
                "Valor da hora: R$ $valorHora\n" +
                "Horas trabalhadas: $horasTrab h\n" +
                "Salário Bruto: R$ $salBruto"
    }
}