package com.example.navigationnavigate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationnavigate.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.apply {
            buttonAnasayfaA.setOnClickListener { view ->
                val gecisASayfa = AnasayfaFragmentDirections.actionAnasayfaFragmentToASayfaFragment()
                Navigation.findNavController(view).navigate(gecisASayfa)
            }

            buttonXSayfa.setOnClickListener { view ->
                val gecisXSayfa = AnasayfaFragmentDirections.actionAnasayfaFragmentToXSayfaFragment()
                Navigation.findNavController(view).navigate(gecisXSayfa)
            }
        }
        return binding.root
    }
}