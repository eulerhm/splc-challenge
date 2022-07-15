// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.prefs.EmptyViewRecyclerView;
import org.wordpress.android.widgets.WPTextView;

public final class ListEditorBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final WPTextView emptyView;

  @NonNull
  public final FloatingActionButton fabButton;

  @NonNull
  public final EmptyViewRecyclerView list;

  @NonNull
  public final WPTextView listEditorHeaderText;

  @NonNull
  public final RelativeLayout listEditorParent;

  private ListEditorBinding(@NonNull RelativeLayout rootView,
      @NonNull CoordinatorLayout coordinator, @NonNull WPTextView emptyView,
      @NonNull FloatingActionButton fabButton, @NonNull EmptyViewRecyclerView list,
      @NonNull WPTextView listEditorHeaderText, @NonNull RelativeLayout listEditorParent) {
    this.rootView = rootView;
    this.coordinator = coordinator;
    this.emptyView = emptyView;
    this.fabButton = fabButton;
    this.list = list;
    this.listEditorHeaderText = listEditorHeaderText;
    this.listEditorParent = listEditorParent;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListEditorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListEditorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_editor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListEditorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.coordinator;
      CoordinatorLayout coordinator = ViewBindings.findChildViewById(rootView, id);
      if (coordinator == null) {
        break missingId;
      }

      id = R.id.empty_view;
      WPTextView emptyView = ViewBindings.findChildViewById(rootView, id);
      if (emptyView == null) {
        break missingId;
      }

      id = R.id.fab_button;
      FloatingActionButton fabButton = ViewBindings.findChildViewById(rootView, id);
      if (fabButton == null) {
        break missingId;
      }

      id = R.id.list;
      EmptyViewRecyclerView list = ViewBindings.findChildViewById(rootView, id);
      if (list == null) {
        break missingId;
      }

      id = R.id.list_editor_header_text;
      WPTextView listEditorHeaderText = ViewBindings.findChildViewById(rootView, id);
      if (listEditorHeaderText == null) {
        break missingId;
      }

      RelativeLayout listEditorParent = (RelativeLayout) rootView;

      return new ListEditorBinding((RelativeLayout) rootView, coordinator, emptyView, fabButton,
          list, listEditorHeaderText, listEditorParent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}