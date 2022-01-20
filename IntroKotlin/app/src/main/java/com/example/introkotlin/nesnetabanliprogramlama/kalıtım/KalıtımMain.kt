package com.example.introkotlin.nesnetabanliprogramlama.kalıtım

fun main() {
    val topkapiSarayi = Saray(4,100)
    val bogazVilla = Villa(true,20)

    println("Topkapi Sarayi")
    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)
    println("Boğaz Villa")
    println(bogazVilla.garajVarMı)
    println(bogazVilla.pencereSayisi)
}