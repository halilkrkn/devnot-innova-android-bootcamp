package com.example.kisileruygulamasi.db

import androidx.room.*
import com.example.kisileruygulamasi.entity.Kisiler

@Dao
interface KisilerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE )
    suspend fun kisiEkle(kisiler: Kisiler)

    @Update
    suspend fun kisiGuncelle(kisiler: Kisiler)

    @Delete
    suspend fun kisiSil(kisiler: Kisiler)

    @Query("SELECT * FROM kisiler")
    suspend fun tumKisiler():List<Kisiler>

    @Query("SELECT * FROM kisiler WHERE kisi_ad like '%'||:aramaListesi||'%'")
    suspend fun kisiArama(aramaListesi: String):List<Kisiler>

}