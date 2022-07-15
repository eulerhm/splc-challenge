// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.wordpress.android.R;

public final class AddNewSiteDialogItemBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView text;

  private AddNewSiteDialogItemBinding(@NonNull TextView rootView, @NonNull TextView text) {
    this.rootView = rootView;
    this.text = text;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static AddNewSiteDialogItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddNewSiteDialogItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_new_site_dialog_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddNewSiteDialogItemBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView text = (TextView) rootView;

    return new AddNewSiteDialogItemBinding((TextView) rootView, text);
  }
}