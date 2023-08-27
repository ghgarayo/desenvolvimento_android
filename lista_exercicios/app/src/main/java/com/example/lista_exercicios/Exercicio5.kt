package com.example.lista_exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lista_exercicios.databinding.ActivityExercicio5Binding

class Exercicio5 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicio5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val question =
            "5. Calcular a média final de um aluno com base nas suas 4 notas bimestrais.\n\n" +
                    "Não permitir notas negativas, ou acima de 10 em cada bimestre.\n"


        binding.question.text = question

        binding.btnCalculate.setOnClickListener {

            val firstBimonthly = binding.editFirstBimester.text.toString()
            val secondBimonthly = binding.editSecondBimester.text.toString()
            val thirdBimonthly = binding.editThirdBimester.text.toString()
            val fourthBimonthly = binding.editFourthBimester.text.toString(
            )

            if (firstBimonthly.isEmpty() || secondBimonthly.isEmpty() || thirdBimonthly.isEmpty() || fourthBimonthly.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {

                val average = calculateAverage(
                    firstBimonthly,
                    secondBimonthly,
                    thirdBimonthly,
                    fourthBimonthly
                )
                binding.textShowResult.text = "A média final do aluno é $average."

                binding.editFirstBimester.text.clear()
                binding.editSecondBimester.text.clear()
                binding.editThirdBimester.text.clear()
                binding.editFourthBimester.text.clear()

            }
        }
    }
    fun calculateAverage(
        firstBimonthly: String,
        secondBimonthly: String,
        thirdBimonthly: String,
        fourthBimonthly: String
    ): Double {
        val first = firstBimonthly.toDoubleOrNull()
        val second = secondBimonthly.toDoubleOrNull()
        val third = thirdBimonthly.toDoubleOrNull()
        val fourth = fourthBimonthly.toDoubleOrNull()

        if (first != null && second != null && third != null && fourth != null) {
            if (first < 0 || second < 0 || third < 0 || fourth < 0) {
                throw IllegalArgumentException("Erro! Valores inválidos!")
            } else if (first > 10 || second > 10 || third > 10 || fourth > 10) {
                throw IllegalArgumentException("Erro! Valores inválidos!")
            } else {
                return (first + second + third + fourth) / 4
            }
        } else {
            throw IllegalArgumentException("Erro! Valores inválidos!")
        }
    }

}