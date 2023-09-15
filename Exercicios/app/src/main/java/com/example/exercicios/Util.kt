package com.example.exercicios

import android.content.Context
import android.widget.Toast

class Util private constructor() {

    companion object {
        fun exibirToast (context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}