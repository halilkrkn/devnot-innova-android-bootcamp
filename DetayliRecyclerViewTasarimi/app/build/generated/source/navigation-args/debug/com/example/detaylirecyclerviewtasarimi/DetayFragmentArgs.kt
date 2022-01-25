package com.example.detaylirecyclerviewtasarimi

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetayFragmentArgs(
  public val filmler: Filmler
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Filmler::class.java)) {
      result.putParcelable("filmler", this.filmler as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Filmler::class.java)) {
      result.putSerializable("filmler", this.filmler as Serializable)
    } else {
      throw UnsupportedOperationException(Filmler::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetayFragmentArgs {
      bundle.setClassLoader(DetayFragmentArgs::class.java.classLoader)
      val __filmler : Filmler?
      if (bundle.containsKey("filmler")) {
        if (Parcelable::class.java.isAssignableFrom(Filmler::class.java) ||
            Serializable::class.java.isAssignableFrom(Filmler::class.java)) {
          __filmler = bundle.get("filmler") as Filmler?
        } else {
          throw UnsupportedOperationException(Filmler::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__filmler == null) {
          throw IllegalArgumentException("Argument \"filmler\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"filmler\" is missing and does not have an android:defaultValue")
      }
      return DetayFragmentArgs(__filmler)
    }
  }
}
