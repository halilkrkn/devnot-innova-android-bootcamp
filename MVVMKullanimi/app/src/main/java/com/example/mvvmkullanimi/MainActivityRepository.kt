package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData

class MainActivityRepository {

    //     var sonuc = "0"
    // Livedata tanımlaması yapıldı.
    var matematikselsonuc = MutableLiveData<String>()


    init {
        // sonuc değerine 0 değierini aktardık livedata içerisinden
        matematikselsonuc = MutableLiveData<String>("0")
    }

    fun matematikselSonucuGetir(): MutableLiveData<String> {
        return matematikselsonuc
    }

    fun topla(alinanSayi1: String, alinanSayi2: String) {
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val toplam = sayi1 + sayi2
        matematikselsonuc.value = toplam.toString()
    }

    fun carp(alinanSayi1: String, alinanSayi2: String) {

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val carpma = sayi1 * sayi2

        matematikselsonuc.value = carpma.toString()
    }
}