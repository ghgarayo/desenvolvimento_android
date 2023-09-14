package com.example.aula11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aula11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNovoProduto.setOnClickListener {
            // iniciar a CadastroActivity
            startActivity(Intent(this, CadastroActivity::class.java ))
        }

        // informar o contexto em que a recycler view será inicializada
        // para isso, utilizaremos a classe de apoio LinearLayoutManager
        binding.rclItens.layoutManager = LinearLayoutManager(this)
        // instanciar objeto do tipo ItemAdapter
        itemAdapter = ItemAdapter()
        // setar o adapter criado para a recycler view
        binding.rclItens.adapter = itemAdapter

    }

    override fun onStart() {
        super.onStart()
        // atualizar itens da recycler view
        itemAdapter.notifyDataSetChanged()
    }
}