package com.example.kisileruygulamasi.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.entity.Kisiler
import com.example.kisileruygulamasi.repository.KisilerDaoRepository

class AnasayfaFragmentViewModel: ViewModel()
{
    var kisilerListesi = MutableLiveData<List<Kisiler>>()
    val repository = KisilerDaoRepository()


    init {
        kisileriYukle()
        kisilerListesi = repository.kisileriGetir()
    }

    fun ara(aramaKelimesi: String){
        repository.kisiAra(aramaKelimesi)
    }

    fun sil(kisi_id: String){
       repository.kisiSil(kisi_id)
    }

    fun kisileriYukle(){
        repository.tümKisileriAl()
    }

}