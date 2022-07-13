// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProductPropertySwitchLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final ImageView switchIcon;

  @NonNull
  public final MaterialTextView switchTitle;

  @NonNull
  public final SwitchMaterial switchView;

  private ProductPropertySwitchLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull View divider, @NonNull ImageView switchIcon, @NonNull MaterialTextView switchTitle,
      @NonNull SwitchMaterial switchView) {
    this.rootView = rootView;
    this.divider = divider;
    this.switchIcon = switchIcon;
    this.switchTitle = switchTitle;
    this.switchView = switchView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProductPropertySwitchLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProductPropertySwitchLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.product_property_switch_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProductPropertySwitchLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.switchIcon;
      ImageView switchIcon = ViewBindings.findChildViewById(rootView, id);
      if (switchIcon == null) {
        break missingId;
      }

      id = R.id.switchTitle;
      MaterialTextView switchTitle = ViewBindings.findChildViewById(rootView, id);
      if (switchTitle == null) {
        break missingId;
      }

      id = R.id.switchView;
      SwitchMaterial switchView = ViewBindings.findChildViewById(rootView, id);
      if (switchView == null) {
        break missingId;
      }

      return new ProductPropertySwitchLayoutBinding((ConstraintLayout) rootView, divider,
          switchIcon, switchTitle, switchView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}