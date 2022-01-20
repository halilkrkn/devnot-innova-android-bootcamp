package com.example.navigationnavigate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.navigationnavigate.R
import com.example.navigationnavigate.databinding.FragmentYSayfaBinding


class YSayfaFragment : Fragment() {

    lateinit var binding: FragmentYSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYSayfaBinding.inflate(inflater, container, false)

        // Fragment içerisinde geri tuşuna basılarak anasayfa Fragmente yada istenilen fragmette yönlendirme işlemi
        val gecisAnasayfa = YSayfaFragmentDirections.actionYSayfaFragmentToAnasayfaFragment()
        val callback = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {

                findNavController().navigate(gecisAnasayfa)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)

        return binding.root


    }
}