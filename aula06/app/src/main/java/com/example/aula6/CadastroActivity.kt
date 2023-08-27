package com.example.aula6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.aula6.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private lateinit var dadosLogin: DadosLogin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dadosLogin = DadosLogin(this)

        binding.btnCadastrar.setOnClickListener {
            validarDados()
        }
    }

    private fun validarDados(){

        if(binding.edtNovoEmail.text.isEmpty() ||
            binding.edtNovaSenha.text.isEmpty() ||
            binding.edtConfirmeSenha.text.isEmpty()) {

            exibirToast("Preencha todos os campos!")
            return;
        }

        var novoEmail = binding.edtNovoEmail.text.toString()
        var novaSenha = binding.edtNovaSenha.text.toString()
        var confirmarSenha = binding.edtConfirmeSenha.text.toString()

        val validaSenha = (novaSenha == confirmarSenha)

        if(!validaSenha){
            exibirToast("Senhas não são iguais!")
            binding.edtNovaSenha.text.clear()
            binding.edtConfirmeSenha.text.clear()
            return
        }

        dadosLogin.salvarDadosLogin(novoEmail,novaSenha)
        exibirToast("Novos dados de login salvos!")


        var intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
        finish()

    }

    private fun exibirToast(msg :String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}