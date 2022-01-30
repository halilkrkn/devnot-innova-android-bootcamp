package com.example.kisileruygulamasi.repository

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.kisileruygulamasi.db.KisilerDatabase
import com.example.kisileruygulamasi.entity.Kisiler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisilerDaoRepository(var application: Application) {

    var kisilerListesi: MutableLiveData<List<Kisiler>>
    var vt: KisilerDatabase

    init {
        kisilerListesi = MutableLiveData()
        vt = KisilerDatabase.veriTabaniErisim(application)!!
    }

    fun kisileriGetir(): MutableLiveData<List<Kisiler>> {
        return kisilerListesi
    }

    fun kisiKayit(kisiAd: String, kisiTel: String) {

        val job = CoroutineScope(Dispatchers.Main).launch {
            val yeniKisi = Kisiler(0, kisiAd, kisiTel)
            vt.KisilerDao().kisiEkle(yeniKisi)
        }
    }

    fun kisiGuncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val guncellenenKisi = Kisiler(kisi_id, kisi_ad, kisi_tel)
            vt.KisilerDao().kisiGuncelle(guncellenenKisi)
        }
//        Log.e("Kişi Güncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }

    fun kisiAra(aramaKelimesi: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value = vt.KisilerDao().kisiArama(aramaKelimesi)
        }
    }

    fun kisiSil(kisi_id: Int) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val silinenKisi = Kisiler(kisi_id,"","")
            vt.KisilerDao().kisiSil(silinenKisi)
            tumKisileriAl()
        }
    }

    fun tumKisileriAl() {
//        database.KisilerDao().getAllKisiler()
        val job = CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value = vt.KisilerDao().tumKisiler()
        }
    }
}