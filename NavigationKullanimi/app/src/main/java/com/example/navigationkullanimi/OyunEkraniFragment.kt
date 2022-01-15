package com.example.navigationkullanimi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationkullanimi.databinding.FragmentOyunEkraniBinding

class OyunEkraniFragment: Fragment() {
    lateinit var binding: FragmentOyunEkraniBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOyunEkraniBinding.inflate(inflater, container, false)
        return binding.root

        binding.apply{
            buttonBitir.setOnClickListener{

            }
        }
    }
}