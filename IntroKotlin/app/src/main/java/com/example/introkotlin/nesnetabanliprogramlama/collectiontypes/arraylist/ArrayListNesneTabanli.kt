package com.example.introkotlin.nesnetabanliprogramlama.collectiontypes

import com.example.introkotlin.nesnetabanliprogramlama.collectiontypes.arraylist.Ogrenciler

fun main(){
    val o1 = Ogrenciler(200,"Zeynep", "9C")
    val o2 = Ogrenciler(300,"Ahmet", "11Z")
    val o3 = Ogrenciler(100,"Mehmet", "12A")

    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (o in ogrencilerListesi){
        println("öğrencilerListesi:${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("Sayısal Sıralama : Küçükten -> Büyüğe")
    val siralama1 = ogrencilerListesi.sortedWith(compareBy({
        it.no //sortedWith(compareBy()) kullanarak içerisinde yazdığımız sorgu sayesinde no ya göre küçükten büyüğe sıraladık.
    }))

    for (o in siralama1){
        println("öğrencilerListesi:${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("Sayısal Sıralama : Büyükten -> Küçüğe")
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending({
        it.no //sortedWith(compareBy()) kullanarak içerisinde yazdığımız sorgu sayesinde no ya göre küçükten büyüğe sıraladık.
    }))

    for (o in siralama2){
        println("öğrencilerListesi:${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("Harfsel Sıralama : Küçükten -> Büyüğe")
    val siralama3 = ogrencilerListesi.sortedWith(compareBy({
        it.ad //sortedWith(compareBy()) kullanarak içerisinde yazdığımız sorgu sayesinde no ya göre küçükten büyüğe sıraladık.
    }))

    for (o in siralama3){
        println("öğrencilerListesi:${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }

    println("Harfsel Sıralama : Büyükten -> Küçüğe")
    val siralama4 = ogrencilerListesi.sortedWith(compareByDescending({
        it.ad //sortedWith(compareBy()) kullanarak içerisinde yazdığımız sorgu sayesinde no ya göre küçükten büyüğe sıraladık.
    }))

    for (o in siralama4){
        println("öğrencilerListesi:${o.no} - Ad: ${o.ad} - Sınıf: ${o.sinif}")
    }
}