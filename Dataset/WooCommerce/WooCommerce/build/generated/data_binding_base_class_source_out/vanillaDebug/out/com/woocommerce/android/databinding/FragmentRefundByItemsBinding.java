// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRefundByItemsBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final MaterialButton issueRefundBtnNextFromItems;

  @NonNull
  public final MaterialCardView issueRefundFeesContainer;

  @NonNull
  public final SwitchMaterial issueRefundFeesMainSwitch;

  @NonNull
  public final RefundByItemsFeesBinding issueRefundFeesSection;

  @NonNull
  public final RefundByItemsProductsBinding issueRefundProductsList;

  @NonNull
  public final MaterialButton issueRefundSelectButton;

  @NonNull
  public final MaterialTextView issueRefundSelectedItems;

  @NonNull
  public final MaterialCardView issueRefundShippingContainer;

  @NonNull
  public final SwitchMaterial issueRefundShippingMainSwitch;

  @NonNull
  public final RefundByItemsShippingBinding issueRefundShippingSection;

  @NonNull
  public final NestedScrollView scrollView;

  private FragmentRefundByItemsBinding(@NonNull NestedScrollView rootView,
      @NonNull MaterialButton issueRefundBtnNextFromItems,
      @NonNull MaterialCardView issueRefundFeesContainer,
      @NonNull SwitchMaterial issueRefundFeesMainSwitch,
      @NonNull RefundByItemsFeesBinding issueRefundFeesSection,
      @NonNull RefundByItemsProductsBinding issueRefundProductsList,
      @NonNull MaterialButton issueRefundSelectButton,
      @NonNull MaterialTextView issueRefundSelectedItems,
      @NonNull MaterialCardView issueRefundShippingContainer,
      @NonNull SwitchMaterial issueRefundShippingMainSwitch,
      @NonNull RefundByItemsShippingBinding issueRefundShippingSection,
      @NonNull NestedScrollView scrollView) {
    this.rootView = rootView;
    this.issueRefundBtnNextFromItems = issueRefundBtnNextFromItems;
    this.issueRefundFeesContainer = issueRefundFeesContainer;
    this.issueRefundFeesMainSwitch = issueRefundFeesMainSwitch;
    this.issueRefundFeesSection = issueRefundFeesSection;
    this.issueRefundProductsList = issueRefundProductsList;
    this.issueRefundSelectButton = issueRefundSelectButton;
    this.issueRefundSelectedItems = issueRefundSelectedItems;
    this.issueRefundShippingContainer = issueRefundShippingContainer;
    this.issueRefundShippingMainSwitch = issueRefundShippingMainSwitch;
    this.issueRefundShippingSection = issueRefundShippingSection;
    this.scrollView = scrollView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRefundByItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRefundByItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_refund_by_items, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRefundByItemsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.issueRefund_btnNextFromItems;
      MaterialButton issueRefundBtnNextFromItems = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundBtnNextFromItems == null) {
        break missingId;
      }

      id = R.id.issueRefund_feesContainer;
      MaterialCardView issueRefundFeesContainer = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundFeesContainer == null) {
        break missingId;
      }

      id = R.id.issueRefund_feesMainSwitch;
      SwitchMaterial issueRefundFeesMainSwitch = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundFeesMainSwitch == null) {
        break missingId;
      }

      id = R.id.issueRefund_feesSection;
      View issueRefundFeesSection = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundFeesSection == null) {
        break missingId;
      }
      RefundByItemsFeesBinding binding_issueRefundFeesSection = RefundByItemsFeesBinding.bind(issueRefundFeesSection);

      id = R.id.issueRefund_productsList;
      View issueRefundProductsList = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundProductsList == null) {
        break missingId;
      }
      RefundByItemsProductsBinding binding_issueRefundProductsList = RefundByItemsProductsBinding.bind(issueRefundProductsList);

      id = R.id.issueRefund_selectButton;
      MaterialButton issueRefundSelectButton = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundSelectButton == null) {
        break missingId;
      }

      id = R.id.issueRefund_selectedItems;
      MaterialTextView issueRefundSelectedItems = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundSelectedItems == null) {
        break missingId;
      }

      id = R.id.issueRefund_shippingContainer;
      MaterialCardView issueRefundShippingContainer = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundShippingContainer == null) {
        break missingId;
      }

      id = R.id.issueRefund_shippingMainSwitch;
      SwitchMaterial issueRefundShippingMainSwitch = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundShippingMainSwitch == null) {
        break missingId;
      }

      id = R.id.issueRefund_shippingSection;
      View issueRefundShippingSection = ViewBindings.findChildViewById(rootView, id);
      if (issueRefundShippingSection == null) {
        break missingId;
      }
      RefundByItemsShippingBinding binding_issueRefundShippingSection = RefundByItemsShippingBinding.bind(issueRefundShippingSection);

      NestedScrollView scrollView = (NestedScrollView) rootView;

      return new FragmentRefundByItemsBinding((NestedScrollView) rootView,
          issueRefundBtnNextFromItems, issueRefundFeesContainer, issueRefundFeesMainSwitch,
          binding_issueRefundFeesSection, binding_issueRefundProductsList, issueRefundSelectButton,
          issueRefundSelectedItems, issueRefundShippingContainer, issueRefundShippingMainSwitch,
          binding_issueRefundShippingSection, scrollView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}