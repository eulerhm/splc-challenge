// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import com.woocommerce.android.ui.orders.creation.views.OrderCreationSectionView;
import com.woocommerce.android.ui.orders.details.views.OrderDetailOrderStatusView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOrderCreationFormBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final OrderCreationSectionView customerSection;

  @NonNull
  public final OrderCreationSectionView notesSection;

  @NonNull
  public final LinearLayoutCompat orderCreationRoot;

  @NonNull
  public final OrderDetailOrderStatusView orderStatusView;

  @NonNull
  public final OrderCreationPaymentSectionBinding paymentSection;

  @NonNull
  public final OrderCreationSectionView productsSection;

  private FragmentOrderCreationFormBinding(@NonNull NestedScrollView rootView,
      @NonNull OrderCreationSectionView customerSection,
      @NonNull OrderCreationSectionView notesSection, @NonNull LinearLayoutCompat orderCreationRoot,
      @NonNull OrderDetailOrderStatusView orderStatusView,
      @NonNull OrderCreationPaymentSectionBinding paymentSection,
      @NonNull OrderCreationSectionView productsSection) {
    this.rootView = rootView;
    this.customerSection = customerSection;
    this.notesSection = notesSection;
    this.orderCreationRoot = orderCreationRoot;
    this.orderStatusView = orderStatusView;
    this.paymentSection = paymentSection;
    this.productsSection = productsSection;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOrderCreationFormBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOrderCreationFormBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_order_creation_form, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOrderCreationFormBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.customer_section;
      OrderCreationSectionView customerSection = ViewBindings.findChildViewById(rootView, id);
      if (customerSection == null) {
        break missingId;
      }

      id = R.id.notes_section;
      OrderCreationSectionView notesSection = ViewBindings.findChildViewById(rootView, id);
      if (notesSection == null) {
        break missingId;
      }

      id = R.id.order_creation_root;
      LinearLayoutCompat orderCreationRoot = ViewBindings.findChildViewById(rootView, id);
      if (orderCreationRoot == null) {
        break missingId;
      }

      id = R.id.order_status_view;
      OrderDetailOrderStatusView orderStatusView = ViewBindings.findChildViewById(rootView, id);
      if (orderStatusView == null) {
        break missingId;
      }

      id = R.id.payment_section;
      View paymentSection = ViewBindings.findChildViewById(rootView, id);
      if (paymentSection == null) {
        break missingId;
      }
      OrderCreationPaymentSectionBinding binding_paymentSection = OrderCreationPaymentSectionBinding.bind(paymentSection);

      id = R.id.products_section;
      OrderCreationSectionView productsSection = ViewBindings.findChildViewById(rootView, id);
      if (productsSection == null) {
        break missingId;
      }

      return new FragmentOrderCreationFormBinding((NestedScrollView) rootView, customerSection,
          notesSection, orderCreationRoot, orderStatusView, binding_paymentSection,
          productsSection);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}