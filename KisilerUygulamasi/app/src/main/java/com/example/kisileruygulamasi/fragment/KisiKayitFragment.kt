package com.example.kisileruygulamasi.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kisileruygulamasi.databinding.FragmentKisiKayitBinding

class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKisiKayitBinding.inflate(inflater, container, false)

        binding.toolbarKisiKayit.title = "Kişi Kayıt"

        binding.apply {
            buttonKaydet.setOnClickListener{
                val kisiAd = editTextKisiAd.text.toString()
                val kisiTel = editTextKisiTel.text.toString()
                kayit(kisiAd, kisiTel)
            }
        }
        return binding.root
    }

    fun kayit(kisiAd: String, kisiTel:String){
        Log.e("Kişi Kayıt","$kisiAd - $kisiTel")
    }
}