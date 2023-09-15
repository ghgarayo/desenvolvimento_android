package com.example.exercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicios.complexa.FolhaCadastroActivity
import com.example.exercicios.databinding.ActivityMainBinding
import com.example.exercicios.simples.FolhaSimplesActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFS.setOnClickListener {
            startActivity(Intent(this, FolhaSimplesActivity::class.java))
        }

        binding.btnFC.setOnClickListener {
            startActivity(Intent(this, FolhaCadastroActivity::class.java))
        }
    }
}