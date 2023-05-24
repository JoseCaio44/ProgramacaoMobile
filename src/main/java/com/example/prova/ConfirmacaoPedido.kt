package com.example.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ConfirmacaoPedido : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter
    private val listaItens = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacao_pedido)

        val nome = intent.getStringExtra("produto")
        val quantidade = intent.getIntExtra("quantidade", 0)
        val valortotal = intent.getIntExtra("valorTotal", 0)

        val venda = "$nome Quant: $quantidade"

        adapter = ItemAdapter(listaItens)
        recyclerView.adapter = adapter

        listaItens.add(venda)

    }
}