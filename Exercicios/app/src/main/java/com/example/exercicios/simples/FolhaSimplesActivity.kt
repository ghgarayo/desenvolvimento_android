package com.example.exercicios.simples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicios.Util
import com.example.exercicios.databinding.ActivityFolhaSimplesBinding

class FolhaSimplesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFolhaSimplesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFolhaSimplesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastrar.setOnClickListener {
            validarDados()
        }
    }

    fun validarDados(){

        if (binding.edtNome.text.isEmpty() || binding.edtCargo.text.isEmpty() ||
            binding.edtHorasTrab.text.isEmpty() || binding.edtValorHora.text.isEmpty()) {

            Util.exibirToast(this, "Preencha todos os campos")
            return
        }

        var nome = binding.edtNome.text.toString()
        var cargo = binding.edtCargo.text.toString()
        var horasTrab = binding.edtHorasTrab.text.toString().toInt()
        var valorHora = binding.edtValorHora.text.toString().toFloat()

        var folhaSimples = FolhaSimples(nome, cargo,horasTrab, valorHora)

        binding.txtVerDados.text = folhaSimples.toString()

        binding.edtNome.text.clear()
        binding.edtCargo.text.clear()
        binding.edtValorHora.text.clear()
        binding.edtHorasTrab.text.clear()
    }


}