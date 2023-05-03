package com.example.atividade5

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : DebugActivity() {

    private val TAG = "livro"
    private val context: Context
    get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        onClick(R.id.buttonFazLogin){onClickLogin()}
    }
    fun onClickLogin() {
        val login = getTextString(R.id.editTextLogin)
        val senha = getTextString(R.id.editTextSenha)
        if(login == "alexandre" && senha == "123") {
            val intent = Intent(context, BemVindoActivity::class.java)
            val params = Bundle()
            params.putString("nome", "Jose Caio")
            intent.putExtras(params)
            startActivity(intent)
        } else {
            Toast("Login ou Senha incorretos!!")
        }
    }
    private val className: String
        get() {
            val s = javaClass.name
            return s.substring(s.lastIndexOf("."))
        }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, className + ".onStart() chamado.")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, className + ".onRestart() chamado.")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, className + ".onResume() chamado.")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, className + ".onPause() chamado.")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, className + ".onSaveInstanceState() chamado.")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, className + ".onStop() chamado.")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, className +".onDestroy() chamado.")
    }
}
