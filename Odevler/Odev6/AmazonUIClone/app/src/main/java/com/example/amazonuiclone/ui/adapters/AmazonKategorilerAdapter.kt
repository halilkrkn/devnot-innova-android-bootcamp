package com.example.amazonuiclone.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.amazonuiclone.R
import com.example.amazonuiclone.model.AmazonKategoriler

class AmazonKategorilerAdapter(
    val mContext: Context,
    val kategoriListesi: List<AmazonKategoriler>
) : RecyclerView.Adapter<AmazonKategorilerAdapter.KategorilerViewHolder>() {

    inner class KategorilerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var texViewKategoriBaslik: TextView
        var imageViewKategori: ImageView
        
        
        init {
            texViewKategoriBaslik = view.findViewById(R.id.textViewKategoriBaslik)
            imageViewKategori = view.findViewById(R.id.imageViewKategori)
            
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategorilerViewHolder {
        val binding = LayoutInflater.from(mContext).inflate(R.layout.item_kategoriler, parent, false)
        return KategorilerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KategorilerViewHolder, position: Int) {
        val kategori = kategoriListesi.get(position)

        holder.apply {

            imageViewKategori.setImageResource(mContext.resources.getIdentifier(kategori.kategoriImage,"drawable",mContext.packageName))
            texViewKategoriBaslik.text = kategori.kategoriAdi
        }
    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }
}