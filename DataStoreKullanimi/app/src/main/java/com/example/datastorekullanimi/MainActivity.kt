package com.example.datastorekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.datastorekullanimi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Oluşturmuş olduğumuz datastore umuzu main activity ye tanımladık.
        val appPref = AppPref(this)

        // Main - Arayüz işlemlerinde, Sayfa arayüzü işlemlerinde kullanılıyor.
        // IO - Veri tabanı işlemleri ile igili yerlerde kullanılıyor.
        val job = CoroutineScope(Dispatchers.Main).launch {

            var gelenSayac = appPref.okuSayac()

            appPref.kayitSayac(++gelenSayac)
            binding.textViewSayac.text = gelenSayac.toString()


            appPref.kayitAd("Ahmet")
//            appPref.silAd()
            appPref.kayitYas(23)
            appPref.kayitBoy(1.70)
            appPref.kayitBekar(true)

            val liste = HashSet<String>()
            liste.add("Mehmet")
            liste.add("Zeynep")
            appPref.kayitArkadasListe(liste)


            val gelenAd = appPref.okuAd()
            val gelenYas = appPref.okuYas()
            val gelenBoy = appPref.okuBoy()
            val gelenBekar = appPref.okuBekar()

            Log.e("Gelen Ad", gelenAd)
            Log.e("Gelen Yas", gelenYas.toString())
            Log.e("Gelen Boy", gelenBoy.toString())
            Log.e("Gelen Bekar", gelenBekar.toString())

            val gelenListe = appPref.okuArkadasListe()
            if(gelenListe != null){
                for (i in gelenListe){
                    Log.e("Gelen Arkadas", i)
                }
            }
        }
    }
}