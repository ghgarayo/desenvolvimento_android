// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetalhesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDelete;

  @NonNull
  public final TextView textBrand;

  @NonNull
  public final TextView textColor;

  @NonNull
  public final TextView textKm;

  @NonNull
  public final TextView textLicensePlate;

  @NonNull
  public final TextView textModel;

  @NonNull
  public final TextView textYear;

  private ActivityDetalhesBinding(@NonNull LinearLayout rootView, @NonNull Button btnDelete,
      @NonNull TextView textBrand, @NonNull TextView textColor, @NonNull TextView textKm,
      @NonNull TextView textLicensePlate, @NonNull TextView textModel, @NonNull TextView textYear) {
    this.rootView = rootView;
    this.btnDelete = btnDelete;
    this.textBrand = textBrand;
    this.textColor = textColor;
    this.textKm = textKm;
    this.textLicensePlate = textLicensePlate;
    this.textModel = textModel;
    this.textYear = textYear;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetalhesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetalhesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detalhes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetalhesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDelete;
      Button btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.textBrand;
      TextView textBrand = ViewBindings.findChildViewById(rootView, id);
      if (textBrand == null) {
        break missingId;
      }

      id = R.id.textColor;
      TextView textColor = ViewBindings.findChildViewById(rootView, id);
      if (textColor == null) {
        break missingId;
      }

      id = R.id.textKm;
      TextView textKm = ViewBindings.findChildViewById(rootView, id);
      if (textKm == null) {
        break missingId;
      }

      id = R.id.textLicensePlate;
      TextView textLicensePlate = ViewBindings.findChildViewById(rootView, id);
      if (textLicensePlate == null) {
        break missingId;
      }

      id = R.id.textModel;
      TextView textModel = ViewBindings.findChildViewById(rootView, id);
      if (textModel == null) {
        break missingId;
      }

      id = R.id.textYear;
      TextView textYear = ViewBindings.findChildViewById(rootView, id);
      if (textYear == null) {
        break missingId;
      }

      return new ActivityDetalhesBinding((LinearLayout) rootView, btnDelete, textBrand, textColor,
          textKm, textLicensePlate, textModel, textYear);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}