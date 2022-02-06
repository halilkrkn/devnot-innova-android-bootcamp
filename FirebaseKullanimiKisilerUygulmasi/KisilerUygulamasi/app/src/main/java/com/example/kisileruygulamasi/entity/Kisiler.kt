package com.example.kisileruygulamasi.entity

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

@IgnoreExtraProperties
data class Kisiler(
    var kisi_id: String ?= "",
    val kisi_ad: String ?= "",
    val kisi_tel: String ?= "",
):Serializable