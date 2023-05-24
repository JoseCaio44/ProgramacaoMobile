package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BemVindo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)

        val btAvancar = findViewById<Button>(R.id.bt_ava)

        btAvancar.setOnClickListener{
            trocarTela()
        }
    }

    private fun trocarTela() {
        val tela = Intent(this, FazerPedido::class.java)
        startActivity(tela)
    }
}