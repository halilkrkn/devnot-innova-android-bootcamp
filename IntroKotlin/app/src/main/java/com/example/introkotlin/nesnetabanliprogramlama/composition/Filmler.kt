package com.example.introkotlin.nesnetabanliprogramlama.composition

data class Filmler(
    var film_id:Int,
    var film_adı: String,
    var film_yil:Int,
    //Buradaki iki tanesi composition olmuş oluyor. Yani foreign key işlevi görüyorlar.
    var kategori:Kategoriler,
    var yonetmen:Yonetmenler
)
