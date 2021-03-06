// Generated by view binder compiler. Do not edit!
package com.example.kisileruygulamasi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kisileruygulamasi.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentKisiKayitBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonKaydet;

  @NonNull
  public final TextInputEditText editTextKisiAd;

  @NonNull
  public final TextInputEditText editTextKisiTel;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final Toolbar toolbarKisiKayit;

  private FragmentKisiKayitBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonKaydet,
      @NonNull TextInputEditText editTextKisiAd, @NonNull TextInputEditText editTextKisiTel,
      @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2,
      @NonNull Toolbar toolbarKisiKayit) {
    this.rootView = rootView;
    this.buttonKaydet = buttonKaydet;
    this.editTextKisiAd = editTextKisiAd;
    this.editTextKisiTel = editTextKisiTel;
    this.textInputLayout = textInputLayout;
    this.textInputLayout2 = textInputLayout2;
    this.toolbarKisiKayit = toolbarKisiKayit;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentKisiKayitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentKisiKayitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_kisi_kayit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentKisiKayitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonKaydet;
      Button buttonKaydet = ViewBindings.findChildViewById(rootView, id);
      if (buttonKaydet == null) {
        break missingId;
      }

      id = R.id.editTextKisiAd;
      TextInputEditText editTextKisiAd = ViewBindings.findChildViewById(rootView, id);
      if (editTextKisiAd == null) {
        break missingId;
      }

      id = R.id.editTextKisiTel;
      TextInputEditText editTextKisiTel = ViewBindings.findChildViewById(rootView, id);
      if (editTextKisiTel == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textInputLayout2;
      TextInputLayout textInputLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout2 == null) {
        break missingId;
      }

      id = R.id.toolbarKisiKayit;
      Toolbar toolbarKisiKayit = ViewBindings.findChildViewById(rootView, id);
      if (toolbarKisiKayit == null) {
        break missingId;
      }

      return new FragmentKisiKayitBinding((ConstraintLayout) rootView, buttonKaydet, editTextKisiAd,
          editTextKisiTel, textInputLayout, textInputLayout2, toolbarKisiKayit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
