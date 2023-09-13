package com.example.aula09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.aula09.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        exemplosAula09()

        val btnCadastrar = binding.btnCadastrar
        btnCadastrar.setOnClickListener {
            validarCadastro()
        }
    }

    private fun validarCadastro() {

        if (binding.editNome.text.isEmpty() ||
            binding.editValorHora.text.isEmpty() ||
            binding.editHorasTrabalhadas.text.isEmpty()
        ) {
            exibirToast("Preencha todos os campos!")
            return
        }

        if(binding.editValorHora.text.toString().toInt() <= 0 ||
            binding.editHorasTrabalhadas.text.toString().toInt() <=0f){
            exibirToast("Valores precisam ser maiores do que zero")
        }

        var nome = binding.editNome.text.toString()
        var valorHora = binding.editValorHora.toString().toFloat()
        var horasTrabalhadas = binding.editHorasTrabalhadas.toString().toInt()

        var funcionario = Funcionario(nome, valorHora, horasTrabalhadas)

        binding.textDadosFuncionarios.text = funcionario.toString()

    }

    private fun exibirToast(mensagem: String){
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }

    private fun exemplosAula09(){
        var p1 = Pessoa();
        p1.nome = "Bob"
        p1.idade = 33

//        Log.d("Teste Log.d","Nome: ${p1.nome} | Idade: ${p1.idade}")

        var p2 = Pessoa("Gustavo", 31)
        Log.d("Teste Log.d","Nome: ${p2.nome} | Idade: ${p2.idade}")

        var c1 = Carro()
        Log.d("Teste Log.d", c1.toString())

        var c2 = Carro("Honda", "City", 2023)
        Log.d("Teste Log.d", c2.toString())

        var h1 = Heroi()
        Log.d("Teste Log.d", h1.toString())

        var h2 = Heroi("Biroliro", 130)
        Log.d("Teste Log.d", h2.toString())
    }

}