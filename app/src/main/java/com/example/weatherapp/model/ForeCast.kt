package com.example.weatherapp.model

data class ForeCast(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<>,
    val message: Int
)