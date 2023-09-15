package com.example.atividadepratica

import android.content.Context

class DadosLogin(context: Context) {

    private var sharedPreferences = context.getSharedPreferences("Login", Context.MODE_PRIVATE)
    private val EMAIL = "" // inserir aqui seu email padrao para login
    private val SENHA = "" // inserir aqui sua senha padrão para login

    // para "Plano B", obrigatório implementar função abaixo no projeto
    fun salvarDadosLogin(email: String, senha: String) {
        sharedPreferences.edit()
            .putString("email", email)
            .putString("senha", senha)
            .apply()
    }

    fun getEmail(): String {
        return sharedPreferences.getString("email", EMAIL) ?: ""
    }

    fun getSenha(): String {
        return sharedPreferences.getString("senha", SENHA) ?: ""
    }

}