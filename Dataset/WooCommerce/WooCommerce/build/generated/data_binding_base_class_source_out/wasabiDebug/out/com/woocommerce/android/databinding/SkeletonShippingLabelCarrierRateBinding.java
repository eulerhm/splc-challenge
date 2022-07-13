// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SkeletonShippingLabelCarrierRateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View description;

  @NonNull
  public final View image;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final View name;

  @NonNull
  public final View price;

  @NonNull
  public final Space spacer;

  private SkeletonShippingLabelCarrierRateBinding(@NonNull ConstraintLayout rootView,
      @NonNull View description, @NonNull View image, @NonNull ConstraintLayout linearLayout,
      @NonNull View name, @NonNull View price, @NonNull Space spacer) {
    this.rootView = rootView;
    this.description = description;
    this.image = image;
    this.linearLayout = linearLayout;
    this.name = name;
    this.price = price;
    this.spacer = spacer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SkeletonShippingLabelCarrierRateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SkeletonShippingLabelCarrierRateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.skeleton_shipping_label_carrier_rate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SkeletonShippingLabelCarrierRateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.description;
      View description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.image;
      View image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      ConstraintLayout linearLayout = (ConstraintLayout) rootView;

      id = R.id.name;
      View name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.price;
      View price = ViewBindings.findChildViewById(rootView, id);
      if (price == null) {
        break missingId;
      }

      id = R.id.spacer;
      Space spacer = ViewBindings.findChildViewById(rootView, id);
      if (spacer == null) {
        break missingId;
      }

      return new SkeletonShippingLabelCarrierRateBinding((ConstraintLayout) rootView, description,
          image, linearLayout, name, price, spacer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}