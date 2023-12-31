package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var carroAdapter: CarroAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        carroAdapter = CarroAdapter(this)
        binding.rcvCarros.layoutManager = LinearLayoutManager(this)
        binding.rcvCarros.adapter = carroAdapter

        binding.btnCadastrar.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        carroAdapter.notifyDataSetChanged()
    }

}