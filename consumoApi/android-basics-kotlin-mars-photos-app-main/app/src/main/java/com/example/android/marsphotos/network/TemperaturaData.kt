package com.example.android.marsphotos.network

data class WeatherResponse(
    val main: Main
)
data class Main(
    val temp: Double
)