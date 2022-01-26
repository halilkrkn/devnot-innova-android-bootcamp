package com.example.amazonuiclone.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonuiclone.R
import com.example.amazonuiclone.model.AmazonKategoriler
import com.example.amazonuiclone.model.AmazonKategorilerBottom

class AmazonKategorilerBottomAdapter(
    val mContext: Context,
    val kategoriListesi: List<AmazonKategorilerBottom>
) : RecyclerView.Adapter<AmazonKategorilerBottomAdapter.KategorilerBottomViewHolder>() {

    inner class KategorilerBottomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var buttonKategoriAdi: Button

        init {
            buttonKategoriAdi = view.findViewById(R.id.buttonKategoriAdi)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategorilerBottomViewHolder {
        val binding = LayoutInflater.from(mContext).inflate(R.layout.item_bottom_kategoriler, parent, false)
        return KategorilerBottomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KategorilerBottomViewHolder, position: Int) {
        val kategori = kategoriListesi.get(position)

        holder.apply {
            buttonKategoriAdi.text = kategori.kategoriAdi
        }
    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }
}