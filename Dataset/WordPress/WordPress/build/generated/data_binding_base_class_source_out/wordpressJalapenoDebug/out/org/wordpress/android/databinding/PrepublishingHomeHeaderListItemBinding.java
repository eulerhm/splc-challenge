// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class PrepublishingHomeHeaderListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomSheetHandleViewBinding bottomSheetHandle;

  @NonNull
  public final MaterialTextView publishingTo;

  @NonNull
  public final ImageView siteIcon;

  @NonNull
  public final MaterialCardView siteIconLayout;

  @NonNull
  public final MaterialTextView siteName;

  private PrepublishingHomeHeaderListItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomSheetHandleViewBinding bottomSheetHandle,
      @NonNull MaterialTextView publishingTo, @NonNull ImageView siteIcon,
      @NonNull MaterialCardView siteIconLayout, @NonNull MaterialTextView siteName) {
    this.rootView = rootView;
    this.bottomSheetHandle = bottomSheetHandle;
    this.publishingTo = publishingTo;
    this.siteIcon = siteIcon;
    this.siteIconLayout = siteIconLayout;
    this.siteName = siteName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PrepublishingHomeHeaderListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PrepublishingHomeHeaderListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.prepublishing_home_header_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PrepublishingHomeHeaderListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_sheet_handle;
      View bottomSheetHandle = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheetHandle == null) {
        break missingId;
      }
      BottomSheetHandleViewBinding binding_bottomSheetHandle = BottomSheetHandleViewBinding.bind(bottomSheetHandle);

      id = R.id.publishing_to;
      MaterialTextView publishingTo = ViewBindings.findChildViewById(rootView, id);
      if (publishingTo == null) {
        break missingId;
      }

      id = R.id.site_icon;
      ImageView siteIcon = ViewBindings.findChildViewById(rootView, id);
      if (siteIcon == null) {
        break missingId;
      }

      id = R.id.site_icon_layout;
      MaterialCardView siteIconLayout = ViewBindings.findChildViewById(rootView, id);
      if (siteIconLayout == null) {
        break missingId;
      }

      id = R.id.site_name;
      MaterialTextView siteName = ViewBindings.findChildViewById(rootView, id);
      if (siteName == null) {
        break missingId;
      }

      return new PrepublishingHomeHeaderListItemBinding((ConstraintLayout) rootView,
          binding_bottomSheetHandle, publishingTo, siteIcon, siteIconLayout, siteName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}