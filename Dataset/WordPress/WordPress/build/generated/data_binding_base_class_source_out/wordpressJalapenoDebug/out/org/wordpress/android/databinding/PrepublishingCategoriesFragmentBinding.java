// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class PrepublishingCategoriesFragmentBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final PrepublishingToolbarBinding includePrepublishingToolbar;

  @NonNull
  public final ProgressBar progressLoading;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RelativeLayout relativeLayout;

  private PrepublishingCategoriesFragmentBinding(@NonNull CoordinatorLayout rootView,
      @NonNull PrepublishingToolbarBinding includePrepublishingToolbar,
      @NonNull ProgressBar progressLoading, @NonNull RecyclerView recyclerView,
      @NonNull RelativeLayout relativeLayout) {
    this.rootView = rootView;
    this.includePrepublishingToolbar = includePrepublishingToolbar;
    this.progressLoading = progressLoading;
    this.recyclerView = recyclerView;
    this.relativeLayout = relativeLayout;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PrepublishingCategoriesFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PrepublishingCategoriesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.prepublishing_categories_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PrepublishingCategoriesFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.include_prepublishing_toolbar;
      View includePrepublishingToolbar = ViewBindings.findChildViewById(rootView, id);
      if (includePrepublishingToolbar == null) {
        break missingId;
      }
      PrepublishingToolbarBinding binding_includePrepublishingToolbar = PrepublishingToolbarBinding.bind(includePrepublishingToolbar);

      id = R.id.progress_loading;
      ProgressBar progressLoading = ViewBindings.findChildViewById(rootView, id);
      if (progressLoading == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.relative_layout;
      RelativeLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      return new PrepublishingCategoriesFragmentBinding((CoordinatorLayout) rootView,
          binding_includePrepublishingToolbar, progressLoading, recyclerView, relativeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}