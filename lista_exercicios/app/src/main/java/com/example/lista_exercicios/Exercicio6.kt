package com.example.lista_exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.lista_exercicios.databinding.ActivityExercicio6Binding

class Exercicio6 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicio6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val question = "6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit."

        binding.question.text = question


        binding.editCelsius.addTextChangedListener {
            val temperature = binding.editCelsius.text.toString()

            if(temperature.isEmpty()){
                binding.showTemperature.text = "Preencha o campo!"
            } else {
                val convertedTemperature = convertTemperature(temperature)
                binding.showTemperature.text = "A temperatura convertida é $convertedTemperature °F."
            }
        }


    }

    fun convertTemperature(temperature: String): Double {
        val t = temperature.toDoubleOrNull()

        if(t != null){
            return (t * 9/5) + 32
        } else {
            throw IllegalArgumentException("Erro! Valor inválido!")
        }
    }


}