package com.example.kisileruygulamasi.fragment

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.adapter.KisilerAdapter
import com.example.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.example.kisileruygulamasi.entity.Kisiler
import com.example.kisileruygulamasi.viewmodels.AnasayfaFragmentViewModel

class AnasayfaFragment : Fragment(),SearchView.OnQueryTextListener{
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var kisilerAdapter: KisilerAdapter
    private lateinit var viewModel: AnasayfaFragmentViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        binding.kisilerAnasayfaFragment = this
        binding.anasayfaToolbarBaslik = "Kişiler"

        //toolbarımız üzerinde menüyü desteklemesi için tollbara yetkinlik kazandırdık.
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbarAnasayfa)

        viewModel.kisilerListesi.observe(viewLifecycleOwner){
            kisilerAdapter = KisilerAdapter(requireContext(),it,viewModel)
            binding.recyclerView.apply {
                binding.kisilerAdapter = kisilerAdapter
                setHasFixedSize(true)
            }
        }

        return binding.root
    }

    fun fabTikla(view: View){
        Navigation.findNavController(view).navigate(R.id.kisiKayitGecis)
    }


    // Search Menu İşlemleri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val temViewModel: AnasayfaFragmentViewModel by viewModels()
        viewModel = temViewModel
        setHasOptionsMenu(true)
    }
    // Search Menunün Anasayfa Fragmente Bİnd ettik ve UI da gösterdik.
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        // Menu'yü Uı da gösterdik
        inflater.inflate(R.menu.search_menu, menu)

        val searchItem = menu.findItem(R.id.action_search)
        val searchView = searchItem.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onQueryTextSubmit(query: String): Boolean { // Arama ikonu tıklanıldığında çalışır.
       viewModel.ara(query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean { // Her Harf girdikçe ve Sildikçe çalışır.
        viewModel.ara(newText)
        return true
    }



}