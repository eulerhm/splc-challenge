// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class TextInputDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final WPTextView textInputDialogHint;

  @NonNull
  public final TextInputEditText textInputDialogInput;

  @NonNull
  public final WPTextView textInputDialogLabel;

  private TextInputDialogBinding(@NonNull LinearLayout rootView,
      @NonNull WPTextView textInputDialogHint, @NonNull TextInputEditText textInputDialogInput,
      @NonNull WPTextView textInputDialogLabel) {
    this.rootView = rootView;
    this.textInputDialogHint = textInputDialogHint;
    this.textInputDialogInput = textInputDialogInput;
    this.textInputDialogLabel = textInputDialogLabel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TextInputDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TextInputDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.text_input_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TextInputDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.text_input_dialog_hint;
      WPTextView textInputDialogHint = ViewBindings.findChildViewById(rootView, id);
      if (textInputDialogHint == null) {
        break missingId;
      }

      id = R.id.text_input_dialog_input;
      TextInputEditText textInputDialogInput = ViewBindings.findChildViewById(rootView, id);
      if (textInputDialogInput == null) {
        break missingId;
      }

      id = R.id.text_input_dialog_label;
      WPTextView textInputDialogLabel = ViewBindings.findChildViewById(rootView, id);
      if (textInputDialogLabel == null) {
        break missingId;
      }

      return new TextInputDialogBinding((LinearLayout) rootView, textInputDialogHint,
          textInputDialogInput, textInputDialogLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}