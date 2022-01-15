package com.example.androidcalismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidcalismayapisi.databinding.ActivityOyunEkraniBinding
import com.example.androidcalismayapisi.databinding.ActivitySonucEkraniBinding
import com.google.android.material.snackbar.Snackbar

class SonucEkraniActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySonucEkraniBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonucEkraniBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    // İçinde ollunduğu sayfadan geriye gitmeyi tamamen engeller ve o sayfada kalır.
    override fun onBackPressed() {
        Snackbar.make(binding.textViewSonuc, "Geri Dönmek İstiyor Musunuz?",Snackbar.LENGTH_LONG)
            .setAction("Evet"){
                super.onBackPressed()
            }.show()
       // super.onBackPressed()
    }

}