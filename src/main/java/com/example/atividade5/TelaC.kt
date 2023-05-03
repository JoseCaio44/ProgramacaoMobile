package com.example.atividade5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TelaC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_c)

        val bt_main: Button = findViewById<View>(R.id.bt_c) as Button
        bt_main.setOnClickListener {
            trocarTela()
        }
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun trocarTela() {
        val tela = Intent(this, MainActivity::class.java)
        startActivity(tela)
    }
}