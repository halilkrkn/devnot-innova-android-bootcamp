package com.example.kisileruygulamasi.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName ="kisiler")
data class Kisiler(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "kisi_id")
    @NotNull
    val kisi_id: Int,
    @ColumnInfo(name = "kisi_ad")
    @NotNull
    val kisi_ad: String,
    @ColumnInfo(name = "kisi_tel")
    @NotNull
    val kisi_tel: String,
):Serializable