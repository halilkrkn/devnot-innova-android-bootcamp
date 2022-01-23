package com.example.kisileruygulamasi.fragment

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.adapter.KisilerAdapter
import com.example.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.example.kisileruygulamasi.entity.Kisiler

class AnasayfaFragment : Fragment(),SearchView.OnQueryTextListener{
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var kisilerAdapter: KisilerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title = "Kişiler"

        //toolbarımız üzerinde menüyü desteklemesi için tollbara yetkinlik kazandırdık.
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbarAnasayfa)

        binding.fab.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
//            val kisi = Kisiler(1,"ahmet","111111")
//            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi)
//            Navigation.findNavController(it).navigate(gecis)
        }

        val kisilerListesi = ArrayList<Kisiler>()
        val k1 = Kisiler(1,"Ahmet","111111111")
        val k2 = Kisiler(2,"Zeynep","22222222")
        val k3 = Kisiler(3,"Ada","33333333333")

        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)
        kisilerAdapter = KisilerAdapter(requireContext(),kisilerListesi )

        binding.recyclerView.apply {
            adapter = kisilerAdapter
            layoutManager = LinearLayoutManager(requireActivity())
//              layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
//            layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

            setHasFixedSize(true)
        }

        return binding.root
    }

    // Search Menu İşlemleri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
       ara(query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean { // Her Harf girdikçe ve Sildikçe çalışır.
        ara(newText)
        return true
    }

    fun ara(aramaKelimesi: String){
        Log.e("Kişi Ara", aramaKelimesi)
    }

}