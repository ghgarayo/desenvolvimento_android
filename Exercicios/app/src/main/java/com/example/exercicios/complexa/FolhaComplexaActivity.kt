package com.example.exercicios.complexa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicios.MainActivity
import com.example.exercicios.databinding.ActivityFolhaComplexaBinding

class FolhaComplexaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFolhaComplexaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFolhaComplexaBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var nome = intent.getStringExtra("nome")
        var horasTrab = intent.getIntExtra("horasTrab", 0)
        var valorHora = intent.getFloatExtra("valorHora", 0f)

        var folhaComplexa = FolhaComplexa(nome.toString(), horasTrab, valorHora)

        binding.txtDadosComplexos.text = folhaComplexa.toString()

        binding.btnMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}