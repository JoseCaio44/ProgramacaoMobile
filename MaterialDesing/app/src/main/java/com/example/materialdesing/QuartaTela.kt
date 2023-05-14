package com.example.materialdesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class QuartaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarta_tela)
        val bt_avancar: Button = findViewById<View>(R.id.bt_ava4) as Button
        val bt_retornar: Button = findViewById<View>(R.id.bt_ret4) as Button
        bt_retornar.setOnClickListener {
            retornar()
        }
        bt_avancar.setOnClickListener {
            avancar()
        }
    }
    private fun avancar() {
        val tela = Intent(this, QuintaTela::class.java)
        startActivity(tela)
    }

    private fun retornar() {
        val tela = Intent(this, TerceiraTela::class.java)
        startActivity(tela)
    }
}