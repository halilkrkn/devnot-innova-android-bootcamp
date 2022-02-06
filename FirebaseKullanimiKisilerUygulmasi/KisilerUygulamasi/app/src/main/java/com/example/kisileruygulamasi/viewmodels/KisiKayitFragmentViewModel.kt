package com.example.kisileruygulamasi.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.repository.KisilerDaoRepository

class KisiKayitFragmentViewModel: ViewModel() {
    val repository = KisilerDaoRepository()
    fun kayit(kisiAd: String, kisiTel: String) {
       repository.kisiKayit(kisiAd, kisiTel)
    }

}