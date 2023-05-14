package com.example.materialdesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao: Button = findViewById<View>(R.id.bt_primeira_tela) as Button
        botao.setOnClickListener {
            trocarTela()
            //toast("Você clicou no Pesquisar/Search!")
        }
        val cidade:ImageView = findViewById(R.id.cidade)
        val menu : ImageView = findViewById(R.id.menu)

    }

    private fun trocarTela() {
        val tela = Intent(this, SegundaTela::class.java)
        startActivity(tela)
    }
    private fun toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}