package com.example.introkotlin.nesnetabanliprogramlama.collectiontypes.hashmap

fun main(){
    // HashMap Oluşturuldu.
    val iller = HashMap<Int,String>()

    // Ekleme İşlemi
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller.put(80,"Osmaniye")
    iller[1] = "Adana"

    // Hashmap e ekllediğimiz değerleri gösterdik.
    println(iller.toString())
    println(iller.get(34))

    // Var olan değeri Değiştirdik.
    iller.put(16,"YENİ BURSA")
    println(iller.toString())

    // Boyutu
    println(iller.size)
    // Boş mu
    println(iller.isEmpty())

    // Sıramalama İşlemei
    for ((anahtar,deger) in iller){
        println("$anahtar -> $deger")
    }

    // listeden veri silme
    iller.remove(34)
    println(iller.toString())

    // Listeyi temizleme
    iller.clear()
    println(iller.toString())

}