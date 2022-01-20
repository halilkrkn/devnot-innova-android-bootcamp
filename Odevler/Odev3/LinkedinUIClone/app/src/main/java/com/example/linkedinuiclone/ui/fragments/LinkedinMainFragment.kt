package com.example.linkedinuiclone.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.linkedinuiclone.R
import com.example.linkedinuiclone.databinding.FragmentLinkedinMainBinding
import com.example.linkedinuiclone.ui.adapter.LinkedinMainAdapters

class LinkedinMainFragment : Fragment() {
    private lateinit var binding: FragmentLinkedinMainBinding
    lateinit var linkedinMainAdapter: LinkedinMainAdapters
    private val itemsList = ArrayList<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLinkedinMainBinding.inflate(inflater, container, false)

        linkedinMainAdapter = LinkedinMainAdapters(itemsList)
        binding.apply {
            linkedinMainRecyclerView.setHasFixedSize(true)
            linkedinMainRecyclerView.adapter = linkedinMainAdapter
        }
        prepareItems()
        return binding.root
    }
    private fun prepareItems() {
        itemsList.add("Item 1")
        itemsList.add("Item 2")
//        linkedinMainAdapter.notifyDataSetChanged()
    }
}