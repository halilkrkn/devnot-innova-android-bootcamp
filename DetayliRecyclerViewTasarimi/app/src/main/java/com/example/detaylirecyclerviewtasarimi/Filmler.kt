package com.example.detaylirecyclerviewtasarimi

import java.io.Serializable

data class Filmler(
    val filmId: Int,
    val filmAdi: String,
    val filmResimAdi: String,
    val filmYil: Int,
    val filmFiyati: Double,
    val filmYonetmen: String,
):Serializable
