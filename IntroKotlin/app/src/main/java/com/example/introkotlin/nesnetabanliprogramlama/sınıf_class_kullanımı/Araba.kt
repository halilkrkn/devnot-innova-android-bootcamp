package com.example.introkotlin.nesnetabanliprogramlama.sınıf_class_kullanımı

class Araba(var renk:String, var hiz:Int, var calısıyorMu:Boolean) {

    init {
        println("Araba Sınıfından Nesne Oluşturuldu.")
    }

    fun calistir(){
        calısıyorMu = true
        hiz = 10
    }

    fun durdur(){
        calısıyorMu = false
        hiz = 0
    }

    fun hizlan(kacKM: Int){
        hiz += kacKM // hiz = hiz + kacKM
    }

    fun yavasla(kacKM: Int){
        hiz -= kacKM // hiz = hiz - kacKM

    }


    fun bilgiAl(){
        println("******************")
        println("Renk : ${renk}")
        println("Hız : ${hiz}")
        println("CalısıyorMu: ${calısıyorMu}")
    }

    // this veya self bulunan sınıfı temsil eder.
    // super : Kalıtım varsa üst sınıfı temsil eder.

}