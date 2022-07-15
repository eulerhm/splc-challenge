// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.ActionableEmptyView;
import org.wordpress.android.util.widgets.CustomSwipeRefreshLayout;

public final class ReaderDiscoverFragmentLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ActionableEmptyView actionableEmptyView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ProgressBar progressLoadingMore;

  @NonNull
  public final TextView progressText;

  @NonNull
  public final CustomSwipeRefreshLayout ptrLayout;

  @NonNull
  public final RecyclerView recyclerView;

  private ReaderDiscoverFragmentLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull ActionableEmptyView actionableEmptyView, @NonNull ConstraintLayout constraintLayout,
      @NonNull ProgressBar progressBar, @NonNull ProgressBar progressLoadingMore,
      @NonNull TextView progressText, @NonNull CustomSwipeRefreshLayout ptrLayout,
      @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.actionableEmptyView = actionableEmptyView;
    this.constraintLayout = constraintLayout;
    this.progressBar = progressBar;
    this.progressLoadingMore = progressLoadingMore;
    this.progressText = progressText;
    this.ptrLayout = ptrLayout;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReaderDiscoverFragmentLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReaderDiscoverFragmentLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reader_discover_fragment_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReaderDiscoverFragmentLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionable_empty_view;
      ActionableEmptyView actionableEmptyView = ViewBindings.findChildViewById(rootView, id);
      if (actionableEmptyView == null) {
        break missingId;
      }

      ConstraintLayout constraintLayout = (ConstraintLayout) rootView;

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.progress_loading_more;
      ProgressBar progressLoadingMore = ViewBindings.findChildViewById(rootView, id);
      if (progressLoadingMore == null) {
        break missingId;
      }

      id = R.id.progress_text;
      TextView progressText = ViewBindings.findChildViewById(rootView, id);
      if (progressText == null) {
        break missingId;
      }

      id = R.id.ptr_layout;
      CustomSwipeRefreshLayout ptrLayout = ViewBindings.findChildViewById(rootView, id);
      if (ptrLayout == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new ReaderDiscoverFragmentLayoutBinding((ConstraintLayout) rootView,
          actionableEmptyView, constraintLayout, progressBar, progressLoadingMore, progressText,
          ptrLayout, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}