package com.example.kisileruygulamasi.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiKayitBinding
import com.example.kisileruygulamasi.viewmodels.KisiKayitFragmentViewModel
import com.example.kisileruygulamasi.viewmodels.KisiKayitViewModelFactory

class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding
    private lateinit var viewModel: KisiKayitFragmentViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kisi_kayit, container, false)
        binding.kisiKayitFragment = this

        binding.kisiKayitToolbarBaslik = "Kisi Kayit"
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: KisiKayitFragmentViewModel by viewModels(){
            KisiKayitViewModelFactory(requireActivity().application)
        }
        viewModel = tempViewModel
    }

    fun kayit(kisiAd: String, kisiTel:String){
        viewModel.kayit(kisiAd, kisiTel)
    }
}