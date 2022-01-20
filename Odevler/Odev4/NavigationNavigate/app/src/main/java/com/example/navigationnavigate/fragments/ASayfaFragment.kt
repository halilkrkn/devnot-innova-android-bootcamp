package com.example.navigationnavigate.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationnavigate.databinding.FragmentASayfaBinding


class ASayfaFragment : Fragment() {
    lateinit var binding: FragmentASayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentASayfaBinding.inflate(inflater, container, false)

        binding.apply {
            buttonASayfa.setOnClickListener { view ->
                val gecisBSayfa = ASayfaFragmentDirections.actionASayfaFragmentToBSayfaFragment()
                Navigation.findNavController(view).navigate(gecisBSayfa)

            }


        }

        return binding.root

    }
}