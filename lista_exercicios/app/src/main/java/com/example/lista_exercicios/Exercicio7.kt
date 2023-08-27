package com.example.lista_exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista_exercicios.databinding.ActivityExercicio7Binding

class Exercicio7 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicio7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val question = "7. Calcular e apresentar o volume de uma lata de óleo cilíndrica,\n" +
                        "a partir da leitura do raio da base e da altura. "

        binding.question.text = question

        binding.btnCalculateVolume.setOnClickListener {

            val radius = binding.editRadius.text.toString()
            val height = binding.editHeight.text.toString()

            if(radius.isEmpty() || height.isEmpty()){
                binding.showVolume.text = "Preencha todos os campos!"
            } else {
                val volume = calculateVolume(radius, height)
                binding.showVolume.text = "O volume da lata de óleo é $volume m³."
            }
        }
    }

    fun calculateVolume(radius: String, height: String): Double {
        val r = radius.toDoubleOrNull()
        val h = height.toDoubleOrNull()

        if(r != null && h != null){

            val volume = Math.PI * Math.pow(r, 2.0) * h

            return String.format("%.2f", volume).toDouble()
        } else {
            throw IllegalArgumentException("Erro! Valores inválidos!")
        }
    }

}