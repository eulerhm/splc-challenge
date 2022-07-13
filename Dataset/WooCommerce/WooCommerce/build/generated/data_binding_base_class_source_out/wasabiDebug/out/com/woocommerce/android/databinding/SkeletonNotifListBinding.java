// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SkeletonNotifListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider2;

  @NonNull
  public final View divider3;

  @NonNull
  public final View divider4;

  @NonNull
  public final View divider5;

  @NonNull
  public final Guideline guideline5;

  @NonNull
  public final SkeletonNotifListItemBinding include;

  @NonNull
  public final SkeletonNotifListItemBinding include2;

  @NonNull
  public final SkeletonNotifListItemBinding include3;

  @NonNull
  public final SkeletonListHeaderBinding include4;

  private SkeletonNotifListBinding(@NonNull ConstraintLayout rootView, @NonNull View divider2,
      @NonNull View divider3, @NonNull View divider4, @NonNull View divider5,
      @NonNull Guideline guideline5, @NonNull SkeletonNotifListItemBinding include,
      @NonNull SkeletonNotifListItemBinding include2,
      @NonNull SkeletonNotifListItemBinding include3, @NonNull SkeletonListHeaderBinding include4) {
    this.rootView = rootView;
    this.divider2 = divider2;
    this.divider3 = divider3;
    this.divider4 = divider4;
    this.divider5 = divider5;
    this.guideline5 = guideline5;
    this.include = include;
    this.include2 = include2;
    this.include3 = include3;
    this.include4 = include4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SkeletonNotifListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SkeletonNotifListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.skeleton_notif_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SkeletonNotifListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider2;
      View divider2 = ViewBindings.findChildViewById(rootView, id);
      if (divider2 == null) {
        break missingId;
      }

      id = R.id.divider3;
      View divider3 = ViewBindings.findChildViewById(rootView, id);
      if (divider3 == null) {
        break missingId;
      }

      id = R.id.divider4;
      View divider4 = ViewBindings.findChildViewById(rootView, id);
      if (divider4 == null) {
        break missingId;
      }

      id = R.id.divider5;
      View divider5 = ViewBindings.findChildViewById(rootView, id);
      if (divider5 == null) {
        break missingId;
      }

      id = R.id.guideline5;
      Guideline guideline5 = ViewBindings.findChildViewById(rootView, id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.include;
      View include = ViewBindings.findChildViewById(rootView, id);
      if (include == null) {
        break missingId;
      }
      SkeletonNotifListItemBinding binding_include = SkeletonNotifListItemBinding.bind(include);

      id = R.id.include2;
      View include2 = ViewBindings.findChildViewById(rootView, id);
      if (include2 == null) {
        break missingId;
      }
      SkeletonNotifListItemBinding binding_include2 = SkeletonNotifListItemBinding.bind(include2);

      id = R.id.include3;
      View include3 = ViewBindings.findChildViewById(rootView, id);
      if (include3 == null) {
        break missingId;
      }
      SkeletonNotifListItemBinding binding_include3 = SkeletonNotifListItemBinding.bind(include3);

      id = R.id.include4;
      View include4 = ViewBindings.findChildViewById(rootView, id);
      if (include4 == null) {
        break missingId;
      }
      SkeletonListHeaderBinding binding_include4 = SkeletonListHeaderBinding.bind(include4);

      return new SkeletonNotifListBinding((ConstraintLayout) rootView, divider2, divider3, divider4,
          divider5, guideline5, binding_include, binding_include2, binding_include3,
          binding_include4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}