package com.example.introkotlin.nesnetabanliprogramlama.override

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    println("Hayvan")
    hayvan.sesCikar()
    println("Memeli")
    memeli.sesCikar()
    println("Kedi")
    kedi.sesCikar()
    println("Köpek")
    kopek.sesCikar()
}