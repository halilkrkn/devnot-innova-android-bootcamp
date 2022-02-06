package com.example.kisileruygulamasi.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.kisileruygulamasi.entity.Kisiler
import com.google.firebase.database.*

class KisilerDaoRepository {

    var kisilerListesi: MutableLiveData<List<Kisiler>>
    var refKisiler:DatabaseReference
    init {
        val db = FirebaseDatabase.getInstance()
        refKisiler = db.reference
        kisilerListesi = MutableLiveData()
    }

    fun kisileriGetir(): MutableLiveData<List<Kisiler>>{
        return kisilerListesi
    }

    fun kisiKayit(kisiAd: String, kisiTel: String) {
        val yeniKisi = Kisiler("",kisiAd,kisiTel)
        refKisiler.push().setValue(yeniKisi)
    }

    fun kisiGuncelle(kisi_id: String, kisi_ad: String, kisi_tel:String){
        val bilgiler = HashMap<String,Any>()
        bilgiler["kisi_ad"] = kisi_ad
        bilgiler["kisi_tel"] = kisi_tel

        refKisiler.child(kisi_id).updateChildren(bilgiler)


    }

    fun kisiAra(aramaKelimesi: String){
        refKisiler.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val liste = ArrayList<Kisiler>()
                for(data in snapshot.children){
                    val kisi = data.getValue(Kisiler::class.java)

                    if(kisi != null){
                        if(kisi.kisi_ad!!.lowercase().contains(aramaKelimesi.lowercase())){
                            kisi.kisi_id = data.key
                            liste.add(kisi)
                        }
                    }
                }
                kisilerListesi.value = liste
            }

            override fun onCancelled(error: DatabaseError) {}

        })
    }

    fun kisiSil(kisi_id: String){
        refKisiler.child(kisi_id).removeValue()
    }

    fun tümKisileriAl(){
       refKisiler.addValueEventListener(object: ValueEventListener{
           override fun onDataChange(snapshot: DataSnapshot) {
               val liste = ArrayList<Kisiler>()
               for(data in snapshot.children){
                   val kisi = data.getValue(Kisiler::class.java)

                   if(kisi != null){
                       kisi.kisi_id = data.key
                       liste.add(kisi)
                   }
               }
               kisilerListesi.value = liste
           }

           override fun onCancelled(error: DatabaseError) {}

       })
    }
}