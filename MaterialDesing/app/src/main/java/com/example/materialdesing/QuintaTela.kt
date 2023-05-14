package com.example.materialdesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class QuintaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quinta_tela)
        val bt_retornar: Button = findViewById<View>(R.id.bt_ret5) as Button
        bt_retornar.setOnClickListener {
            retornar()
        }

    }
    private fun retornar() {
        val tela = Intent(this, QuartaTela::class.java)
        startActivity(tela)
    }
}