package com.example.lista_exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lista_exercicios.databinding.ActivityExercicio1Binding

class Exercicio1 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lateinit var currentSalary: String
        lateinit var percentage: String

        binding = ActivityExercicio1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val question = "1 - Calcular o aumento que será dado a um funcionário, obtendo do usuário as seguintes informações:" +
                "\n\n - Salário atual \n - Porcentagem de aumento  " +
                "\n\nApresentar o novo valor do salário e o valor do aumento."

        binding.question1.text = question

        binding.btnCalculateSalaryIncrease.setOnClickListener {

            currentSalary = binding.editCurrentSalary.text.toString()
            percentage = binding.editPercentage.text.toString()

            if(currentSalary.isEmpty() || percentage.isEmpty()){
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()

            } else {

                val newSalary = calculateSalaryIncrease(currentSalary, percentage)
                val formattedCurrentSalary = formatCurrency(currentSalary)
                val formattedNewSalary = formatCurrency(newSalary.toString())
                val message =
                    "Seu salário será ajustado de $formattedCurrentSalary para $formattedNewSalary. \nSeu aumento foi de $percentage%. \n\nParabéns!"

                binding.showNewSalaryText.text = message

                binding.editCurrentSalary.text.clear()
                binding.editPercentage.text.clear()

            }
        }
    }

    private fun calculateSalaryIncrease(currentSalary: String, percentage: String): Double {
        val salary = currentSalary.toDoubleOrNull()
        val percent = percentage.toDoubleOrNull()

        if (salary != null && percent != null) {
            return (salary * percent.div(100)) + salary
        } else {
            throw IllegalArgumentException("Erro! Valores inválidos!")
        }
    }

    private fun formatCurrency(value: String): String {
        val formattedValue = value.toDoubleOrNull()?.let {
            String.format("R$ %.2f", it)
        } ?: value
        return formattedValue
    }

}
