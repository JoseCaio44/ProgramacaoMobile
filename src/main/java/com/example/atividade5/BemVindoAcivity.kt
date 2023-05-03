package com.example.atividade5

import android.os.Bundle
import android.content.Intent
import android.view.MenuItem
import android.widget.TextView


class BemVindoActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bem_vindo)
        val textView = findViewById<TextView>(R.id.textBoasVindas)

        val args = Intent.extras
        val nome = args?.getString("nome")
        textView.text = "$nome, seja bem vindo."
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == android.R.id.home){
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}