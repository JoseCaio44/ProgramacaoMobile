package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FazerPedido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fazer_pedido)

        val nome = findViewById<TextView>(R.id.nome_prod).text.toString()
        val quantidade = findViewById<TextView>(R.id.quantidade).text.toString().toInt()
        val preco = findViewById<TextView>(R.id.preco).text.toString().toInt()

        val btcadastrar = findViewById<Button>(R.id.bt_pedido)

        btcadastrar.setOnClickListener{
            fazerPedido(quantidade,preco, nome)
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
}