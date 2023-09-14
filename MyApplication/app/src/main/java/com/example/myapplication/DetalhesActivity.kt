package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetalhesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var position = intent.getIntExtra("position", -1)

        if (position == -1){
            finish()
        }

        var carro = ListaDeCarros.getCarro(position)
        binding.textBrand.text = carro.marca
        binding.textModel.text = carro.modelo
        binding.textColor.text = carro.cor
        binding.textYear.text = "Ano ${carro.ano}"
        binding.textLicensePlate.text = "Placa ${carro.placa}"
        binding.textKm.text = "${carro.quilometragem} KM"

        binding.btnDelete.setOnClickListener {
            ListaDeCarros.removerCarro(position)
            finish()
        }

    }
}