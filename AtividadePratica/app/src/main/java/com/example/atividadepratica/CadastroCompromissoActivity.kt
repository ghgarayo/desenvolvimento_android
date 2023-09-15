package com.example.atividadepratica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.atividadepratica.databinding.ActivityCadastroCompromissoBinding

class CadastroCompromissoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroCompromissoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroCompromissoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastrar.setOnClickListener {

            val titulo = binding.editTitulo.text.toString()
            val data = binding.editData.text.toString()
            val horarioInicio = binding.editHorarioInico.text.toString()
            val horarioFim = binding.editHorarioFim.text.toString()
            val descricao = binding.editDescricao.text.toString()

            if (titulo.isEmpty() || data.isEmpty() || horarioInicio.isEmpty() || horarioFim.isEmpty() || descricao.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                val compromisso = Compromisso(titulo, data, horarioInicio, horarioFim, descricao)
                ListaCompromissos.addCompromisso(compromisso)
                finish()
            }

        }
    }
}