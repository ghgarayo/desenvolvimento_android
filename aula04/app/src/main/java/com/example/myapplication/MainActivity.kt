package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Instanciar o objeto binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        /*
            ta o layout do main_activity.xml que está dentro
            do ActivityMainBinding, e copia todos os elementos de view
            para dentro da variável view
         */
        var view = binding.root

        // por fim, atribuimos a variavel como sendo o layout de nossa classe
        setContentView(view)

        // para acessar os componentes da view, basta chamar o objeto binding e acessamos os elementos através dele
        binding.btnCadastrar.setOnClickListener {

            if (binding.editName.text.isEmpty() ||
                binding.editName.text.isEmpty() ||
                binding.editAge.text.isEmpty()
            ) {

                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {

                var nome = binding.editName.text.toString()
                var idade = binding.editAge.text.toString()
                var email = binding.editEmail.text.toString()

                var dadosCadastrados = "Nome: $nome\n" +
                        "Idade: $idade anos\n" +
                        "E-mail: $email\n"

                binding.txtCadastro.text = dadosCadastrados

                // limpa os campos
                binding.editName.text.clear()
                binding.editAge.text.clear()
                binding.editEmail.text.clear()

            }

        }

        binding.btnRedirect.setOnClickListener {

            var intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }

    }
}