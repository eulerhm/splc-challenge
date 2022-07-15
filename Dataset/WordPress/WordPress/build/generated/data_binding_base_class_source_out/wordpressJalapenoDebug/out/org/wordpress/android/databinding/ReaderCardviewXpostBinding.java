// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class ReaderCardviewXpostBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imageAvatar;

  @NonNull
  public final ImageView imageBlavatar;

  @NonNull
  public final MaterialCardView postContainer;

  @NonNull
  public final WPTextView textSubtitle;

  @NonNull
  public final WPTextView textTitle;

  private ReaderCardviewXpostBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView imageAvatar, @NonNull ImageView imageBlavatar,
      @NonNull MaterialCardView postContainer, @NonNull WPTextView textSubtitle,
      @NonNull WPTextView textTitle) {
    this.rootView = rootView;
    this.imageAvatar = imageAvatar;
    this.imageBlavatar = imageBlavatar;
    this.postContainer = postContainer;
    this.textSubtitle = textSubtitle;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ReaderCardviewXpostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReaderCardviewXpostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reader_cardview_xpost, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReaderCardviewXpostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_avatar;
      ImageView imageAvatar = ViewBindings.findChildViewById(rootView, id);
      if (imageAvatar == null) {
        break missingId;
      }

      id = R.id.image_blavatar;
      ImageView imageBlavatar = ViewBindings.findChildViewById(rootView, id);
      if (imageBlavatar == null) {
        break missingId;
      }

      MaterialCardView postContainer = (MaterialCardView) rootView;

      id = R.id.text_subtitle;
      WPTextView textSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (textSubtitle == null) {
        break missingId;
      }

      id = R.id.text_title;
      WPTextView textTitle = ViewBindings.findChildViewById(rootView, id);
      if (textTitle == null) {
        break missingId;
      }

      return new ReaderCardviewXpostBinding((MaterialCardView) rootView, imageAvatar, imageBlavatar,
          postContainer, textSubtitle, textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}