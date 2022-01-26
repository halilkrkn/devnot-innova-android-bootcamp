package com.example.amazonuiclone.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.amazonuiclone.R
import com.example.amazonuiclone.databinding.FragmentKategorilerBinding
import com.example.amazonuiclone.model.AmazonKategoriler
import com.example.amazonuiclone.model.AmazonKategorilerBottom
import com.example.amazonuiclone.ui.adapters.AmazonKategorilerAdapter
import com.example.amazonuiclone.ui.adapters.AmazonKategorilerBottomAdapter

class KategorilerFragment : Fragment() {
    private lateinit var binding: FragmentKategorilerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKategorilerBinding.inflate(inflater, container, false)

        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)

        val amazonKategoriler = ArrayList<AmazonKategoriler>()
        amazonKategoriler(amazonKategoriler)
        val amazonKategorilerAdapter = AmazonKategorilerAdapter(requireContext(),amazonKategoriler)
        binding.recyclerView.adapter = amazonKategorilerAdapter



        binding.recyclerView2.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val amazonKategorilerBottom = ArrayList<AmazonKategorilerBottom>()
        amazonKategorilerBottom(amazonKategorilerBottom)
        val amazonKategorilerBottomAdapter = AmazonKategorilerBottomAdapter(requireContext(),amazonKategorilerBottom)
        binding.recyclerView2.adapter = amazonKategorilerBottomAdapter

        return binding.root
    }

    fun amazonKategoriler(amazonKategoriler:ArrayList<AmazonKategoriler>){
        val f1 = AmazonKategoriler("Bebek", "bebek")
        val f2 = AmazonKategoriler("Bilgisayar ve Bileşenler","bilgisayar_ve_bilesenleri")
        val f3 = AmazonKategoriler("Cep Telefonu ve Aksesuar","cep_telefonu_ve_aksesuar")
        val f4 = AmazonKategoriler("Elektronik","elektronik")
        val f5 = AmazonKategoriler("Ev ve Yaşam","ev_ve_yasam")
        val f7 = AmazonKategoriler("Evcil Hayvan ve Ürünleri","evcil_hayvan_urunleri")
        val f8 = AmazonKategoriler("Fotoğraf ve Kamera","fotograf_ve_kamera")
        val f9 = AmazonKategoriler("Kitap","kitap")
        val f10 = AmazonKategoriler("Kozmetik ve Kişisel Bakım","kozmetik_ve_kisisel_bakim")
        val f11 = AmazonKategoriler("Moda","moda")
        val f12 = AmazonKategoriler("Mutfak","mutfak")
        val f13 = AmazonKategoriler("Ofis ve Kırtasiye", "ofis_ve_kirtasiye")
        val f14 = AmazonKategoriler("Oyuncak","oyuncak")
        val f15 = AmazonKategoriler("Spor ve Outdoor","spor_ve_outdoor")
        val f16 = AmazonKategoriler("Tv ve Ev Sineması", "tv_ve_ev_sinemasi" )
        val f17 = AmazonKategoriler("Yapı Market","yapi_market")
        val f18 = AmazonKategoriler("Amazon Hesabım", "amazon_hesabim")


        amazonKategoriler.add(f1)
        amazonKategoriler.add(f2)
        amazonKategoriler.add(f3)
        amazonKategoriler.add(f4)
        amazonKategoriler.add(f5)
        amazonKategoriler.add(f7)
        amazonKategoriler.add(f8)
        amazonKategoriler.add(f9)
        amazonKategoriler.add(f10)
        amazonKategoriler.add(f11)
        amazonKategoriler.add(f12)
        amazonKategoriler.add(f13)
        amazonKategoriler.add(f14)
        amazonKategoriler.add(f15)
        amazonKategoriler.add(f16)
        amazonKategoriler.add(f17)
        amazonKategoriler.add(f18)
    }

    fun amazonKategorilerBottom(kategorilerBottom: ArrayList<AmazonKategorilerBottom>){
        val f1 = AmazonKategorilerBottom("Siparişler", )
        val f2 = AmazonKategorilerBottom("Tekrar Satın Al")
        val f3 = AmazonKategorilerBottom("Hesap")
        val f4 = AmazonKategorilerBottom("Listelerim")


        kategorilerBottom.add(f1)
        kategorilerBottom.add(f2)
        kategorilerBottom.add(f3)
        kategorilerBottom.add(f4)

    }

}