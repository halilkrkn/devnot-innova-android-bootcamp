package com.example.androidcalismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidcalismayapisi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding
    val TAG = "YasamDongusu"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            buttonBasla.setOnClickListener{
                // Activityler arası geçişler Intent fonksiyonları ile olur.

                val intent = Intent(this@MainActivity,OyunEkraniActivity::class.java)

                // Intent ile Veri Aktarımı
                intent.putExtra("ad", "Ahmet")
                intent.putExtra("yas", 23)
                intent.putExtra("boy", 1.74)
                intent.putExtra("bekar", true)


                //Intent İle Nesne Transferi
                val kisi = Kisiler("Mehmet",34,1.97,false)
                intent.putExtra("nesne", kisi)
                startActivity(intent)

            }
        }
        Log.e(TAG,"onCreate Çalıştı")

//        buttonBasla.setOnClickListener{
//            Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
//        }
    }

    // Lifecycle - Yaşam Döngüleri
    // onCreate de içerisine dahil.
    override fun onStart() {
        super.onStart()
        Log.e(TAG,"onStart Çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume Çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause Çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"onStop Çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroy Çalıştı")

    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"onRestart Çalıştı")
    }
}