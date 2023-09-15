package com.example.atividadepratica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.atividadepratica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var compromissoAdapter: CompromissoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastrar.setOnClickListener {
            var intent = Intent(this, CadastroCompromissoActivity::class.java)
            startActivity(intent)
        }

        compromissoAdapter = CompromissoAdapter(this)
        binding.rcvListaCompromissos.layoutManager = LinearLayoutManager(this)
        binding.rcvListaCompromissos.adapter = compromissoAdapter

    }

    override fun onStart() {
        super.onStart()
        compromissoAdapter.notifyDataSetChanged()
    }
}