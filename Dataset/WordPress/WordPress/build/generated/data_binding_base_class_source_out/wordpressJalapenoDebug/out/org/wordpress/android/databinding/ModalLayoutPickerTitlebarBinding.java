// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class ModalLayoutPickerTitlebarBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final ImageButton previewTypeSelectorButton;

  @NonNull
  public final TextView title;

  private ModalLayoutPickerTitlebarBinding(@NonNull FrameLayout rootView,
      @NonNull ImageButton backButton, @NonNull ImageButton previewTypeSelectorButton,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.previewTypeSelectorButton = previewTypeSelectorButton;
    this.title = title;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ModalLayoutPickerTitlebarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ModalLayoutPickerTitlebarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.modal_layout_picker_titlebar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ModalLayoutPickerTitlebarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.previewTypeSelectorButton;
      ImageButton previewTypeSelectorButton = ViewBindings.findChildViewById(rootView, id);
      if (previewTypeSelectorButton == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ModalLayoutPickerTitlebarBinding((FrameLayout) rootView, backButton,
          previewTypeSelectorButton, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}