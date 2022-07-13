// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.BorderedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ImageGalleryItemBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout addImageContainer;

  @NonNull
  public final ImageView addImageIcon;

  @NonNull
  public final ImageButton deleteImageButton;

  @NonNull
  public final BorderedImageView productImage;

  @NonNull
  public final ProgressBar uploadProgess;

  private ImageGalleryItemBinding(@NonNull FrameLayout rootView,
      @NonNull FrameLayout addImageContainer, @NonNull ImageView addImageIcon,
      @NonNull ImageButton deleteImageButton, @NonNull BorderedImageView productImage,
      @NonNull ProgressBar uploadProgess) {
    this.rootView = rootView;
    this.addImageContainer = addImageContainer;
    this.addImageIcon = addImageIcon;
    this.deleteImageButton = deleteImageButton;
    this.productImage = productImage;
    this.uploadProgess = uploadProgess;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ImageGalleryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ImageGalleryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.image_gallery_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ImageGalleryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addImageContainer;
      FrameLayout addImageContainer = ViewBindings.findChildViewById(rootView, id);
      if (addImageContainer == null) {
        break missingId;
      }

      id = R.id.addImageIcon;
      ImageView addImageIcon = ViewBindings.findChildViewById(rootView, id);
      if (addImageIcon == null) {
        break missingId;
      }

      id = R.id.deleteImageButton;
      ImageButton deleteImageButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteImageButton == null) {
        break missingId;
      }

      id = R.id.productImage;
      BorderedImageView productImage = ViewBindings.findChildViewById(rootView, id);
      if (productImage == null) {
        break missingId;
      }

      id = R.id.uploadProgess;
      ProgressBar uploadProgess = ViewBindings.findChildViewById(rootView, id);
      if (uploadProgess == null) {
        break missingId;
      }

      return new ImageGalleryItemBinding((FrameLayout) rootView, addImageContainer, addImageIcon,
          deleteImageButton, productImage, uploadProgess);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}