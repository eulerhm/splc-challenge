// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import org.wordpress.android.util.widgets.CustomSwipeRefreshLayout;
import org.wordpress.android.widgets.HeaderGridView;
import org.wordpress.android.widgets.WPTextView;

public final class ThemeBrowserFragmentBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView_;

  @NonNull
  public final ActionableEmptyView actionableEmptyView;

  @NonNull
  public final ImageView drakeEmptyResults;

  @NonNull
  public final RelativeLayout emptyView;

  @NonNull
  public final CustomSwipeRefreshLayout ptrLayout;

  @NonNull
  public final RelativeLayout rootView;

  @NonNull
  public final WPTextView textEmpty;

  @NonNull
  public final HeaderGridView themeListview;

  private ThemeBrowserFragmentBinding(@NonNull RelativeLayout rootView_,
      @NonNull ActionableEmptyView actionableEmptyView, @NonNull ImageView drakeEmptyResults,
      @NonNull RelativeLayout emptyView, @NonNull CustomSwipeRefreshLayout ptrLayout,
      @NonNull RelativeLayout rootView, @NonNull WPTextView textEmpty,
      @NonNull HeaderGridView themeListview) {
    this.rootView_ = rootView_;
    this.actionableEmptyView = actionableEmptyView;
    this.drakeEmptyResults = drakeEmptyResults;
    this.emptyView = emptyView;
    this.ptrLayout = ptrLayout;
    this.rootView = rootView;
    this.textEmpty = textEmpty;
    this.themeListview = themeListview;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView_;
  }

  @NonNull
  public static ThemeBrowserFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ThemeBrowserFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.theme_browser_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ThemeBrowserFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionable_empty_view;
      ActionableEmptyView actionableEmptyView = ViewBindings.findChildViewById(rootView, id);
      if (actionableEmptyView == null) {
        break missingId;
      }

      id = R.id.drake_empty_results;
      ImageView drakeEmptyResults = ViewBindings.findChildViewById(rootView, id);
      if (drakeEmptyResults == null) {
        break missingId;
      }

      id = R.id.empty_view;
      RelativeLayout emptyView = ViewBindings.findChildViewById(rootView, id);
      if (emptyView == null) {
        break missingId;
      }

      id = R.id.ptr_layout;
      CustomSwipeRefreshLayout ptrLayout = ViewBindings.findChildViewById(rootView, id);
      if (ptrLayout == null) {
        break missingId;
      }

      RelativeLayout rootView_ = (RelativeLayout) rootView;

      id = R.id.text_empty;
      WPTextView textEmpty = ViewBindings.findChildViewById(rootView, id);
      if (textEmpty == null) {
        break missingId;
      }

      id = R.id.theme_listview;
      HeaderGridView themeListview = ViewBindings.findChildViewById(rootView, id);
      if (themeListview == null) {
        break missingId;
      }

      return new ThemeBrowserFragmentBinding((RelativeLayout) rootView, actionableEmptyView,
          drakeEmptyResults, emptyView, ptrLayout, rootView_, textEmpty, themeListview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}