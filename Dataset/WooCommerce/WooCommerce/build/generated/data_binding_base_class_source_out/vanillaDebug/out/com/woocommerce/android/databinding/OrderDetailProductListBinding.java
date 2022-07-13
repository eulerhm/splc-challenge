// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OrderDetailProductListBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final Barrier productListBarrier;

  @NonNull
  public final MaterialButton productListBtnCreateShippingLabel;

  @NonNull
  public final MaterialButton productListBtnMarkOrderComplete;

  @NonNull
  public final ImageButton productListBtnMenu;

  @NonNull
  public final MaterialTextView productListLblProduct;

  @NonNull
  public final RecyclerView productListProducts;

  @NonNull
  public final MaterialTextView productListShippingLabelsNotice;

  private OrderDetailProductListBinding(@NonNull View rootView, @NonNull Barrier productListBarrier,
      @NonNull MaterialButton productListBtnCreateShippingLabel,
      @NonNull MaterialButton productListBtnMarkOrderComplete,
      @NonNull ImageButton productListBtnMenu, @NonNull MaterialTextView productListLblProduct,
      @NonNull RecyclerView productListProducts,
      @NonNull MaterialTextView productListShippingLabelsNotice) {
    this.rootView = rootView;
    this.productListBarrier = productListBarrier;
    this.productListBtnCreateShippingLabel = productListBtnCreateShippingLabel;
    this.productListBtnMarkOrderComplete = productListBtnMarkOrderComplete;
    this.productListBtnMenu = productListBtnMenu;
    this.productListLblProduct = productListLblProduct;
    this.productListProducts = productListProducts;
    this.productListShippingLabelsNotice = productListShippingLabelsNotice;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderDetailProductListBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.order_detail_product_list, parent);
    return bind(parent);
  }

  @NonNull
  public static OrderDetailProductListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.productList_barrier;
      Barrier productListBarrier = ViewBindings.findChildViewById(rootView, id);
      if (productListBarrier == null) {
        break missingId;
      }

      id = R.id.productList_btnCreateShippingLabel;
      MaterialButton productListBtnCreateShippingLabel = ViewBindings.findChildViewById(rootView, id);
      if (productListBtnCreateShippingLabel == null) {
        break missingId;
      }

      id = R.id.productList_btnMarkOrderComplete;
      MaterialButton productListBtnMarkOrderComplete = ViewBindings.findChildViewById(rootView, id);
      if (productListBtnMarkOrderComplete == null) {
        break missingId;
      }

      id = R.id.productList_btnMenu;
      ImageButton productListBtnMenu = ViewBindings.findChildViewById(rootView, id);
      if (productListBtnMenu == null) {
        break missingId;
      }

      id = R.id.productList_lblProduct;
      MaterialTextView productListLblProduct = ViewBindings.findChildViewById(rootView, id);
      if (productListLblProduct == null) {
        break missingId;
      }

      id = R.id.productList_products;
      RecyclerView productListProducts = ViewBindings.findChildViewById(rootView, id);
      if (productListProducts == null) {
        break missingId;
      }

      id = R.id.productList_shippingLabelsNotice;
      MaterialTextView productListShippingLabelsNotice = ViewBindings.findChildViewById(rootView, id);
      if (productListShippingLabelsNotice == null) {
        break missingId;
      }

      return new OrderDetailProductListBinding(rootView, productListBarrier,
          productListBtnCreateShippingLabel, productListBtnMarkOrderComplete, productListBtnMenu,
          productListLblProduct, productListProducts, productListShippingLabelsNotice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}