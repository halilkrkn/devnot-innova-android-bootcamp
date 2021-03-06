// Generated by view binder compiler. Do not edit!
package com.example.kisileruygulamasi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kisileruygulamasi.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAnasayfaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final Toolbar toolbarAnasayfa;

  private FragmentAnasayfaBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton fab, @NonNull RecyclerView recyclerView,
      @NonNull Toolbar toolbarAnasayfa) {
    this.rootView = rootView;
    this.fab = fab;
    this.recyclerView = recyclerView;
    this.toolbarAnasayfa = toolbarAnasayfa;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAnasayfaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAnasayfaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_anasayfa, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAnasayfaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab;
      FloatingActionButton fab = ViewBindings.findChildViewById(rootView, id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.toolbarAnasayfa;
      Toolbar toolbarAnasayfa = ViewBindings.findChildViewById(rootView, id);
      if (toolbarAnasayfa == null) {
        break missingId;
      }

      return new FragmentAnasayfaBinding((ConstraintLayout) rootView, fab, recyclerView,
          toolbarAnasayfa);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
