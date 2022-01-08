package com.example.introkotlin

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var str1 : String = "halil"
    // lateinit var primitive değişkenlerde kullanılmıyor onlar; Long,Int,Double vb. içerisinden sadece string primitive değildir. o yüzden lateinit var sadece stringte kullanılır.
    lateinit var str: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}