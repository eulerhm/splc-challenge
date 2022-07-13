// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewProgressDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final MaterialTextView progressText;

  @NonNull
  public final MaterialTextView progressTitle;

  @NonNull
  public final ConstraintLayout progressView;

  private ViewProgressDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull ProgressBar progressBar, @NonNull MaterialTextView progressText,
      @NonNull MaterialTextView progressTitle, @NonNull ConstraintLayout progressView) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.progressText = progressText;
    this.progressTitle = progressTitle;
    this.progressView = progressView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewProgressDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewProgressDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_progress_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewProgressDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.progress_text;
      MaterialTextView progressText = ViewBindings.findChildViewById(rootView, id);
      if (progressText == null) {
        break missingId;
      }

      id = R.id.progress_title;
      MaterialTextView progressTitle = ViewBindings.findChildViewById(rootView, id);
      if (progressTitle == null) {
        break missingId;
      }

      ConstraintLayout progressView = (ConstraintLayout) rootView;

      return new ViewProgressDialogBinding((ConstraintLayout) rootView, progressBar, progressText,
          progressTitle, progressView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}