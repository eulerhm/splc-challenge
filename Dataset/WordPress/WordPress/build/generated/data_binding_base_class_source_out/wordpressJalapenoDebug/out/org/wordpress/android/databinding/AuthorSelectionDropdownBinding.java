// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class AuthorSelectionDropdownBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatImageView authorSelectionImage;

  @NonNull
  public final AppCompatTextView authorSelectionText;

  private AuthorSelectionDropdownBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatImageView authorSelectionImage,
      @NonNull AppCompatTextView authorSelectionText) {
    this.rootView = rootView;
    this.authorSelectionImage = authorSelectionImage;
    this.authorSelectionText = authorSelectionText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AuthorSelectionDropdownBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AuthorSelectionDropdownBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.author_selection_dropdown, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AuthorSelectionDropdownBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.author_selection_image;
      AppCompatImageView authorSelectionImage = ViewBindings.findChildViewById(rootView, id);
      if (authorSelectionImage == null) {
        break missingId;
      }

      id = R.id.author_selection_text;
      AppCompatTextView authorSelectionText = ViewBindings.findChildViewById(rootView, id);
      if (authorSelectionText == null) {
        break missingId;
      }

      return new AuthorSelectionDropdownBinding((LinearLayout) rootView, authorSelectionImage,
          authorSelectionText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}