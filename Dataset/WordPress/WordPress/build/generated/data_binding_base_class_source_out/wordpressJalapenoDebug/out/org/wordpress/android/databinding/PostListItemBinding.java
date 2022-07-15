// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import org.wordpress.android.widgets.PostListButton;
import org.wordpress.android.widgets.WPTextView;

public final class PostListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final PostListButton btnPrimary;

  @NonNull
  public final PostListButton btnSecondary;

  @NonNull
  public final PostListButton btnTernary;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final FrameLayout disabledOverlay;

  @NonNull
  public final WPTextView excerpt;

  @NonNull
  public final ImageView imageFeatured;

  @NonNull
  public final LinearLayout layoutButtons;

  @NonNull
  public final WPTextView postInfo;

  @NonNull
  public final WPTextView statusesLabel;

  @NonNull
  public final WPTextView title;

  @NonNull
  public final ProgressBar uploadProgress;

  private PostListItemBinding(@NonNull LinearLayout rootView, @NonNull PostListButton btnPrimary,
      @NonNull PostListButton btnSecondary, @NonNull PostListButton btnTernary,
      @NonNull ConstraintLayout container, @NonNull FrameLayout disabledOverlay,
      @NonNull WPTextView excerpt, @NonNull ImageView imageFeatured,
      @NonNull LinearLayout layoutButtons, @NonNull WPTextView postInfo,
      @NonNull WPTextView statusesLabel, @NonNull WPTextView title,
      @NonNull ProgressBar uploadProgress) {
    this.rootView = rootView;
    this.btnPrimary = btnPrimary;
    this.btnSecondary = btnSecondary;
    this.btnTernary = btnTernary;
    this.container = container;
    this.disabledOverlay = disabledOverlay;
    this.excerpt = excerpt;
    this.imageFeatured = imageFeatured;
    this.layoutButtons = layoutButtons;
    this.postInfo = postInfo;
    this.statusesLabel = statusesLabel;
    this.title = title;
    this.uploadProgress = uploadProgress;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PostListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PostListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.post_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PostListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_primary;
      PostListButton btnPrimary = ViewBindings.findChildViewById(rootView, id);
      if (btnPrimary == null) {
        break missingId;
      }

      id = R.id.btn_secondary;
      PostListButton btnSecondary = ViewBindings.findChildViewById(rootView, id);
      if (btnSecondary == null) {
        break missingId;
      }

      id = R.id.btn_ternary;
      PostListButton btnTernary = ViewBindings.findChildViewById(rootView, id);
      if (btnTernary == null) {
        break missingId;
      }

      id = R.id.container;
      ConstraintLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.disabled_overlay;
      FrameLayout disabledOverlay = ViewBindings.findChildViewById(rootView, id);
      if (disabledOverlay == null) {
        break missingId;
      }

      id = R.id.excerpt;
      WPTextView excerpt = ViewBindings.findChildViewById(rootView, id);
      if (excerpt == null) {
        break missingId;
      }

      id = R.id.image_featured;
      ImageView imageFeatured = ViewBindings.findChildViewById(rootView, id);
      if (imageFeatured == null) {
        break missingId;
      }

      id = R.id.layout_buttons;
      LinearLayout layoutButtons = ViewBindings.findChildViewById(rootView, id);
      if (layoutButtons == null) {
        break missingId;
      }

      id = R.id.post_info;
      WPTextView postInfo = ViewBindings.findChildViewById(rootView, id);
      if (postInfo == null) {
        break missingId;
      }

      id = R.id.statuses_label;
      WPTextView statusesLabel = ViewBindings.findChildViewById(rootView, id);
      if (statusesLabel == null) {
        break missingId;
      }

      id = R.id.title;
      WPTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.upload_progress;
      ProgressBar uploadProgress = ViewBindings.findChildViewById(rootView, id);
      if (uploadProgress == null) {
        break missingId;
      }

      return new PostListItemBinding((LinearLayout) rootView, btnPrimary, btnSecondary, btnTernary,
          container, disabledOverlay, excerpt, imageFeatured, layoutButtons, postInfo,
          statusesLabel, title, uploadProgress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}