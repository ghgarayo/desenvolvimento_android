package com.example.atividadepratica

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.atividadepratica.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var dadosLogin: DadosLogin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // inicializa o sharedPreferences
        dadosLogin = DadosLogin(applicationContext)

        // ação de clique para o botão
        binding.btnEntrar.setOnClickListener {
            validarCampos()
        }

        binding.btnPrimeiroAcesso.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

    }

    private fun validarCampos() {

        if (binding.edtEmail.text.isEmpty() ||
            binding.edtSenha.text.isEmpty()
        ) {

            exibirToast("Preencha todos os campos!")
            return
        }

        var email = binding.edtEmail.text.toString()
        var senha = binding.edtSenha.text.toString()

        var sharedEmail = dadosLogin.getEmail()
        var sharedPassword = dadosLogin.getSenha()

        var validaAuth = email != sharedEmail || senha != sharedPassword

        // validar email e senha
        if (!validaAuth) {
            exibirToast("Login efetuado com sucesso!")
            // redirecionar para MainActivity
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            exibirToast("Login ou Senha incorretos, verifique")
            binding.edtSenha.text.clear()
        }
    }

    private fun exibirToast(mensagem : String){
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }
}