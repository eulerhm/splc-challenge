// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.PostListButton;

public final class PostListItemSkeletonBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final PostListButton skeletonButtonDeletePermanently;

  @NonNull
  public final PostListButton skeletonButtonEdit;

  @NonNull
  public final PostListButton skeletonButtonMore;

  @NonNull
  public final PostListButton skeletonButtonMoveToDraft;

  @NonNull
  public final PostListButton skeletonButtonView;

  @NonNull
  public final ConstraintLayout skeletonContainer;

  @NonNull
  public final View skeletonExcerpt;

  @NonNull
  public final LinearLayout skeletonLayoutButtons;

  @NonNull
  public final View skeletonPostInfo;

  @NonNull
  public final View skeletonTitle;

  private PostListItemSkeletonBinding(@NonNull FrameLayout rootView,
      @NonNull PostListButton skeletonButtonDeletePermanently,
      @NonNull PostListButton skeletonButtonEdit, @NonNull PostListButton skeletonButtonMore,
      @NonNull PostListButton skeletonButtonMoveToDraft, @NonNull PostListButton skeletonButtonView,
      @NonNull ConstraintLayout skeletonContainer, @NonNull View skeletonExcerpt,
      @NonNull LinearLayout skeletonLayoutButtons, @NonNull View skeletonPostInfo,
      @NonNull View skeletonTitle) {
    this.rootView = rootView;
    this.skeletonButtonDeletePermanently = skeletonButtonDeletePermanently;
    this.skeletonButtonEdit = skeletonButtonEdit;
    this.skeletonButtonMore = skeletonButtonMore;
    this.skeletonButtonMoveToDraft = skeletonButtonMoveToDraft;
    this.skeletonButtonView = skeletonButtonView;
    this.skeletonContainer = skeletonContainer;
    this.skeletonExcerpt = skeletonExcerpt;
    this.skeletonLayoutButtons = skeletonLayoutButtons;
    this.skeletonPostInfo = skeletonPostInfo;
    this.skeletonTitle = skeletonTitle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PostListItemSkeletonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PostListItemSkeletonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.post_list_item_skeleton, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PostListItemSkeletonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.skeleton_button_delete_permanently;
      PostListButton skeletonButtonDeletePermanently = ViewBindings.findChildViewById(rootView, id);
      if (skeletonButtonDeletePermanently == null) {
        break missingId;
      }

      id = R.id.skeleton_button_edit;
      PostListButton skeletonButtonEdit = ViewBindings.findChildViewById(rootView, id);
      if (skeletonButtonEdit == null) {
        break missingId;
      }

      id = R.id.skeleton_button_more;
      PostListButton skeletonButtonMore = ViewBindings.findChildViewById(rootView, id);
      if (skeletonButtonMore == null) {
        break missingId;
      }

      id = R.id.skeleton_button_move_to_draft;
      PostListButton skeletonButtonMoveToDraft = ViewBindings.findChildViewById(rootView, id);
      if (skeletonButtonMoveToDraft == null) {
        break missingId;
      }

      id = R.id.skeleton_button_view;
      PostListButton skeletonButtonView = ViewBindings.findChildViewById(rootView, id);
      if (skeletonButtonView == null) {
        break missingId;
      }

      id = R.id.skeleton_container;
      ConstraintLayout skeletonContainer = ViewBindings.findChildViewById(rootView, id);
      if (skeletonContainer == null) {
        break missingId;
      }

      id = R.id.skeleton_excerpt;
      View skeletonExcerpt = ViewBindings.findChildViewById(rootView, id);
      if (skeletonExcerpt == null) {
        break missingId;
      }

      id = R.id.skeleton_layout_buttons;
      LinearLayout skeletonLayoutButtons = ViewBindings.findChildViewById(rootView, id);
      if (skeletonLayoutButtons == null) {
        break missingId;
      }

      id = R.id.skeleton_post_info;
      View skeletonPostInfo = ViewBindings.findChildViewById(rootView, id);
      if (skeletonPostInfo == null) {
        break missingId;
      }

      id = R.id.skeleton_title;
      View skeletonTitle = ViewBindings.findChildViewById(rootView, id);
      if (skeletonTitle == null) {
        break missingId;
      }

      return new PostListItemSkeletonBinding((FrameLayout) rootView,
          skeletonButtonDeletePermanently, skeletonButtonEdit, skeletonButtonMore,
          skeletonButtonMoveToDraft, skeletonButtonView, skeletonContainer, skeletonExcerpt,
          skeletonLayoutButtons, skeletonPostInfo, skeletonTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}