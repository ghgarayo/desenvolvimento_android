package com.example.aula5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.aula5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // criar uma referenia ao view binding desta clase
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inicializar o objeto binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // acima estamos "inflando" o layout do activity_main.xml
        // para dentro do objeto binding

        // setar o binding como layout desta classe
        var view = binding.root
        setContentView(view)


        // buscar referencia a componentes da maneira padrao
        /* var txtBox1 = findViewById<TextView>(R.id.txtBox1)
        var txtBox2 = findViewById<TextView>(R.id.txtBox2)
        var txtBox3 = findViewById<TextView>(R.id.txtBox3)
        var txtBox4 = findViewById<TextView>(R.id.txtBox4) */

        // acessar os componentes TextView utilizando o view binding
        binding.txtBox1.text = "Texto do box 1!"
        binding.txtBox2.text = "Aula 05 de Android!"
        binding.txtBox3.text = "Este é o terceiro box!"
        binding.txtBox4.text = "Hello there!"

        // configurar a ação de clique do botão
        binding.btnAbrir.setOnClickListener {

            // configurar intent para acessar a segunda activity
            var intent = Intent(this, SegundaActivity::class.java )

            // iniciar SegundaAvtivity
            startActivity(intent)

        }


    }
}