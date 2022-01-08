package com.example.nesnetabanliprogramlama.bolum1

import com.example.introkotlin.nesnetabanliprogramlama.sınıf_class_kullanımı.Araba

fun main() {


    val bmw = Araba("Kırmızı",0, false)
    println("********Bmw ye atanmış Araba Sınıf İçerisindeki verilerin Değerleri Değiştirildi.***********")

    // Okuma İşlemi
//    println("Renk : ${bmw.renk}")
//    println("Hız : ${bmw.hiz}")
//    println("CalısıyorMu: ${bmw.calısıyorMu}")

    bmw.bilgiAl() // Buradaki printlnlleri Araba Sınıfının içerisinde fonksiyon olarak koyduk.
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(100)
    bmw.bilgiAl()
    bmw.yavasla(50)
    bmw.bilgiAl()


    // Sınıfın verilerini Değiştirdik.
    bmw.hiz = 150
    bmw.renk ="Mor"
    bmw.calısıyorMu = true

    bmw.bilgiAl()



    val sahin = Araba("Mavi", 50, true)
    println("********Şahine atanmış Araba Sınıf İçerisindeki verilerin Değerleri Değiştirildi.***********")

    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(70)
    sahin.bilgiAl()
    sahin.yavasla(50)
    sahin.bilgiAl()

}