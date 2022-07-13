// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCElevatedLinearLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentShippingPackagesSelectorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar loadingProgress;

  @NonNull
  public final MaterialButton packagesCreateNewButton;

  @NonNull
  public final WCElevatedLinearLayout packagesCreateNewContainer;

  @NonNull
  public final RecyclerView packagesList;

  private FragmentShippingPackagesSelectorBinding(@NonNull ConstraintLayout rootView,
      @NonNull ProgressBar loadingProgress, @NonNull MaterialButton packagesCreateNewButton,
      @NonNull WCElevatedLinearLayout packagesCreateNewContainer,
      @NonNull RecyclerView packagesList) {
    this.rootView = rootView;
    this.loadingProgress = loadingProgress;
    this.packagesCreateNewButton = packagesCreateNewButton;
    this.packagesCreateNewContainer = packagesCreateNewContainer;
    this.packagesList = packagesList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentShippingPackagesSelectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentShippingPackagesSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_shipping_packages_selector, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentShippingPackagesSelectorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.loading_progress;
      ProgressBar loadingProgress = ViewBindings.findChildViewById(rootView, id);
      if (loadingProgress == null) {
        break missingId;
      }

      id = R.id.packages_createNewButton;
      MaterialButton packagesCreateNewButton = ViewBindings.findChildViewById(rootView, id);
      if (packagesCreateNewButton == null) {
        break missingId;
      }

      id = R.id.packages_createNewContainer;
      WCElevatedLinearLayout packagesCreateNewContainer = ViewBindings.findChildViewById(rootView, id);
      if (packagesCreateNewContainer == null) {
        break missingId;
      }

      id = R.id.packages_list;
      RecyclerView packagesList = ViewBindings.findChildViewById(rootView, id);
      if (packagesList == null) {
        break missingId;
      }

      return new FragmentShippingPackagesSelectorBinding((ConstraintLayout) rootView,
          loadingProgress, packagesCreateNewButton, packagesCreateNewContainer, packagesList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}