package com.example.android.marsphotos.network

import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class TempoDados {
    var temp = 0.0
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
                        temp = temperature
                    }
                } else {
                    val resposta = "Não foi possivel processar essa requisição"
                }
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                // Tratar falhas na requisição
            }
        })
    }
}


