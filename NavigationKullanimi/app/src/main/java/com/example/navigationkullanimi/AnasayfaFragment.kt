package com.example.navigationkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationkullanimi.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment: Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)



        binding.buttonBasla.setOnClickListener{
//            Snackbar.make(it, "Merhaba", Snackbar.LENGTH_LONG).show()
            // Navigatiom İşlemleri işlemler ile sayfalar arası veri gönderme
            // Burada AnasayfaFragmentten OyunEkraniFargmente verileri göndermek için o AnasayfaFragmentDirections sayesinde OyunEkraniFragmente verileri gönderdik.
            // geciş değişkenini navigate fonk. içerisine koyarak OyunEkraniFargmente verileri gönderdik ve sayfayı yönlendirdik.
            val kisi = Kisiler("Mehmet", 34, 1.98f, false)
            val gecis = AnasayfaFragmentDirections.oyunEkraninaGecis("Ahmet",25,1.74f,true, kisi)
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }


}