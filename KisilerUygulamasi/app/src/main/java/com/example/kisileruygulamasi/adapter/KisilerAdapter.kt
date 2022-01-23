package com.example.kisileruygulamasi.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.entity.Kisiler
import com.example.kisileruygulamasi.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class KisilerAdapter(val mContext: Context, val kisiler: List<Kisiler>):RecyclerView.Adapter<KisilerAdapter.KisilerViewHolder>() {

    // item_kisiler_card daki nesneleri bağladık.
    inner class KisilerViewHolder(view: View): RecyclerView.ViewHolder(view){
        var item_card: CardView
        var textViewKisiBilgi: TextView
        var imageViewSil : ImageView
        
        init {
            item_card = view.findViewById(R.id.item_card)
            textViewKisiBilgi = view.findViewById(R.id.textViewKisiBilgi)
            imageViewSil = view.findViewById(R.id.imageViewSil)
        }
    }

    // Tasarımı RecyclerView e bind etme ve bu şekilde hazırlanan istenilen tasarım Recyclerview da görüntülenir ve o ttasarımsal halde UI veriler UI da gözükür.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KisilerViewHolder {
       val tasarim = LayoutInflater.from(mContext).inflate(R.layout.item_kisiler_card,parent, false)
        return KisilerViewHolder(tasarim)
    }

    // Recyclerviewda verilerin görüntelebilmemiz için veya farklı işlemler yaptırabilmek için kullanılır.
    override fun onBindViewHolder(holder: KisilerViewHolder, position: Int) {
       val kisiler = kisiler[position]
        holder.apply {
            textViewKisiBilgi.text = "${kisiler.kisi_ad} - ${kisiler.kisi_tel}"
            holder.item_card.setOnClickListener{
                val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisiler)
                Navigation.findNavController(it).navigate(gecis)
            }
            holder.imageViewSil.setOnClickListener{
                Snackbar.make(it,"${kisiler.kisi_ad} silinsin mi?", Snackbar.LENGTH_LONG)
                    .setAction("EVET"){
                        Snackbar.make(it,"${kisiler.kisi_ad} Silindi?", Snackbar.LENGTH_LONG).show()

//                        Log.e("Kişi Sil","${kisiler.kisi_id}")
                    }
                    .show()
            }
        }
    }

    // Kisiler Listesinin içerisindeki item kadar veriyi Recyclerviewda gösterir. Yani UI da gösteririr.
    override fun getItemCount(): Int {
        return kisiler.size
    }
}