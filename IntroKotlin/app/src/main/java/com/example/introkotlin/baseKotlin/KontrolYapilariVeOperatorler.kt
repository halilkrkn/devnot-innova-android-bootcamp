package com.example.introkotlin.baseKotlin

fun main() {

    println("****** OPERATÖRLER *******")
    val a = 10
    val b = 10
    val x = 40
    val y = 5

    println(a == b) // true
    println(a != b) // false
    println(a > b) // false
    println(a >= b) // true
    println(a < b) // false
    println(a <= b) // true

    println("****** AND:VE İşlemi *******")
    // And = VE demektir. true ve true  = true aksi halde hep sonuç false olması gerekmektedir.
    println(a == b && x < y)
    println("****** OR:VEYA İşlemi *******")
    // And = VE demektir. false veya false = false aksi halde sonuc hep true olması gerekmektedir.
    println(a == b || x < y)

    println("****** KONTROL YAPILARI *******")
    val yas = 17
    val isim = "İbrahim"


    println("****** If (Koşul) Kullanımı *******")
    if(yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşitsiniz Değilsiniz.")
    }
    
    if (isim == "Halil"){
        println("Merhaba Halil")
    }else if (isim == "Mehmet"){
        println("Merhaba Mehmet")
    }else {
        println("Tanınmayan Kişi")
    }

    println("****** Çoklu If (Koşul) Kullanımı *******")
    
    val kullanıcıAdi = "admin"
    val password = 1234567
    
    if (kullanıcıAdi == "admin" && password == 123456){
        println("Hoş Geldiniz")
    }else{
        println("Hatalı Giriş")
    }

    println("****** WHEN Kullanımı *******")

    val gun = 3
    when (gun){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba") // Çarşamba
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")
    }

    println("******DÖNGÜLER*******")

    println("****** for in Kullanımı *******")

    for (i in 1..3){
        println("Döngü 1 : $i") // 1,2,3
    }

    // 10 ile 20 arasında 5 er artsın
    for (i in 10..20 step 5){
        println("Döngü 2 : $i") // 10,15,20
    }

    //20 ile 10 arasında 5 er azalsın
    for (i in 20 downTo 10 step 3) {
        println("Döngü 3 : $i")// 20,17,14,11
    }

    println("****** WHILE Kullanımı *******")

    var sayac = 1

    while(sayac<6){
        println("Döngü 4 : $sayac")
//        sayac +=1
//        sayac = sayac + 1
          sayac++
    }
    
    
    println("****** BREAK/CONTINUE Kullanımı *******")
 // Break yapısı döngüyü durdurma yapısıdır.
    for (i in 1..5){
        if(i == 3){
            break // durdurma
        }
        println("Döngü 5 : $i")
    }
    println("************************")
    // Continue yapısı döngüyü pas geçme yapısıdır.
    for (i in 1..5) {
        if (i == 3) {
            continue // pass geçme
        }
        println("Döngü 6 : $i")

    }

}