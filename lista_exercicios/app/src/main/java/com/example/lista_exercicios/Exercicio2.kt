package com.example.lista_exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lista_exercicios.databinding.ActivityExercicio2Binding

class Exercicio2 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicio2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val question = "2. Calcular o volume de uma caixa: "

        binding.question.text = question

        binding.btnCalculateVolume.setOnClickListener {

                val length = binding.editLength.text.toString()
                val height = binding.editHeight.text.toString()
                val width = binding.editWidth.text.toString()

                if(length.isEmpty() || height.isEmpty() || width.isEmpty()){
                    Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                } else {

                    val volume = calculateVolume(length, height, width)
                    binding.showVolume.text = "O volume da caixa é $volume m³."

                    binding.editLength.text.clear()
                    binding.editHeight.text.clear()
                    binding.editWidth.text.clear()
                }
        }
    }

    private fun calculateVolume(length: String, height: String, width: String): Double {
        val l = length.toDoubleOrNull()
        val h = height.toDoubleOrNull()
        val w = width.toDoubleOrNull()

        if (l != null && h != null && w != null) {
            return l * h * w
        } else {
            throw IllegalArgumentException("Erro! Valores inválidos!")
        }
    }

}