package com.example.navigationkullanimi

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationkullanimi.databinding.FragmentOyunEkraniBinding

class OyunEkraniFragment: Fragment() {
    lateinit var binding: FragmentOyunEkraniBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOyunEkraniBinding.inflate(inflater, container, false)

        // Navigatiom İşlemleri işlemler ile sayfalar arası veri gönderme
        // Burada anasayfadan OyunEkraniFargmente veriler aktarıldı.
        // navArgs ile bu işlem oyun ekranına argument olarak verilen değişkenler ve sınıflar dan verileri aldık.
        val bundle: OyunEkraniFragmentArgs by navArgs()

        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekar = bundle.bekar

        Log.e("Gelen Ad", gelenAd)
        Log.e("Gelen Yaş", gelenYas.toString())
        Log.e("Gelen Boy", gelenBoy.toString())
        Log.e("Gelen Bekar", gelenBekar.toString())



        val gelenNesneKisiler = bundle.kisiler
        Log.e("Gelen Ad", gelenNesneKisiler.ad)
        Log.e("Gelen Yaş", gelenNesneKisiler.yas.toString())
        Log.e("Gelen Boy", gelenNesneKisiler.boy.toString())
        Log.e("Gelen Bekar", gelenNesneKisiler.bekar.toString())

        binding.apply{
            buttonBitir.setOnClickListener{
                Navigation.findNavController(it).navigate(R.id.sonucEkraninaGecis)

            }
        }
        return binding.root
    }
}