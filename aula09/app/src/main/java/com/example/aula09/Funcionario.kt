package com.example.aula09

class Funcionario(var nome : String, var valorHora : Float , var horasTrabalhadas : Int) {

    var salarioBruto : Float

    init{
        salarioBruto = valorHora * horasTrabalhadas
    }

    override fun toString() : String{
        return "==== Funcionário ==== \n" +
                "Nome: $nome \n" +
                "Valor da hora: $valorHora \n" +
                "Horas trabalhadas: $horasTrabalhadas \n" +
                "Salário Bruto: $salarioBruto"
    }
}