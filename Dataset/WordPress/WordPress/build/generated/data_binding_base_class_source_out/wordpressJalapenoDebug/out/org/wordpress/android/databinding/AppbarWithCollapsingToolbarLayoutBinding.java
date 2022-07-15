// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class AppbarWithCollapsingToolbarLayoutBinding implements ViewBinding {
  @NonNull
  private final AppBarLayout rootView;

  @NonNull
  public final AppBarLayout appbarMain;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final ImageView featuredImage;

  @NonNull
  public final Toolbar toolbarMain;

  private AppbarWithCollapsingToolbarLayoutBinding(@NonNull AppBarLayout rootView,
      @NonNull AppBarLayout appbarMain, @NonNull CollapsingToolbarLayout collapsingToolbar,
      @NonNull ImageView featuredImage, @NonNull Toolbar toolbarMain) {
    this.rootView = rootView;
    this.appbarMain = appbarMain;
    this.collapsingToolbar = collapsingToolbar;
    this.featuredImage = featuredImage;
    this.toolbarMain = toolbarMain;
  }

  @Override
  @NonNull
  public AppBarLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AppbarWithCollapsingToolbarLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppbarWithCollapsingToolbarLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.appbar_with_collapsing_toolbar_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppbarWithCollapsingToolbarLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      AppBarLayout appbarMain = (AppBarLayout) rootView;

      id = R.id.collapsing_toolbar;
      CollapsingToolbarLayout collapsingToolbar = ViewBindings.findChildViewById(rootView, id);
      if (collapsingToolbar == null) {
        break missingId;
      }

      id = R.id.featured_image;
      ImageView featuredImage = ViewBindings.findChildViewById(rootView, id);
      if (featuredImage == null) {
        break missingId;
      }

      id = R.id.toolbar_main;
      Toolbar toolbarMain = ViewBindings.findChildViewById(rootView, id);
      if (toolbarMain == null) {
        break missingId;
      }

      return new AppbarWithCollapsingToolbarLayoutBinding((AppBarLayout) rootView, appbarMain,
          collapsingToolbar, featuredImage, toolbarMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}