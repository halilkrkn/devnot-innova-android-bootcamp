package com.example.kisileruygulamasi.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.entity.Kisiler
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class AnasayfaFragmentDirections private constructor() {
  private data class KisiDetayGecis(
    public val kisi: Kisiler
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.kisiDetayGecis

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Kisiler::class.java)) {
        result.putParcelable("kisi", this.kisi as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Kisiler::class.java)) {
        result.putSerializable("kisi", this.kisi as Serializable)
      } else {
        throw UnsupportedOperationException(Kisiler::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun kisiDetayGecis(kisi: Kisiler): NavDirections = KisiDetayGecis(kisi)

    public fun kisiKayitGecis(): NavDirections = ActionOnlyNavDirections(R.id.kisiKayitGecis)
  }
}
