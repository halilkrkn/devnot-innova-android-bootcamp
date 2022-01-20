package com.example.introkotlin.nesnetabanliprogramlama.collectiontypes

fun main(){
    //ArrayList Oluşturma.
    val sayilar = ArrayList<Int>()

    val meyveler = ArrayList<String>()
    
    // ArrayList -  Veri Ekleme
    
    meyveler.add("Elma") // 0. index, ilk eklendiği için
    meyveler.add("Muz") // 1. index
    meyveler.add("Kiraz") // 2. index
    println(meyveler.toString()) //[Elma, Muz, Kiraz]

    meyveler[1] = "Armut"
    println(meyveler.toString()) // [Elma, Armut, Kiraz]

    meyveler.add(1,"Portakal")
    println(meyveler.toString()) // [Elma, Portakal, Armut, Kiraz]

    // ArrayList -  Veri Okuma
    println(meyveler.get(2))
    println(meyveler[2])

    // ArrayList Boyutu
    println("Boyut : ${meyveler.count()}")
    println("Boyut : ${meyveler.size}")

    // ArrayList in Boş Mu(isEmpty) Kontrol işlemleri
    println("Boş-Dolu Kontrol : ${meyveler.isEmpty()}")

// ArrayList in İçeriyor mu - Arraylist içerisinde değeri içerip içermediğine bakılıyor.
    println("İçeriyor mu : ${meyveler.contains("Kirazx")}")

    // ArrayList içeriisindeki değerleri Tersten Sıralamala
    meyveler.reverse()
    println(meyveler.toString())

    // ArrayList içerisindeki değerleri harflerin sayısına göre küçükten büyüğe sıralıyor. Yani kelimenin hafrleri azsa azdan çoğa sıralıyor.
    meyveler.sort()
    println(meyveler.toString())


    for (meyve in meyveler){
        println("Sonuc1: $meyve")
    }


    // Indexine göre sıralama Yapıldı.
    for ((indeks,meyve) in meyveler.withIndex()){
        println("$indeks: $meyve")
    }
    
    //Arraylisten Veri Silme
    meyveler.removeAt(2)
    println(meyveler)



    //Arraylisti temizleme
    meyveler.clear()
    println(meyveler)

}