// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.ActionableEmptyView;
import org.wordpress.android.ui.prefs.EmptyViewRecyclerView;
import org.wordpress.android.util.widgets.CustomSwipeRefreshLayout;

public final class MediaGridFragmentBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ActionableEmptyView actionableEmptyView;

  @NonNull
  public final CustomSwipeRefreshLayout ptrLayout;

  @NonNull
  public final EmptyViewRecyclerView recycler;

  private MediaGridFragmentBinding(@NonNull RelativeLayout rootView,
      @NonNull ActionableEmptyView actionableEmptyView, @NonNull CustomSwipeRefreshLayout ptrLayout,
      @NonNull EmptyViewRecyclerView recycler) {
    this.rootView = rootView;
    this.actionableEmptyView = actionableEmptyView;
    this.ptrLayout = ptrLayout;
    this.recycler = recycler;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MediaGridFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MediaGridFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.media_grid_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MediaGridFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionable_empty_view;
      ActionableEmptyView actionableEmptyView = ViewBindings.findChildViewById(rootView, id);
      if (actionableEmptyView == null) {
        break missingId;
      }

      id = R.id.ptr_layout;
      CustomSwipeRefreshLayout ptrLayout = ViewBindings.findChildViewById(rootView, id);
      if (ptrLayout == null) {
        break missingId;
      }

      id = R.id.recycler;
      EmptyViewRecyclerView recycler = ViewBindings.findChildViewById(rootView, id);
      if (recycler == null) {
        break missingId;
      }

      return new MediaGridFragmentBinding((RelativeLayout) rootView, actionableEmptyView, ptrLayout,
          recycler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}