package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastrar.setOnClickListener {
            val carBrand = binding.editBrand.text.toString()
            val carModel = binding.editModel.text.toString()
            val carColor = binding.editColor.text.toString()
            val carYearStr = binding.editYear.text.toString()
            val carLicensePlate = binding.editLicensePlate.text.toString()
            val carKmStr = binding.editKm.text.toString()

            if (carBrand.isEmpty() ||
                carModel.isEmpty() ||
                carColor.isEmpty() ||
                carYearStr.isEmpty() ||
                carLicensePlate.isEmpty() ||
                carKmStr.isEmpty()) {

                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                val carYear = carYearStr.toInt()
                val carKm = carKmStr.toFloat()

                val car = Carro(carBrand, carModel, carColor, carYear, carLicensePlate, carKm)
                ListaDeCarros.adicionarCarro(car)

                finish()
            }
        }
    }
}
