// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class JetpackBackupRestoreListSubheaderItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout itemContainer;

  @NonNull
  public final MaterialTextView subheader;

  private JetpackBackupRestoreListSubheaderItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout itemContainer, @NonNull MaterialTextView subheader) {
    this.rootView = rootView;
    this.itemContainer = itemContainer;
    this.subheader = subheader;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static JetpackBackupRestoreListSubheaderItemBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static JetpackBackupRestoreListSubheaderItemBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.jetpack_backup_restore_list_subheader_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static JetpackBackupRestoreListSubheaderItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout itemContainer = (ConstraintLayout) rootView;

      id = R.id.subheader;
      MaterialTextView subheader = ViewBindings.findChildViewById(rootView, id);
      if (subheader == null) {
        break missingId;
      }

      return new JetpackBackupRestoreListSubheaderItemBinding((ConstraintLayout) rootView,
          itemContainer, subheader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}