package com.example.aula9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.aula9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnCadastrar.setOnClickListener {

            validarCadastro()
        }

        //exemplosOO()

    }

    fun validarCadastro(){
        if (binding.edtNome.text.isEmpty() ||
            binding.edtHorasTrab.text.isEmpty() ||
            binding.edtValorHora.text.isEmpty()) {
            exibirToast("Preencha todos os campos")
            return
        }

        if (binding.edtHorasTrab.text.toString().toInt() <= 0 ||
                binding.edtValorHora.text.toString().toFloat() <= 0f) {
            exibirToast("Valores precisam ser maiores que zero")
            return
        }

        var nome = binding.edtNome.text.toString()
        var valorHora = binding.edtValorHora.text.toString().toFloat()
        var horasTrab = binding.edtHorasTrab.text.toString().toInt()

        var funcionario = Funcionario(nome, valorHora, horasTrab)
        exibirToast("Funcionário cadastrado!")

        binding.txtDadosFuncionario.text = funcionario.toString()
        binding.edtNome.text.clear()
        binding.edtHorasTrab.text.clear()
        binding.edtValorHora.text.clear()

    }

    fun exibirToast(msg : String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun exemplosOO(){
        // Pessoa p1 = new Pessoa("Bob", 33);
        // Pessoa p2 = new Pessoa();

        var p1 = Pessoa()
        p1.nome = "Bob"
        p1.idade = 45
        Log.d("TESTE","Nome: ${p1.nome}. Idade: ${p1.idade}");

        var p2 = Pessoa("Jason", 36)
        Log.d("TESTE","Nome: ${p2.nome}. Idade: ${p2.idade}");

        var c1 = Carro()
        Log.d("TESTE", c1.toString())

        var c2 = Carro("Nissan", "Versa", 2020)
        Log.d("TESTE", c2.toString())

        var h1 = Heroi()
        Log.d("TESTE", h1.toString())

        var h2 = Heroi()
        h2.nome = "Boberson"
        h2.nivel = 150
        Log.d("TESTE", h2.toString())
    }
}