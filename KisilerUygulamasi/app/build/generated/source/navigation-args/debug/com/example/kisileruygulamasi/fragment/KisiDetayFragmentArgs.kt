package com.example.kisileruygulamasi.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.kisileruygulamasi.entity.Kisiler
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class KisiDetayFragmentArgs(
  public val kisi: Kisiler
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): KisiDetayFragmentArgs {
      bundle.setClassLoader(KisiDetayFragmentArgs::class.java.classLoader)
      val __kisi : Kisiler?
      if (bundle.containsKey("kisi")) {
        if (Parcelable::class.java.isAssignableFrom(Kisiler::class.java) ||
            Serializable::class.java.isAssignableFrom(Kisiler::class.java)) {
          __kisi = bundle.get("kisi") as Kisiler?
        } else {
          throw UnsupportedOperationException(Kisiler::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__kisi == null) {
          throw IllegalArgumentException("Argument \"kisi\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"kisi\" is missing and does not have an android:defaultValue")
      }
      return KisiDetayFragmentArgs(__kisi)
    }
  }
}
