// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCWarningBanner;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentShippingLabelRefundBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final WCWarningBanner expirationWarningBanner;

  @NonNull
  public final MaterialTextView shippingLabelRefundAmount;

  @NonNull
  public final MaterialTextView shippingLabelRefundAmountTitle;

  @NonNull
  public final MaterialButton shippingLabelRefundBtnRefund;

  @NonNull
  public final MaterialTextView shippingLabelRefundInfo;

  @NonNull
  public final MaterialTextView shippingLabelRefundPurchaseDate;

  @NonNull
  public final MaterialTextView shippingLabelRefundPurchaseDateTitle;

  private FragmentShippingLabelRefundBinding(@NonNull ConstraintLayout rootView,
      @NonNull WCWarningBanner expirationWarningBanner,
      @NonNull MaterialTextView shippingLabelRefundAmount,
      @NonNull MaterialTextView shippingLabelRefundAmountTitle,
      @NonNull MaterialButton shippingLabelRefundBtnRefund,
      @NonNull MaterialTextView shippingLabelRefundInfo,
      @NonNull MaterialTextView shippingLabelRefundPurchaseDate,
      @NonNull MaterialTextView shippingLabelRefundPurchaseDateTitle) {
    this.rootView = rootView;
    this.expirationWarningBanner = expirationWarningBanner;
    this.shippingLabelRefundAmount = shippingLabelRefundAmount;
    this.shippingLabelRefundAmountTitle = shippingLabelRefundAmountTitle;
    this.shippingLabelRefundBtnRefund = shippingLabelRefundBtnRefund;
    this.shippingLabelRefundInfo = shippingLabelRefundInfo;
    this.shippingLabelRefundPurchaseDate = shippingLabelRefundPurchaseDate;
    this.shippingLabelRefundPurchaseDateTitle = shippingLabelRefundPurchaseDateTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentShippingLabelRefundBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentShippingLabelRefundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_shipping_label_refund, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentShippingLabelRefundBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.expiration_warning_banner;
      WCWarningBanner expirationWarningBanner = ViewBindings.findChildViewById(rootView, id);
      if (expirationWarningBanner == null) {
        break missingId;
      }

      id = R.id.shippingLabelRefund_amount;
      MaterialTextView shippingLabelRefundAmount = ViewBindings.findChildViewById(rootView, id);
      if (shippingLabelRefundAmount == null) {
        break missingId;
      }

      id = R.id.shippingLabelRefund_amount_title;
      MaterialTextView shippingLabelRefundAmountTitle = ViewBindings.findChildViewById(rootView, id);
      if (shippingLabelRefundAmountTitle == null) {
        break missingId;
      }

      id = R.id.shippingLabelRefund_btnRefund;
      MaterialButton shippingLabelRefundBtnRefund = ViewBindings.findChildViewById(rootView, id);
      if (shippingLabelRefundBtnRefund == null) {
        break missingId;
      }

      id = R.id.shippingLabelRefund_info;
      MaterialTextView shippingLabelRefundInfo = ViewBindings.findChildViewById(rootView, id);
      if (shippingLabelRefundInfo == null) {
        break missingId;
      }

      id = R.id.shippingLabelRefund_purchaseDate;
      MaterialTextView shippingLabelRefundPurchaseDate = ViewBindings.findChildViewById(rootView, id);
      if (shippingLabelRefundPurchaseDate == null) {
        break missingId;
      }

      id = R.id.shippingLabelRefund_purchaseDate_title;
      MaterialTextView shippingLabelRefundPurchaseDateTitle = ViewBindings.findChildViewById(rootView, id);
      if (shippingLabelRefundPurchaseDateTitle == null) {
        break missingId;
      }

      return new FragmentShippingLabelRefundBinding((ConstraintLayout) rootView,
          expirationWarningBanner, shippingLabelRefundAmount, shippingLabelRefundAmountTitle,
          shippingLabelRefundBtnRefund, shippingLabelRefundInfo, shippingLabelRefundPurchaseDate,
          shippingLabelRefundPurchaseDateTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}