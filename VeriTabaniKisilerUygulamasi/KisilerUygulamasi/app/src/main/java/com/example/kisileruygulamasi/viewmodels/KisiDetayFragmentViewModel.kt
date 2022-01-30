package com.example.kisileruygulamasi.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.repository.KisilerDaoRepository

class KisiDetayFragmentViewModel(application: Application): AndroidViewModel(application) {
    val repository = KisilerDaoRepository(application)

    fun kisiGuncelle(kisi_id: Int, kisi_ad: String, kisi_tel:String){
        repository.kisiGuncelle(kisi_id, kisi_ad, kisi_tel)
    }
}