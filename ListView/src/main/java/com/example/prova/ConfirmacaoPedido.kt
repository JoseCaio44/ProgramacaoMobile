
package com.example.prova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class ConfirmacaoPedido : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private val listaItens = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacao_pedido)

        val nome = intent.getStringExtra("produto")
        val quantidade = intent.getIntExtra("quantidade", 0)
        val valortotal = intent.getIntExtra("valorTotal", 0)

        val venda = "$nome Quant: $quantidade Total: $valortotal"

        listView = findViewById(R.id.listView)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaItens)
        listView.adapter = adapter
        listaItens.add(venda)

        val botao = findViewById<Button>(R.id.bt_conf)
        val voltar = findViewById<Button>(R.id.bt_voltar)
        val voltar2 = findViewById<ImageView>(R.id.volta)

        botao.setOnClickListener{
            listaItens.add(venda)
            toast("Uau voce acabou de adicionar um item")
            voltar()
        }
        voltar.setOnClickListener{
            toast("Adeus !")
            finish()
        }
        voltar2.setOnClickListener{
            voltar()
            toast("Que pena, seu pedido fo cancelado !")
            val remover = listaItens.size - 1
            listaItens.removeAt(remover)
        }

    }

    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, mensagem, length).show()
    }
    private fun voltar(){
        val tela = Intent(this, BemVindo::class.java)
        startActivity(tela)
    }
}