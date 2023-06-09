package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class BemVindo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)
        val btAvancar = findViewById<Button>(R.id.bt_ava)

        val pedido = findViewById<ImageView>(R.id.carrinho)
        val voltar = findViewById<ImageView>(R.id.volta)

        btAvancar.setOnClickListener{
            trocarTela()
        }
        pedido.setOnClickListener{
            trocarTela()
        }
        voltar.setOnClickListener{
            voltar()
        }
    }

    private fun trocarTela() {
        val tela = Intent(this, FazerPedido::class.java)
        startActivity(tela)
    }
    private fun voltar(){
        val tela = Intent(this, MainActivity::class.java)
        startActivity(tela)
    }
}