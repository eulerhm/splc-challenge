// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class SubfilterComponentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView filterListButton;

  @NonNull
  public final View filterSelection;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final ImageView removeFilterButton;

  @NonNull
  public final MaterialTextView selectedFilterName;

  private SubfilterComponentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView filterListButton, @NonNull View filterSelection,
      @NonNull Guideline guideline, @NonNull ImageView removeFilterButton,
      @NonNull MaterialTextView selectedFilterName) {
    this.rootView = rootView;
    this.filterListButton = filterListButton;
    this.filterSelection = filterSelection;
    this.guideline = guideline;
    this.removeFilterButton = removeFilterButton;
    this.selectedFilterName = selectedFilterName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SubfilterComponentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SubfilterComponentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.subfilter_component, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SubfilterComponentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.filter_list_button;
      ImageView filterListButton = ViewBindings.findChildViewById(rootView, id);
      if (filterListButton == null) {
        break missingId;
      }

      id = R.id.filter_selection;
      View filterSelection = ViewBindings.findChildViewById(rootView, id);
      if (filterSelection == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.remove_filter_button;
      ImageView removeFilterButton = ViewBindings.findChildViewById(rootView, id);
      if (removeFilterButton == null) {
        break missingId;
      }

      id = R.id.selected_filter_name;
      MaterialTextView selectedFilterName = ViewBindings.findChildViewById(rootView, id);
      if (selectedFilterName == null) {
        break missingId;
      }

      return new SubfilterComponentBinding((ConstraintLayout) rootView, filterListButton,
          filterSelection, guideline, removeFilterButton, selectedFilterName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}