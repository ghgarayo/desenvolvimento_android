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

        binding.textExercicio1.text = "Exercício 1"

        binding.btnOpenExercise1.setOnClickListener{
            val intent = Intent(this, Exercicio1::class.java)
            startActivity(intent)
        }


    }
}