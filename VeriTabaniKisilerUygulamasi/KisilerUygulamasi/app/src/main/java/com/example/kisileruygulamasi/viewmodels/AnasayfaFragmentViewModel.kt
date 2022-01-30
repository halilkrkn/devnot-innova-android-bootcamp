package com.example.kisileruygulamasi.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.entity.Kisiler
import com.example.kisileruygulamasi.repository.KisilerDaoRepository

class AnasayfaFragmentViewModel(application: Application): AndroidViewModel(application) {

    var kisilerListesi = MutableLiveData<List<Kisiler>>()
    val repository = KisilerDaoRepository(application)


    init {
        kisileriYukle()
        kisilerListesi = repository.kisileriGetir()
    }

    fun ara(aramaKelimesi: String){
        repository.kisiAra(aramaKelimesi)
    }

    fun sil(kisi_id: Int){
       repository.kisiSil(kisi_id)
    }

    fun kisileriYukle(){
        repository.tumKisileriAl()
    }

}