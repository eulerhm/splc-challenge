// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.WPTooltipView;
import org.wordpress.android.widgets.AppBarFadingEdgeView;

public final class PostListActivityBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appbarMain;

  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final FloatingActionButton fabButton;

  @NonNull
  public final WPTooltipView fabTooltip;

  @NonNull
  public final AppCompatSpinner postListAuthorSelection;

  @NonNull
  public final AppBarFadingEdgeView postListTabLayoutFadingEdge;

  @NonNull
  public final ViewPager postPager;

  @NonNull
  public final FrameLayout searchContainer;

  @NonNull
  public final RelativeLayout tabContainer;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final MaterialToolbar toolbar;

  private PostListActivityBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appbarMain, @NonNull CoordinatorLayout coordinator,
      @NonNull FloatingActionButton fabButton, @NonNull WPTooltipView fabTooltip,
      @NonNull AppCompatSpinner postListAuthorSelection,
      @NonNull AppBarFadingEdgeView postListTabLayoutFadingEdge, @NonNull ViewPager postPager,
      @NonNull FrameLayout searchContainer, @NonNull RelativeLayout tabContainer,
      @NonNull TabLayout tabLayout, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.appbarMain = appbarMain;
    this.coordinator = coordinator;
    this.fabButton = fabButton;
    this.fabTooltip = fabTooltip;
    this.postListAuthorSelection = postListAuthorSelection;
    this.postListTabLayoutFadingEdge = postListTabLayoutFadingEdge;
    this.postPager = postPager;
    this.searchContainer = searchContainer;
    this.tabContainer = tabContainer;
    this.tabLayout = tabLayout;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PostListActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PostListActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.post_list_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PostListActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar_main;
      AppBarLayout appbarMain = ViewBindings.findChildViewById(rootView, id);
      if (appbarMain == null) {
        break missingId;
      }

      CoordinatorLayout coordinator = (CoordinatorLayout) rootView;

      id = R.id.fab_button;
      FloatingActionButton fabButton = ViewBindings.findChildViewById(rootView, id);
      if (fabButton == null) {
        break missingId;
      }

      id = R.id.fab_tooltip;
      WPTooltipView fabTooltip = ViewBindings.findChildViewById(rootView, id);
      if (fabTooltip == null) {
        break missingId;
      }

      id = R.id.post_list_author_selection;
      AppCompatSpinner postListAuthorSelection = ViewBindings.findChildViewById(rootView, id);
      if (postListAuthorSelection == null) {
        break missingId;
      }

      id = R.id.post_list_tab_layout_fading_edge;
      AppBarFadingEdgeView postListTabLayoutFadingEdge = ViewBindings.findChildViewById(rootView, id);
      if (postListTabLayoutFadingEdge == null) {
        break missingId;
      }

      id = R.id.postPager;
      ViewPager postPager = ViewBindings.findChildViewById(rootView, id);
      if (postPager == null) {
        break missingId;
      }

      id = R.id.search_container;
      FrameLayout searchContainer = ViewBindings.findChildViewById(rootView, id);
      if (searchContainer == null) {
        break missingId;
      }

      id = R.id.tabContainer;
      RelativeLayout tabContainer = ViewBindings.findChildViewById(rootView, id);
      if (tabContainer == null) {
        break missingId;
      }

      id = R.id.tabLayout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new PostListActivityBinding((CoordinatorLayout) rootView, appbarMain, coordinator,
          fabButton, fabTooltip, postListAuthorSelection, postListTabLayoutFadingEdge, postPager,
          searchContainer, tabContainer, tabLayout, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}