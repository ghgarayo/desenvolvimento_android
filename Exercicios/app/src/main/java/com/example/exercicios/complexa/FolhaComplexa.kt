package com.example.exercicios.complexa

class FolhaComplexa (var nome: String, var horasTrab: Int, var valorHora: Float) {

    var ir : Float
    var inss: Float
    var fgts: Float
    var salBruto : Float
    var salLiq : Float

    init {
        salBruto = valorHora * horasTrab

        ir = if (salBruto <= 1372.81f) {
            0f
        } else if (salBruto <= 2743.25f) {
            salBruto * 0.15f
        } else{
            salBruto * 0.275f
        }

        inss = if (salBruto <= 868.29f) {
            salBruto * 0.08f
        } else if (salBruto <= 1447.14f) {
            salBruto * 0.09f
        } else if (salBruto <= 2894.28f) {
            salBruto * 0.11f
        } else {
            318.37f
        }

        fgts = salBruto * 0.08f

        salLiq = salBruto - ir - inss
        salBruto = String.format("%.2f", salBruto).toFloat()
        ir = String.format("%.2f", ir).toFloat()
        salLiq = String.format("%.2f", salLiq).toFloat()
        inss = String.format("%.2f", inss).toFloat()
        fgts = String.format("%.2f", fgts).toFloat()
    }

    override fun toString(): String {
        return "DADOS DO FUNCIONÁRIO:\n\n" +
                "NOME: $nome\n" +
                "HORAS TRABALHADAS: $horasTrab h\n" +
                "VALOR DA HORA: R$ $valorHora\n" +
                "IR: $ir\n" +
                "INSS: $inss\n" +
                "FGTS: $fgts\n" +
                "SALÁRIO BRUTO: $salBruto\n" +
                "SALÁRIO LÍQUIDO: $salLiq"
    }
}