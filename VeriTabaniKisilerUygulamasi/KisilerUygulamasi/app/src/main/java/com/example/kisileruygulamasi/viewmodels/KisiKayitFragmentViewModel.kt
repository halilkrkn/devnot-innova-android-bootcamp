package com.example.kisileruygulamasi.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.repository.KisilerDaoRepository

class KisiKayitFragmentViewModel(application: Application): AndroidViewModel(application) {

    val repository = KisilerDaoRepository(application)

    fun kayit(kisiAd: String, kisiTel: String) {
       repository.kisiKayit(kisiAd, kisiTel)
    }

}