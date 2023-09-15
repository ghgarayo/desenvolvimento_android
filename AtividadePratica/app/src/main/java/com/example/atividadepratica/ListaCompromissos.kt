package com.example.atividadepratica

class ListaCompromissos private constructor() {

    companion object {

        private var listaCompromissos = mutableListOf<Compromisso>()

        init{
            ListaCompromissos.addCompromisso(Compromisso("Reunião Com Maria", "23/09/2023", "13:00", "14:00", "Pedido de casamento!"))
        }
         fun addCompromisso (compromisso: Compromisso) {
             listaCompromissos.add(compromisso)
         }

        fun removeComnpromisso (position: Int){
            listaCompromissos.removeAt(position)
        }

        fun getCompromisso(position: Int) : Compromisso {
            return listaCompromissos[position]
        }

        fun getListSize(): Int {
            return listaCompromissos.size
        }

    }
}