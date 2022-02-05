package com.example.picassokullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picassokullanimi.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        resimGoster("kofte.png")

        binding.buttonResim1.setOnClickListener {
            resimGoster("ayran.png")
        }

        binding.buttonResim2.setOnClickListener {
            resimGoster("kadayif.png")
        }
    }

    fun resimGoster(resimAdi:String){

        val url = "http://kasimadalan.pe.hu/yemekler/resimler/$resimAdi"
        Picasso.get()
            .load(url)
            .into(binding.imageView)

    }
}