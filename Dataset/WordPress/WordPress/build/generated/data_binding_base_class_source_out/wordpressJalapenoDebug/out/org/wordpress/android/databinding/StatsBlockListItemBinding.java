// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StatsBlockListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView avatar;

  @NonNull
  public final ProgressBar bar;

  @NonNull
  public final View divider;

  @NonNull
  public final ImageView expandButton;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final LinearLayout iconContainer;

  @NonNull
  public final MaterialTextView text;

  @NonNull
  public final View topMargin;

  @NonNull
  public final MaterialTextView value;

  private StatsBlockListItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView avatar,
      @NonNull ProgressBar bar, @NonNull View divider, @NonNull ImageView expandButton,
      @NonNull ImageView icon, @NonNull LinearLayout iconContainer, @NonNull MaterialTextView text,
      @NonNull View topMargin, @NonNull MaterialTextView value) {
    this.rootView = rootView;
    this.avatar = avatar;
    this.bar = bar;
    this.divider = divider;
    this.expandButton = expandButton;
    this.icon = icon;
    this.iconContainer = iconContainer;
    this.text = text;
    this.topMargin = topMargin;
    this.value = value;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsBlockListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsBlockListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_block_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsBlockListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatar;
      ImageView avatar = ViewBindings.findChildViewById(rootView, id);
      if (avatar == null) {
        break missingId;
      }

      id = R.id.bar;
      ProgressBar bar = ViewBindings.findChildViewById(rootView, id);
      if (bar == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.expand_button;
      ImageView expandButton = ViewBindings.findChildViewById(rootView, id);
      if (expandButton == null) {
        break missingId;
      }

      id = R.id.icon;
      ImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.icon_container;
      LinearLayout iconContainer = ViewBindings.findChildViewById(rootView, id);
      if (iconContainer == null) {
        break missingId;
      }

      id = R.id.text;
      MaterialTextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      id = R.id.top_margin;
      View topMargin = ViewBindings.findChildViewById(rootView, id);
      if (topMargin == null) {
        break missingId;
      }

      id = R.id.value;
      MaterialTextView value = ViewBindings.findChildViewById(rootView, id);
      if (value == null) {
        break missingId;
      }

      return new StatsBlockListItemBinding((ConstraintLayout) rootView, avatar, bar, divider,
          expandButton, icon, iconContainer, text, topMargin, value);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}