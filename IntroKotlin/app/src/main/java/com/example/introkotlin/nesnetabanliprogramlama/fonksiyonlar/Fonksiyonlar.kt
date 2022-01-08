package com.example.introkotlin.nesnetabanliprogramlama.fonksiyonlar

class Fonksiyonlar {

    //void-unit fonk.
    fun selamla(){
        val sonuc = "Merhaba Ahmet"
        println("Sonuc: $sonuc")
    }
    fun selamTopla(){
        val topla = 20+5000
        println("topla: $topla")
    }

    //return fonk.
    fun selamla1():String{
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }
    fun selam1Topla(): Int{
        val topla = 20+50
        return topla
    }


    // Void türünde parametreli fonk.
    fun selamla2(isim: String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    // Parametreli Return değer döndürüren Fonk.
    fun toplama(a: Int, b: Int):Int{
        val sonuc = a+b
        return sonuc
    }
}