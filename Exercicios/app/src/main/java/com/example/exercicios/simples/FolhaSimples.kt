package com.example.exercicios.simples

class FolhaSimples (var nome: String, var cargo: String, var horasTrab: Int, var valorHora: Float) {

    var abono : Float
    var salBruto : Float
    var salLiq : Float

    init {
        salBruto = valorHora * horasTrab

        abono = if (salBruto <= 1500) {
            salBruto * 0.2f
        } else if (salBruto <= 3000) {
            salBruto * 0.15f
        } else{
            salBruto * 0.1f
        }

        salLiq = salBruto + abono

        salBruto = String.format("%.2f", salBruto).toFloat()
        abono = String.format("%.2f", abono).toFloat()
        salLiq = String.format("%.2f", salLiq).toFloat()
    }

    override fun toString(): String {
        return "DADOS DO FUNCIONÁRIO:\n\n" +
                "NOME: $nome\n" +
                "CARGO: $cargo\n" +
                "HORAS TRABALHADAS: $horasTrab h\n" +
                "VALOR DA HORA: R$ $valorHora\n" +
                "ABONO: $abono\n" +
                "SALÁRIO BRUTO: $salBruto\n" +
                "SALÁRIO LÍQUIDO: $salLiq"
    }

}