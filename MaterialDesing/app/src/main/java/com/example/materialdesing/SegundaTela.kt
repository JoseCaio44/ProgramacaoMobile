package com.example.materialdesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        val bt_avancar: Button = findViewById<View>(R.id.bt_ava2) as Button
        val bt_retornar: Button = findViewById<View>(R.id.bt_ret2) as Button
        bt_avancar.setOnClickListener {
            avancar()
        }
        bt_retornar.setOnClickListener {
            retornar()
        }
    }

    private fun avancar() {
        val tela = Intent(this, TerceiraTela::class.java)
        startActivity(tela)
    }
    private fun retornar() {
        val tela = Intent(this, MainActivity::class.java)
        startActivity(tela)
    }
}