package com.example.detaylirecyclerviewtasarimi

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class AnasayfaFragmentDirections private constructor() {
  private data class ActionAnasayfaFragmentToDetayFragment(
    public val filmler: Filmler
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_anasayfaFragment_to_detayFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionAnasayfaFragmentToDetayFragment(filmler: Filmler): NavDirections =
        ActionAnasayfaFragmentToDetayFragment(filmler)
  }
}
