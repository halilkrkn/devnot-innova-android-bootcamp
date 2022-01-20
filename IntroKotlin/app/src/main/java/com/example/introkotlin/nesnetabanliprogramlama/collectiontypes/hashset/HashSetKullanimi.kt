package com.example.introkotlin.nesnetabanliprogramlama.collectiontypes.hashset

fun main(){
    // HashSet özelliği Liste içerisinde verileri karıştırma özelliğine sahiptir.
    // O Verilerin hep yerlerini düzenini değiştirir.
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler.toString())

    //HashSette aynı veriden tekrar ekleme yapılmaz.
    meyveler.add("Elma")
    println(meyveler.toString())

    meyveler.add("Amasya Elması")
    println(meyveler.toString())

    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for (m in meyveler){
        println("Sonuç: $m")
    }

    for ((i,m) in meyveler.withIndex()){
        println("$i -> $m")
    }

    meyveler.remove("Elma")
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())
}