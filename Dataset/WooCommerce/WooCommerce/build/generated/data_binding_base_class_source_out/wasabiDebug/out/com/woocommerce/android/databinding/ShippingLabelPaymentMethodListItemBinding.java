// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ShippingLabelPaymentMethodListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView cardTypeNumber;

  @NonNull
  public final MaterialTextView cardholderName;

  @NonNull
  public final MaterialTextView expirationDate;

  @NonNull
  public final RadioButton radioButton;

  private ShippingLabelPaymentMethodListItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialTextView cardTypeNumber, @NonNull MaterialTextView cardholderName,
      @NonNull MaterialTextView expirationDate, @NonNull RadioButton radioButton) {
    this.rootView = rootView;
    this.cardTypeNumber = cardTypeNumber;
    this.cardholderName = cardholderName;
    this.expirationDate = expirationDate;
    this.radioButton = radioButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ShippingLabelPaymentMethodListItemBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShippingLabelPaymentMethodListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.shipping_label_payment_method_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShippingLabelPaymentMethodListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_type_number;
      MaterialTextView cardTypeNumber = ViewBindings.findChildViewById(rootView, id);
      if (cardTypeNumber == null) {
        break missingId;
      }

      id = R.id.cardholder_name;
      MaterialTextView cardholderName = ViewBindings.findChildViewById(rootView, id);
      if (cardholderName == null) {
        break missingId;
      }

      id = R.id.expiration_date;
      MaterialTextView expirationDate = ViewBindings.findChildViewById(rootView, id);
      if (expirationDate == null) {
        break missingId;
      }

      id = R.id.radio_button;
      RadioButton radioButton = ViewBindings.findChildViewById(rootView, id);
      if (radioButton == null) {
        break missingId;
      }

      return new ShippingLabelPaymentMethodListItemBinding((ConstraintLayout) rootView,
          cardTypeNumber, cardholderName, expirationDate, radioButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}