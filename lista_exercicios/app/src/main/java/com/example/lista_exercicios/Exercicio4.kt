package com.example.lista_exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lista_exercicios.databinding.ActivityExercicio4Binding

class Exercicio4 : AppCompatActivity() {

    lateinit var binding: ActivityExercicio4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicio4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val question =  "4. Calcular o consumo por litro de um carro, sendo que será informada a" +
                        "quantidade de quilômetros percorrido e a quantidade de litros abastecido."

        binding.question.text = question

        val btn = binding.btnCalculateAverageConsumption
        val editKm = binding.editKilometersDriven
        val editLiters = binding.editTotalFuel

        btn.setOnClickListener {
            val km = editKm.text.toString()
            val liters = editLiters.text.toString()

            if(km.isEmpty() || liters.isEmpty()){
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                val averageConsumption = calculateAverageConsumption(km, liters)
                binding.showAverageConsumption.text = "O consumo médio foi de $averageConsumption km/l"
            }
        }

    }

    private fun calculateAverageConsumption(km: String, liters: String): String {
        val kilometers = km.toDoubleOrNull()
        val totalFuel = liters.toDoubleOrNull()

        if(kilometers != null && totalFuel != null){
            return String.format("%.2f", kilometers.div(totalFuel))
        } else {
            throw IllegalArgumentException("Erro! Valores inválidos!")
        }
    }

}