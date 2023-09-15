package com.example.atividadepratica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividadepratica.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityDetalhesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var position = intent.getIntExtra("position", -1)

        if(position == -1){
            finish()
        }

        var compromisso = ListaCompromissos.getCompromisso(position)

        binding.textTituloCompromisso.text = compromisso.titulo
        binding.textData.text = compromisso.data
        binding.textHorarioInicio.text = "Horário Início: ${compromisso.horaInicio}"
        binding.textHorarioFim.text = "Horário Fim: ${compromisso.horaFim}"
        binding.textDescricao.text = "Descrição: ${compromisso.descricao}"

        binding.btnDelete.setOnClickListener {
            ListaCompromissos.removeComnpromisso(position)
            finish()
        }

    }
}