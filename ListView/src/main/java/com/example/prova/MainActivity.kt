package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin = findViewById<Button>(R.id.acessar)

        btLogin.setOnClickListener{
            val tLogin = findViewById<TextView>(R.id.login)
            val tSenha = findViewById<TextView>(R.id.senha)
            val login = tLogin.text.toString()
            val senha = tSenha.text.toString()
            if(login == "aluno" && senha == "123") {
                toast("Bem vindo, login realizado com sucesso")
                val tela = Intent(this, BemVindo::class.java)
                startActivity(tela)
            } else {
                toast("Login ou Senha incorretos!!")
            }
        }
    }
    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, mensagem, length).show()
    }
}