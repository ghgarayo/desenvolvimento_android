package com.example.aula6

import android.content.Context
import android.content.Context.MODE_PRIVATE

class DadosLogin(context : Context) {

    private var sharedPreferences = context.getSharedPreferences("Login", MODE_PRIVATE)
    private val EMAIL = "ghgarayo@gmail.com"
    private val SENHA = "12345678"

    fun salvarDadosLogin(email: String, senha: String){
        sharedPreferences.edit().putString("email", email).putString("senha",senha).apply()
    }

    fun getEmail() : String{
        return sharedPreferences.getString("email", EMAIL) ?: ""
    }

    fun getSenha() : String{
        return sharedPreferences.getString("senha", SENHA) ?: ""
    }

}