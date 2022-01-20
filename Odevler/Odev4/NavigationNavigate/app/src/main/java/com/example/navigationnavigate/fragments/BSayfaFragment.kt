package com.example.navigationnavigate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationnavigate.databinding.FragmentBSayfaBinding

class BSayfaFragment : Fragment() {
    lateinit var binding: FragmentBSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBSayfaBinding.inflate(inflater, container, false)

        binding.apply {
            buttonBSayfa.setOnClickListener { view ->
                val gecisYSayfa = BSayfaFragmentDirections.actionBSayfaFragmentToYSayfaFragment()
                Navigation.findNavController(view).navigate(gecisYSayfa)
            }

        }

        return binding.root

    }
}