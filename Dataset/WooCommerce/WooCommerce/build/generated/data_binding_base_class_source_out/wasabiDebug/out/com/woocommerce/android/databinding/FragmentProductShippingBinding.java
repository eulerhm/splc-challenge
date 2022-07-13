// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCMaterialOutlinedEditTextView;
import com.woocommerce.android.widgets.WCMaterialOutlinedSpinnerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductShippingBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final WCMaterialOutlinedEditTextView productHeight;

  @NonNull
  public final WCMaterialOutlinedEditTextView productLength;

  @NonNull
  public final WCMaterialOutlinedSpinnerView productShippingClassSpinner;

  @NonNull
  public final WCMaterialOutlinedEditTextView productWeight;

  @NonNull
  public final WCMaterialOutlinedEditTextView productWidth;

  private FragmentProductShippingBinding(@NonNull ScrollView rootView,
      @NonNull WCMaterialOutlinedEditTextView productHeight,
      @NonNull WCMaterialOutlinedEditTextView productLength,
      @NonNull WCMaterialOutlinedSpinnerView productShippingClassSpinner,
      @NonNull WCMaterialOutlinedEditTextView productWeight,
      @NonNull WCMaterialOutlinedEditTextView productWidth) {
    this.rootView = rootView;
    this.productHeight = productHeight;
    this.productLength = productLength;
    this.productShippingClassSpinner = productShippingClassSpinner;
    this.productWeight = productWeight;
    this.productWidth = productWidth;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductShippingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductShippingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_product_shipping, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductShippingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.product_height;
      WCMaterialOutlinedEditTextView productHeight = ViewBindings.findChildViewById(rootView, id);
      if (productHeight == null) {
        break missingId;
      }

      id = R.id.product_length;
      WCMaterialOutlinedEditTextView productLength = ViewBindings.findChildViewById(rootView, id);
      if (productLength == null) {
        break missingId;
      }

      id = R.id.product_shipping_class_spinner;
      WCMaterialOutlinedSpinnerView productShippingClassSpinner = ViewBindings.findChildViewById(rootView, id);
      if (productShippingClassSpinner == null) {
        break missingId;
      }

      id = R.id.product_weight;
      WCMaterialOutlinedEditTextView productWeight = ViewBindings.findChildViewById(rootView, id);
      if (productWeight == null) {
        break missingId;
      }

      id = R.id.product_width;
      WCMaterialOutlinedEditTextView productWidth = ViewBindings.findChildViewById(rootView, id);
      if (productWidth == null) {
        break missingId;
      }

      return new FragmentProductShippingBinding((ScrollView) rootView, productHeight, productLength,
          productShippingClassSpinner, productWeight, productWidth);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}