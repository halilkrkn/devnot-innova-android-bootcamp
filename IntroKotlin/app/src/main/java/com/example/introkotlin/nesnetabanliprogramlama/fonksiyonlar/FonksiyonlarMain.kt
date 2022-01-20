package com.example.introkotlin.nesnetabanliprogramlama.fonksiyonlar

fun main(){
    val func = Fonksiyonlar()

    //Void - Unit döndüren fonk.
    func.selamla()
    func.selamTopla()

    // Return döndüren fonk.
    val gelenDeger = func.selamla1()
    println("Gelen Değer: $gelenDeger")
    val gelenDeger1 = func.selam1Topla()
    println("Gelen Değer: $gelenDeger1")


    // parametreli void-unit döndüren fonk.
    func.selamla2("Halil")


    //Parametreli - Return döndüren fonk.
    val gelenToplamDeger = func.toplama(30, 50)
    println("Gelen Toplam Değer: $gelenToplamDeger")

}

