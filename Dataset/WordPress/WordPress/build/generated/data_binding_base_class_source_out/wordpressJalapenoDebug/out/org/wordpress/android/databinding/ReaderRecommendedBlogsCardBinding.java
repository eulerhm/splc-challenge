// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class ReaderRecommendedBlogsCardBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final RecyclerView recommendedBlogs;

  @NonNull
  public final MaterialTextView recommendedBlogsHeader;

  @NonNull
  public final ConstraintLayout rootLayout;

  private ReaderRecommendedBlogsCardBinding(@NonNull MaterialCardView rootView,
      @NonNull RecyclerView recommendedBlogs, @NonNull MaterialTextView recommendedBlogsHeader,
      @NonNull ConstraintLayout rootLayout) {
    this.rootView = rootView;
    this.recommendedBlogs = recommendedBlogs;
    this.recommendedBlogsHeader = recommendedBlogsHeader;
    this.rootLayout = rootLayout;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ReaderRecommendedBlogsCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReaderRecommendedBlogsCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reader_recommended_blogs_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReaderRecommendedBlogsCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recommended_blogs;
      RecyclerView recommendedBlogs = ViewBindings.findChildViewById(rootView, id);
      if (recommendedBlogs == null) {
        break missingId;
      }

      id = R.id.recommended_blogs_header;
      MaterialTextView recommendedBlogsHeader = ViewBindings.findChildViewById(rootView, id);
      if (recommendedBlogsHeader == null) {
        break missingId;
      }

      id = R.id.root_layout;
      ConstraintLayout rootLayout = ViewBindings.findChildViewById(rootView, id);
      if (rootLayout == null) {
        break missingId;
      }

      return new ReaderRecommendedBlogsCardBinding((MaterialCardView) rootView, recommendedBlogs,
          recommendedBlogsHeader, rootLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}