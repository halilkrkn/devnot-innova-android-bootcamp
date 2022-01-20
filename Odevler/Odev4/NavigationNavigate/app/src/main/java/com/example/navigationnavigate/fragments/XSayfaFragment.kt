package com.example.navigationnavigate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationnavigate.databinding.FragmentXSayfaBinding



class XSayfaFragment : Fragment() {
    lateinit var binding: FragmentXSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXSayfaBinding.inflate(inflater, container, false)

        binding.apply {
            buttonXSayfa.setOnClickListener { view ->
                val gecisYSayfa = XSayfaFragmentDirections.actionXSayfaFragmentToYSayfaFragment()
                Navigation.findNavController(view).navigate(gecisYSayfa)
            }

        }
        return binding.root
    }
}