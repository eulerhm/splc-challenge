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

public final class SiteCreationProgressCreatingSiteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView checkmarkIcon;

  @NonNull
  public final ImageView imgIllustration;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final ConstraintLayout progressLayout;

  @NonNull
  public final MaterialTextView progressText;

  @NonNull
  public final LinearLayout progressTextLayout;

  @NonNull
  public final MaterialTextView subtitle;

  @NonNull
  public final MaterialTextView title;

  private SiteCreationProgressCreatingSiteBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView checkmarkIcon, @NonNull ImageView imgIllustration,
      @NonNull ProgressBar progress, @NonNull ConstraintLayout progressLayout,
      @NonNull MaterialTextView progressText, @NonNull LinearLayout progressTextLayout,
      @NonNull MaterialTextView subtitle, @NonNull MaterialTextView title) {
    this.rootView = rootView;
    this.checkmarkIcon = checkmarkIcon;
    this.imgIllustration = imgIllustration;
    this.progress = progress;
    this.progressLayout = progressLayout;
    this.progressText = progressText;
    this.progressTextLayout = progressTextLayout;
    this.subtitle = subtitle;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SiteCreationProgressCreatingSiteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SiteCreationProgressCreatingSiteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.site_creation_progress_creating_site, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SiteCreationProgressCreatingSiteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkmark_icon;
      ImageView checkmarkIcon = ViewBindings.findChildViewById(rootView, id);
      if (checkmarkIcon == null) {
        break missingId;
      }

      id = R.id.img_illustration;
      ImageView imgIllustration = ViewBindings.findChildViewById(rootView, id);
      if (imgIllustration == null) {
        break missingId;
      }

      id = R.id.progress;
      ProgressBar progress = ViewBindings.findChildViewById(rootView, id);
      if (progress == null) {
        break missingId;
      }

      ConstraintLayout progressLayout = (ConstraintLayout) rootView;

      id = R.id.progress_text;
      MaterialTextView progressText = ViewBindings.findChildViewById(rootView, id);
      if (progressText == null) {
        break missingId;
      }

      id = R.id.progress_text_layout;
      LinearLayout progressTextLayout = ViewBindings.findChildViewById(rootView, id);
      if (progressTextLayout == null) {
        break missingId;
      }

      id = R.id.subtitle;
      MaterialTextView subtitle = ViewBindings.findChildViewById(rootView, id);
      if (subtitle == null) {
        break missingId;
      }

      id = R.id.title;
      MaterialTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new SiteCreationProgressCreatingSiteBinding((ConstraintLayout) rootView, checkmarkIcon,
          imgIllustration, progress, progressLayout, progressText, progressTextLayout, subtitle,
          title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}