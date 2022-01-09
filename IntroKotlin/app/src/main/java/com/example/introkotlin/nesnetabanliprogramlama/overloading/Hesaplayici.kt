package com.example.introkotlin.nesnetabanliprogramlama.overloading

class Hesaplayici {
    fun topla(sayi1:Int, sayi2: Int){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Double, sayi2: Int){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int, sayi2: Double){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Double, sayi2: Double){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int, sayi2: Int,isim: String){
        println("Toplam Yapan $isim, sonuç: ${sayi1+sayi2}")
    }
}