package com.example.atividade5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TelaB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_b)
        val bt_main: Button = findViewById<View>(R.id.bt_b) as Button
        bt_main.setOnClickListener {
            trocarTela()
        }
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun trocarTela() {
        val segundaTela = Intent(this, TelaB::class.java)
        startActivity(segundaTela)
    }

}