package com.example.exercicios.complexa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicios.Util
import com.example.exercicios.databinding.ActivityFolhaCadastroBinding

class FolhaCadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFolhaCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFolhaCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastrar2.setOnClickListener {
            validarDados()
        }
    }

    fun validarDados(){

        if (binding.edtNome2.text.isEmpty() ||
            binding.edtHorasTrab2.text.isEmpty() ||
            binding.edtValorHora2.text.isEmpty()) {

            Util.exibirToast(this, "Preencha todos os campos")
            return
        }

        var nome = binding.edtNome2.text.toString()
        var horasTrab = binding.edtHorasTrab2.text.toString().toInt()
        var valorHora = binding.edtValorHora2.text.toString().toFloat()

        var intent = Intent(this, FolhaComplexaActivity::class.java)

        intent.putExtra("nome", nome)
        intent.putExtra("horasTrab", horasTrab)
        intent.putExtra("valorHora", valorHora)
        startActivity(intent)


        binding.edtNome2.text.clear()
        binding.edtValorHora2.text.clear()
        binding.edtHorasTrab2.text.clear()
    }
}