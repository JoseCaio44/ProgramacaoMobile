package com.example.android.marsphotos

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android.marsphotos.network.TempoDados
import com.example.android.marsphotos.network.WeatherResponse
import com.example.android.marsphotos.network.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fazerChamadaApi()
    }

    val retrofita = Retrofit.Builder()
        .baseUrl("https://api.openweathermap.org/data/2.5/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val weatherService = retrofita.create(WeatherService::class.java)

    fun fazerChamadaApi() {
        val call = weatherService.getWeather("Anápolis, BR", "d3c75f279fcc780b7aba708b58ed1f3d")

        call.enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(
                call: Call<WeatherResponse>,
                response: Response<WeatherResponse>
            ) {
                if (response.isSuccessful) {
                    val temperature = response.body()?.main?.temp
                    if (temperature != null) {
                        toast("Essa e a temperatura de anapolis$temperature")
                    }
                } else {
                    val resposta = "Não foi possivel processar essa requisição"
                }
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                toast("Falha na requisição")
            }
        })

    }

    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, mensagem, length).show()
    }
}