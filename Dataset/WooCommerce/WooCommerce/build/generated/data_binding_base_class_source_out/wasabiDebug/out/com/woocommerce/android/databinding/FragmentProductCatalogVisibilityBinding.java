// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductCatalogVisibilityBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final SwitchMaterial btnFeatured;

  @NonNull
  public final CheckedTextView btnVisibilityCatalog;

  @NonNull
  public final CheckedTextView btnVisibilityHidden;

  @NonNull
  public final CheckedTextView btnVisibilitySearch;

  @NonNull
  public final CheckedTextView btnVisibilityVisible;

  private FragmentProductCatalogVisibilityBinding(@NonNull ScrollView rootView,
      @NonNull SwitchMaterial btnFeatured, @NonNull CheckedTextView btnVisibilityCatalog,
      @NonNull CheckedTextView btnVisibilityHidden, @NonNull CheckedTextView btnVisibilitySearch,
      @NonNull CheckedTextView btnVisibilityVisible) {
    this.rootView = rootView;
    this.btnFeatured = btnFeatured;
    this.btnVisibilityCatalog = btnVisibilityCatalog;
    this.btnVisibilityHidden = btnVisibilityHidden;
    this.btnVisibilitySearch = btnVisibilitySearch;
    this.btnVisibilityVisible = btnVisibilityVisible;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductCatalogVisibilityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductCatalogVisibilityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_product_catalog_visibility, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductCatalogVisibilityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnFeatured;
      SwitchMaterial btnFeatured = ViewBindings.findChildViewById(rootView, id);
      if (btnFeatured == null) {
        break missingId;
      }

      id = R.id.btnVisibilityCatalog;
      CheckedTextView btnVisibilityCatalog = ViewBindings.findChildViewById(rootView, id);
      if (btnVisibilityCatalog == null) {
        break missingId;
      }

      id = R.id.btnVisibilityHidden;
      CheckedTextView btnVisibilityHidden = ViewBindings.findChildViewById(rootView, id);
      if (btnVisibilityHidden == null) {
        break missingId;
      }

      id = R.id.btnVisibilitySearch;
      CheckedTextView btnVisibilitySearch = ViewBindings.findChildViewById(rootView, id);
      if (btnVisibilitySearch == null) {
        break missingId;
      }

      id = R.id.btnVisibilityVisible;
      CheckedTextView btnVisibilityVisible = ViewBindings.findChildViewById(rootView, id);
      if (btnVisibilityVisible == null) {
        break missingId;
      }

      return new FragmentProductCatalogVisibilityBinding((ScrollView) rootView, btnFeatured,
          btnVisibilityCatalog, btnVisibilityHidden, btnVisibilitySearch, btnVisibilityVisible);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}