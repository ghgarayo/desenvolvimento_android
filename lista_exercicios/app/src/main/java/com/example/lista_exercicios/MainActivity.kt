package com.example.lista_exercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.lista_exercicios.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        data class ExerciseInfo(val title: String, val exerciseClass: Class<out AppCompatActivity>)

        val exerciseList = listOf(
            ExerciseInfo("1 - Aumento de salário", Exercicio1::class.java),
            ExerciseInfo("2 - Volume de uma caixa", Exercicio2::class.java),
            ExerciseInfo("3 - Idade de uma pessoa", Exercicio3::class.java),
            ExerciseInfo("4 - Consumo médio de um veículo", Exercicio4::class.java),
            ExerciseInfo("5 - Média de um aluno", Exercicio5::class.java),
            ExerciseInfo("6 - Converter de ºC para ºF", Exercicio6::class.java),
            ExerciseInfo("7 - Volume de um cilindro", Exercicio7::class.java)
        )

        for ((index, exercise) in exerciseList.withIndex()) {
            val textViewId = resources.getIdentifier("textExercicio${index + 1}", "id", packageName)
            val buttonId = resources.getIdentifier("btnOpenExercise${index + 1}", "id", packageName)

            val textView = findViewById<TextView>(textViewId)
            val button = findViewById<Button>(buttonId)

            textView.text = exercise.title
            button.setOnClickListener {
                val intent = Intent(this, exercise.exerciseClass)
                startActivity(intent)
            }
        }
    }
}
