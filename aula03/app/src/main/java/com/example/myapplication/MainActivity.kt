package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // buscar a referencia de componentes da view
        var txtMensagem = findViewById<TextView>(R.id.Mensagem);
        var editNome = findViewById<EditText>(R.id.editNome);
        var btnEnviar = findViewById<Button>(R.id.btnEnviar);



        // criar variavel local
        var mensagem = "Aula 03 de Android";

        // atribuir o valor resta variavel para o txtMensagem
        txtMensagem.text = mensagem;

        // configurar a ação de clique do botão btnEnviar "Enviar!"
        btnEnviar.setOnClickListener {
            if(editNome.text.isEmpty()){
                Toast.makeText(this, "Informe um nome!",Toast.LENGTH_LONG).show();
            } else {

                var nome = editNome.text.toString();

                // mostrar nome cadastrado dentro de um toast
                Toast.makeText(this, "Nome Cadastrado: $nome", Toast.LENGTH_LONG).show();

                // limpa o campo automaticamente
                editNome.text.clear();


            }
        }

    }
}