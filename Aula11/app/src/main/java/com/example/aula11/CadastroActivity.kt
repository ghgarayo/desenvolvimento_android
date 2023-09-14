package com.example.aula11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.aula11.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSalvar.setOnClickListener {
            validarDados()
        }

    }

    private fun validarDados(){

        if (binding.edtNomeProd.text.isEmpty() ||
                binding.edtQtdeProd.text.isEmpty()) {
            Toast.makeText(this,
                "Preencha os todos os campos",
                Toast.LENGTH_SHORT).show()
            return
        }

        var nomeProd = binding.edtNomeProd.text.toString()
        var qtdeProd = binding.edtQtdeProd.text.toString().toInt()

        var item = Item(nomeProd, qtdeProd)

        ItemData.adicionarItem(item)
        finish()

    }
}