package com.example.materialdesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TerceiraTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)
        val bt_avancar: Button = findViewById<View>(R.id.bt_ava3) as Button
        val bt_retornar: Button = findViewById<View>(R.id.bt_ret3) as Button
        bt_avancar.setOnClickListener {
            avancar()
        }
        bt_retornar.setOnClickListener {
            retornar()
        }
        val actionBar: View = findViewById(R.id.include)
        actionBar.setBackgroundColor(R.color.quad4)
    }
    private fun avancar() {
        val tela = Intent(this, QuartaTela::class.java)
        startActivity(tela)
    }
    private fun retornar() {
        val tela = Intent(this, SegundaTela::class.java)
        startActivity(tela)
    }
}