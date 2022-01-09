package com.example.introkotlin.nesnetabanliprogramlama.composition

fun main(){
    val kategori = Kategoriler(1,"Dram")
    val yonetmen = Yonetmenler(2,"Quentin Tarantino")

    val film = Filmler(1,"Django",2013,kategori,yonetmen)

    println("Film id: ${film.film_id}")
    println("Film adı: ${film.film_adı}")
    println("Film yılı: ${film.film_yil}")
    println("Film kategori: ${film.kategori.kategori_ad}")
    println("Film kategori id: ${film.kategori.kategori_id}")
    println("Film yonetmen: ${film.yonetmen.yonetmen_ad}")
    println("Film yonetmen id: ${film.yonetmen.yonetmen_id}")



}