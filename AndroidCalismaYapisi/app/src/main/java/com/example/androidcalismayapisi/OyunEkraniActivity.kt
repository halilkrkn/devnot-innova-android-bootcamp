package com.example.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidcalismayapisi.databinding.ActivityMainBinding
import com.example.androidcalismayapisi.databinding.ActivityOyunEkraniBinding
import com.google.android.material.snackbar.Snackbar

class OyunEkraniActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOyunEkraniBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy",0.0);
        val gelenBekar = intent.getBooleanExtra("bekar", false)

        Log.e("Gelen Ad", gelenAd!!)
        Log.e("Gelen Yaş", gelenYas.toString())
        Log.e("Gelen Boy", gelenBoy.toString())
        Log.e("Gelen Bekar", gelenBekar.toString())

        val gelenNesne = intent.getSerializableExtra("nesne") as Kisiler

        Log.e("Gelen Nesne Ad", gelenNesne.ad)
        Log.e("Gelen Nesne Yaş", gelenNesne.yas.toString())
        Log.e("Gelen Nesne Boy", gelenNesne.boy.toString())
        Log.e("Gelen Nesne Bekar", gelenNesne.bekar.toString())

        binding.buttonBitir.setOnClickListener{
            // Activityler arası geçişler Intent fonksiyonları ile olur.
            val intent = Intent(this@OyunEkraniActivity,SonucEkraniActivity::class.java)
            startActivity(intent)
            finish() // Pop - Back Stack ten çıkarır ve geri tuşuna basıldığında bu sayfaya getirmez ondan önceki sayfaya yönlendirir.
        }
    }
}