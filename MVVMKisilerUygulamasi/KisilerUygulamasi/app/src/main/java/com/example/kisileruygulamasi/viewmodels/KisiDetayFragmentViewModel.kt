package com.example.kisileruygulamasi.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.repository.KisilerDaoRepository

class KisiDetayFragmentViewModel: ViewModel() {
    val repository = KisilerDaoRepository()

    fun kisiGuncelle(kisi_id: Int, kisi_ad: String, kisi_tel:String){
        repository.kisiGuncelle(kisi_id, kisi_ad, kisi_tel)
    }
}