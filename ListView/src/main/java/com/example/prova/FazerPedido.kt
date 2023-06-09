package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class FazerPedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fazer_pedido)

        val btcadastrar = findViewById<Button>(R.id.bt_pedido)
        val calcular = findViewById<ImageView>(R.id.calcular)
        val voltar = findViewById<ImageView>(R.id.volta)

        btcadastrar.setOnClickListener{
            val nome = findViewById<TextView>(R.id.nome_prod).text.toString()
            val quantidade = findViewById<TextView>(R.id.quantidade).text.toString().toInt()
            val preco = findViewById<TextView>(R.id.preco).text.toString().toInt()
            fazerPedido( quantidade, preco, nome)
        }
        calcular.setOnClickListener{
            val quantidade = findViewById<TextView>(R.id.quantidade).text.toString().toInt()
            val preco = findViewById<TextView>(R.id.preco).text.toString().toInt()
            val total = quantidade * preco
            toast("Valor total: $total")
        }
        voltar.setOnClickListener{
            voltar()
        }
    }

    private fun fazerPedido(quantidade : Int,preco : Int, nome : String) {
        val total = quantidade * preco
        val intent = Intent(this, ConfirmacaoPedido::class.java)
        intent.putExtra("produto", nome)
        intent.putExtra("quantidade", quantidade)
        intent.putExtra("valorTotal", total)
        startActivity(intent)
    }

    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, mensagem, length).show()
    }
    private fun voltar(){
        val tela = Intent(this, BemVindo::class.java)
        startActivity(tela)
    }
}