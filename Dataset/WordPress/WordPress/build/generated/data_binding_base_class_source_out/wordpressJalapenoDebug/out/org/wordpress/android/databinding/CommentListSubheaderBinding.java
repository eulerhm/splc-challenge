// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import org.wordpress.android.R;

public final class CommentListSubheaderBinding implements ViewBinding {
  @NonNull
  private final MaterialTextView rootView;

  @NonNull
  public final MaterialTextView label;

  private CommentListSubheaderBinding(@NonNull MaterialTextView rootView,
      @NonNull MaterialTextView label) {
    this.rootView = rootView;
    this.label = label;
  }

  @Override
  @NonNull
  public MaterialTextView getRoot() {
    return rootView;
  }

  @NonNull
  public static CommentListSubheaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CommentListSubheaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.comment_list_subheader, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CommentListSubheaderBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    MaterialTextView label = (MaterialTextView) rootView;

    return new CommentListSubheaderBinding((MaterialTextView) rootView, label);
  }
}