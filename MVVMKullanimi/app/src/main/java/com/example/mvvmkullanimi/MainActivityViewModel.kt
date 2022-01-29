package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// View Model Kullanımı
// ViewModelin kullanımında ortak bir değer olan işlemler yapılır.
// LiveData - Tetikleme ve dinleme yapısıdır.
class MainActivityViewModel : ViewModel() {

    //     var sonuc = "0"
    // Livedata tanımlaması yapıldı.
    var sonuc = MutableLiveData<String>()
    var mRepo = MainActivityRepository()


    init {
        // sonuc değerine 0 değierini aktardık livedata içerisinden
//        sonuc = MutableLiveData<String>("0")
        sonuc = mRepo.matematikselSonucuGetir()
    }

    fun toplamaYap(alinanSayi1: String, alinanSayi2: String) {
       mRepo.topla(alinanSayi1, alinanSayi2)
    }

    fun carpmaYap(alinanSayi1: String, alinanSayi2: String) {
        mRepo.carp(alinanSayi1, alinanSayi2)
    }

}