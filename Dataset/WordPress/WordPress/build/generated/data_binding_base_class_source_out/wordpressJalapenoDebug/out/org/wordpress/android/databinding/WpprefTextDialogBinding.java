// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class WpprefTextDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edit;

  @NonNull
  public final TextView textSubtitle;

  private WpprefTextDialogBinding(@NonNull LinearLayout rootView, @NonNull EditText edit,
      @NonNull TextView textSubtitle) {
    this.rootView = rootView;
    this.edit = edit;
    this.textSubtitle = textSubtitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WpprefTextDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WpprefTextDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.wppref_text_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WpprefTextDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edit;
      EditText edit = ViewBindings.findChildViewById(rootView, id);
      if (edit == null) {
        break missingId;
      }

      id = R.id.text_subtitle;
      TextView textSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (textSubtitle == null) {
        break missingId;
      }

      return new WpprefTextDialogBinding((LinearLayout) rootView, edit, textSubtitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}