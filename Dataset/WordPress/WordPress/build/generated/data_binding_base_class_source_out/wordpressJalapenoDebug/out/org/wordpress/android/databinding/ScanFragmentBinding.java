// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.ActionableEmptyView;
import org.wordpress.android.ui.prefs.EmptyViewRecyclerView;

public final class ScanFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ActionableEmptyView actionableEmptyView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final EmptyViewRecyclerView recyclerView;

  private ScanFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ActionableEmptyView actionableEmptyView, @NonNull ProgressBar progressBar,
      @NonNull EmptyViewRecyclerView recyclerView) {
    this.rootView = rootView;
    this.actionableEmptyView = actionableEmptyView;
    this.progressBar = progressBar;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScanFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScanFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.scan_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScanFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionable_empty_view;
      ActionableEmptyView actionableEmptyView = ViewBindings.findChildViewById(rootView, id);
      if (actionableEmptyView == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      EmptyViewRecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new ScanFragmentBinding((ConstraintLayout) rootView, actionableEmptyView, progressBar,
          recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}