package com.example.detaylirecyclerviewtasarimi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.PopupMenu
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(val mContext:Context, val filmlerListesi: List<Filmler>): RecyclerView.Adapter<FilmlerAdapter.FilmlerViewHolder>() {

    inner class FilmlerViewHolder(view: View):RecyclerView.ViewHolder(view){
        var cardViewFilm: CardView
        var imageViewFilm: ImageView
        var textViewFilmAdi: TextView
        var textViewFilmFiyat: TextView
        var buttonFilmKirala: Button
        var imageViewDahaFazla: ImageView


        init{
            cardViewFilm = view.findViewById(R.id.cardViewFilm)
            imageViewFilm = view.findViewById(R.id.imageViewFilm)
            textViewFilmAdi = view.findViewById(R.id.textViewFilmAdi)
            textViewFilmFiyat = view.findViewById(R.id.textViewFilmFiyat)
            buttonFilmKirala = view.findViewById(R.id.buttonFilmKirala)
            imageViewDahaFazla = view.findViewById(R.id.imageViewDahaFazla)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmlerViewHolder {
        val binding = LayoutInflater.from(mContext).inflate(R.layout.item_film_card, parent, false)
        return FilmlerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FilmlerViewHolder, position: Int) {
        val film = filmlerListesi.get(position)

        holder.apply {
            // İmageview da foto gösterdik.
           imageViewFilm.setImageResource(
               mContext.resources.getIdentifier(film.filmResimAdi,"drawable",mContext.packageName))

            textViewFilmAdi.text = film.filmAdi
            textViewFilmFiyat.text = "${film.filmFiyati} ₺"

            buttonFilmKirala.setOnClickListener {
                Snackbar.make(it,"${film.filmAdi} kiralandı", Snackbar.LENGTH_LONG).show()
            }

            cardViewFilm.setOnClickListener {
                val gecis = AnasayfaFragmentDirections.actionAnasayfaFragmentToDetayFragment(film)
                Navigation.findNavController(it).navigate(gecis)
            }


            // Popup Menu kullanımı
            imageViewDahaFazla.setOnClickListener {
                val popup =  PopupMenu(mContext,it)
                popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
                popup.show()

                popup.setOnMenuItemClickListener {
                    when (it.itemId){
                        R.id.action_haber_ver -> {
                            Snackbar.make(imageViewDahaFazla,"${film.filmAdi} Haber Verilmek İçin Eklendi", Snackbar.LENGTH_LONG).show()
                            true
                        }
                        R.id.action_favori -> {
                            Snackbar.make(imageViewDahaFazla,"${film.filmAdi} Favorilere Eklendi", Snackbar.LENGTH_LONG).show()
                            true
                        }
                        else -> false

                    }
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

}