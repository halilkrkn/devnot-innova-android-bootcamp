package com.example.detaylirecyclerviewtasarimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.detaylirecyclerviewtasarimi.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle: DetayFragmentArgs by navArgs()
        val film = bundle.filmler

        binding.toolbarDetay.title = film.filmAdi
        binding.imageViewFilmDetay.setImageResource(resources.getIdentifier(film.filmResimAdi,"drawable", requireContext().packageName))
        binding.textViewYonetmen.text = film.filmYonetmen
        binding.textViewFilmYil.text = film.filmYil.toString()
        binding.textViewFilmDetayFiyat.text = "${film.filmFiyati} ₺"


        binding.buttonSiparisVer.setOnClickListener {
            Snackbar.make(it,"${film.filmAdi} sipariş verildi.", Snackbar.LENGTH_LONG).show()
        }

        return binding.root
    }

}