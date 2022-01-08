package com.example.introkotlin.baseKotlin

fun main() {

    println("Hello World!!")

    println("*******************Değişkenler***************************")
    val ogrenciAd = "Halil İbrahim"
    val ogrenciSoyad = "Karkın"
    val ogrenciYas = 25
    val ogrenciBoy = 1.73
    val ogrenciBasHarf = 'A'
    val ogrenciDevamEdiyorMu = true


    println(ogrenciSoyad)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)
    println(ogrenciDevamEdiyorMu)

    println("*******************Veri Tipleri ve Değişkenler***************************")
    var urun_id: Int = 3416
    var urun_ad: String = "Kol Saati"
    var urun_adet: Int = 100
    var urun_fiyat: Double = 149.99
    var urun_tedarikci: String = "rolex"

    println("Ürün id: $urun_id")
    println("Ürün ad: $urun_ad")
    println("Ürün adet: $urun_adet")
    println("Ürün fiyat: $urun_fiyat tl")
    println("Ürün Tedarikçi: $urun_tedarikci")
    
    println("*********************Değişkenlerle İşlemler*************************")
    val a = 10
    val b = 20

    println("a x b = $a x $b = ${a*b}")
    
    println("********************Yorum Satırı ve VAR/VAL Değişkenleri**************************")
    // -> Yorum satırı bu şekilde
    // Sabitler
    var sayi = 30
    println(sayi) //30
    
    sayi = 500
    println(sayi) //500
    
    val numara = 90
    println(numara) //90
    
    println("********************TÜR DÖNÜŞÜMLERİ**************************")
    
    // Sayısaldan Sayısala Dönüşüm - En Tehlikeli Dönüşüm Dikkat Edilmesi Gerekir.
    println("****** Sayısaldan Sayısala Dönüşüm ******")
    val i = 42
    val d = 78.95
    val sonuc1 = i.toDouble()
    println(sonuc1) //42.0

    val sonuc2 = d.toInt()
    println(sonuc2) //78
    
    // Sayısaldan Metine(Stringe) Dönüşüm
    println("****** Sayısaldan Metine(Stringe) Dönüşüm *******")

    val sonuc3 = i.toString()
    println(sonuc3) //42
    val sonuc4 = d.toString()
    println(sonuc4) //78.95

    // Metine(Stringe) den Sayısala Dönüşüm
    println("****** Metine(Stringe) den Sayısala Dönüşüm *******")
    val yazi = "67.54"
    val sonuc5 = yazi.toDouble()
    println(sonuc5) //67.54

    // Buradaki ikinci nokta double yapısnı bozduğu için double değişkenine dönüştüremiyor o yüzden toDoubleOrNull sayesinde dönüşüm yapamadığı için null a çeviriyor.
    val yazi2 = "67.54."
    val sonuc6 = yazi2.toDoubleOrNull()
    println(sonuc6) //null




}