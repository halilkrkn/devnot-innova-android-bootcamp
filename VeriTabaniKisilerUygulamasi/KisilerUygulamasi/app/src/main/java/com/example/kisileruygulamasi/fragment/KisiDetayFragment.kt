package com.example.kisileruygulamasi.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding
import com.example.kisileruygulamasi.viewmodels.KisiDetayFragmentViewModel
import com.example.kisileruygulamasi.viewmodels.KisiDetayViewModelFactory
import com.example.kisileruygulamasi.viewmodels.KisiKayitFragmentViewModel

class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding
    private lateinit var viewModel: KisiDetayFragmentViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kisi_detay,container, false)

        binding.kisiDetayFragment = this
        binding.kisiDetayToolbasBaslik = "Kişi Detay"


        // Databinding yaptık.
        // Verileri bu Detay sayfasından alıyoruz.
        // Fragmentte Argüment olarak ekleyip içerisine Kisiler Sınıfı tanımladık ve sayfalar arası veri transferi yapmış oduk ve güncel veriyi de gözlemledik.
        val bundle: KisiDetayFragmentArgs by navArgs() // by = delegate oluyor.
        val gelenKisi = bundle.kisi
        binding.kisiNesnesi = gelenKisi
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: KisiDetayFragmentViewModel by viewModels(){
            KisiDetayViewModelFactory(requireActivity().application)
        }
        viewModel = tempViewModel
    }


    fun btnGuncelle(kisi_id: Int, kisi_ad: String, kisi_tel:String){
      viewModel.kisiGuncelle(kisi_id, kisi_ad, kisi_tel)
    }


}