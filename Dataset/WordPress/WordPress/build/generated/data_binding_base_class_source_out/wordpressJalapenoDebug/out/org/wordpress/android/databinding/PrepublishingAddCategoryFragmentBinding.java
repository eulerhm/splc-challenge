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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class PrepublishingAddCategoryFragmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AddCategoryBinding addCategory;

  @NonNull
  public final LinearLayout addCategoryContent;

  @NonNull
  public final PrepublishingToolbarBinding prepublishingToolbar;

  private PrepublishingAddCategoryFragmentBinding(@NonNull LinearLayout rootView,
      @NonNull AddCategoryBinding addCategory, @NonNull LinearLayout addCategoryContent,
      @NonNull PrepublishingToolbarBinding prepublishingToolbar) {
    this.rootView = rootView;
    this.addCategory = addCategory;
    this.addCategoryContent = addCategoryContent;
    this.prepublishingToolbar = prepublishingToolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PrepublishingAddCategoryFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PrepublishingAddCategoryFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.prepublishing_add_category_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PrepublishingAddCategoryFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_category;
      View addCategory = ViewBindings.findChildViewById(rootView, id);
      if (addCategory == null) {
        break missingId;
      }
      AddCategoryBinding binding_addCategory = AddCategoryBinding.bind(addCategory);

      LinearLayout addCategoryContent = (LinearLayout) rootView;

      id = R.id.prepublishing_toolbar;
      View prepublishingToolbar = ViewBindings.findChildViewById(rootView, id);
      if (prepublishingToolbar == null) {
        break missingId;
      }
      PrepublishingToolbarBinding binding_prepublishingToolbar = PrepublishingToolbarBinding.bind(prepublishingToolbar);

      return new PrepublishingAddCategoryFragmentBinding((LinearLayout) rootView,
          binding_addCategory, addCategoryContent, binding_prepublishingToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}