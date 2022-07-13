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
import com.google.android.material.button.MaterialButton;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCMaterialOutlinedCurrencyEditTextView;
import com.woocommerce.android.widgets.WCMaterialOutlinedEditTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOrderCreationShippingBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final WCMaterialOutlinedCurrencyEditTextView amountEditText;

  @NonNull
  public final WCMaterialOutlinedEditTextView nameEditText;

  @NonNull
  public final MaterialButton removeShippingButton;

  private FragmentOrderCreationShippingBinding(@NonNull ScrollView rootView,
      @NonNull WCMaterialOutlinedCurrencyEditTextView amountEditText,
      @NonNull WCMaterialOutlinedEditTextView nameEditText,
      @NonNull MaterialButton removeShippingButton) {
    this.rootView = rootView;
    this.amountEditText = amountEditText;
    this.nameEditText = nameEditText;
    this.removeShippingButton = removeShippingButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOrderCreationShippingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOrderCreationShippingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_order_creation_shipping, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOrderCreationShippingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amountEditText;
      WCMaterialOutlinedCurrencyEditTextView amountEditText = ViewBindings.findChildViewById(rootView, id);
      if (amountEditText == null) {
        break missingId;
      }

      id = R.id.nameEditText;
      WCMaterialOutlinedEditTextView nameEditText = ViewBindings.findChildViewById(rootView, id);
      if (nameEditText == null) {
        break missingId;
      }

      id = R.id.removeShippingButton;
      MaterialButton removeShippingButton = ViewBindings.findChildViewById(rootView, id);
      if (removeShippingButton == null) {
        break missingId;
      }

      return new FragmentOrderCreationShippingBinding((ScrollView) rootView, amountEditText,
          nameEditText, removeShippingButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}