// Generated by view binder compiler. Do not edit!
package com.example.kisileruygulamasi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kisileruygulamasi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemKisilerCardBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageViewSil;

  @NonNull
  public final CardView itemCard;

  @NonNull
  public final TextView textViewKisiBilgi;

  private ItemKisilerCardBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageViewSil,
      @NonNull CardView itemCard, @NonNull TextView textViewKisiBilgi) {
    this.rootView = rootView;
    this.imageViewSil = imageViewSil;
    this.itemCard = itemCard;
    this.textViewKisiBilgi = textViewKisiBilgi;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemKisilerCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemKisilerCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_kisiler_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemKisilerCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewSil;
      ImageView imageViewSil = ViewBindings.findChildViewById(rootView, id);
      if (imageViewSil == null) {
        break missingId;
      }

      id = R.id.item_card;
      CardView itemCard = ViewBindings.findChildViewById(rootView, id);
      if (itemCard == null) {
        break missingId;
      }

      id = R.id.textViewKisiBilgi;
      TextView textViewKisiBilgi = ViewBindings.findChildViewById(rootView, id);
      if (textViewKisiBilgi == null) {
        break missingId;
      }

      return new ItemKisilerCardBinding((LinearLayout) rootView, imageViewSil, itemCard,
          textViewKisiBilgi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}