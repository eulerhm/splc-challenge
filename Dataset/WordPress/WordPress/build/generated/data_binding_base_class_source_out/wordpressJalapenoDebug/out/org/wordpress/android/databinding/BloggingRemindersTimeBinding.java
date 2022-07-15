// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class BloggingRemindersTimeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView timeButton;

  @NonNull
  public final ConstraintLayout timeItem;

  @NonNull
  public final View timeLineBottom;

  @NonNull
  public final View timeLineTop;

  @NonNull
  public final TextView timeText;

  private BloggingRemindersTimeBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView timeButton, @NonNull ConstraintLayout timeItem,
      @NonNull View timeLineBottom, @NonNull View timeLineTop, @NonNull TextView timeText) {
    this.rootView = rootView;
    this.timeButton = timeButton;
    this.timeItem = timeItem;
    this.timeLineBottom = timeLineBottom;
    this.timeLineTop = timeLineTop;
    this.timeText = timeText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BloggingRemindersTimeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BloggingRemindersTimeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.blogging_reminders_time, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BloggingRemindersTimeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.time_button;
      TextView timeButton = ViewBindings.findChildViewById(rootView, id);
      if (timeButton == null) {
        break missingId;
      }

      ConstraintLayout timeItem = (ConstraintLayout) rootView;

      id = R.id.time_line_bottom;
      View timeLineBottom = ViewBindings.findChildViewById(rootView, id);
      if (timeLineBottom == null) {
        break missingId;
      }

      id = R.id.time_line_top;
      View timeLineTop = ViewBindings.findChildViewById(rootView, id);
      if (timeLineTop == null) {
        break missingId;
      }

      id = R.id.time_text;
      TextView timeText = ViewBindings.findChildViewById(rootView, id);
      if (timeText == null) {
        break missingId;
      }

      return new BloggingRemindersTimeBinding((ConstraintLayout) rootView, timeButton, timeItem,
          timeLineBottom, timeLineTop, timeText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}