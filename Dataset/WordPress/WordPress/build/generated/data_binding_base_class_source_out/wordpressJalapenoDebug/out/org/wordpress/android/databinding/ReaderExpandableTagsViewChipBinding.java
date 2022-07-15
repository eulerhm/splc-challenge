// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.chip.Chip;
import java.lang.NullPointerException;
import java.lang.Override;
import org.wordpress.android.R;

public final class ReaderExpandableTagsViewChipBinding implements ViewBinding {
  @NonNull
  private final Chip rootView;

  private ReaderExpandableTagsViewChipBinding(@NonNull Chip rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public Chip getRoot() {
    return rootView;
  }

  @NonNull
  public static ReaderExpandableTagsViewChipBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReaderExpandableTagsViewChipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reader_expandable_tags_view_chip, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReaderExpandableTagsViewChipBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ReaderExpandableTagsViewChipBinding((Chip) rootView);
  }
}