package com.example.linkedinuiclone.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.linkedinuiclone.R
import com.example.linkedinuiclone.databinding.ItemLinkedinMainBinding

class LinkedinMainAdapters(val linkedinMainList: List<String>): RecyclerView.Adapter<LinkedinMainAdapters.LinkedinMainViewHolder>(){

    inner class LinkedinMainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(itemModel : String) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinkedinMainViewHolder {
        return LinkedinMainViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_linkedin_main,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LinkedinMainViewHolder, position: Int) {
        holder.bindItems(linkedinMainList[position])

    }

    override fun getItemCount(): Int {
        return linkedinMainList.size
    }

}