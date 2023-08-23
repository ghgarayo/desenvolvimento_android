package com.example.lista_exercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista_exercicios.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textExercicio1.text = "1 - Aumento de salário"
        binding.btnOpenExercise1.setOnClickListener{
            val intent = Intent(this, Exercicio1::class.java)
            startActivity(intent)
        }

        binding.textExercicio2.text = "2 - Volume de uma caixa"
        binding.btnOpenExercise2.setOnClickListener{
            val intent = Intent(this, Exercicio2::class.java)
            startActivity(intent)
        }

        binding.textExercicio3.text = "3 - Idade de uma pessoa"
        binding.btnOpenExercise3.setOnClickListener{
            val intent = Intent(this, Exercicio3::class.java)
            startActivity(intent)
        }

        binding.textExercicio4.text = "4 - Consumo médio de um veículo"
        binding.btnOpenExercise4.setOnClickListener {
            val intent = Intent(this, Exercicio4::class.java)
            startActivity(intent)
        }

        binding.textExercicio5.text = "5 - Média de um aluno"
        binding.btnOpenExercise5.setOnClickListener {
            val intent = Intent(this, Exercicio5::class.java)
            startActivity(intent)
        }

        binding.textExercicio6.text = "6 - Converter de ºC para ºF"
        binding.btnOpenExercise6.setOnClickListener {
            val intent = Intent(this, Exercicio6::class.java)
            startActivity(intent)
        }

        binding.textExercicio7.text = "7 - Volume de um cilindro"
        binding.btnOpenExercise7.setOnClickListener {
            val intent = Intent(this, Exercicio7::class.java)
            startActivity(intent)
        }

    }
}