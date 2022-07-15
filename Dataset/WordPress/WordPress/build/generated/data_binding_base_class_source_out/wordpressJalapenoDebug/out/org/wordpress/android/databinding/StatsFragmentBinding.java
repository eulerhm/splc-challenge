// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.util.widgets.CustomSwipeRefreshLayout;

public final class StatsFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final StatsDisabledViewBinding disabledView;

  @NonNull
  public final CustomSwipeRefreshLayout pullToRefresh;

  @NonNull
  public final ViewPager2 statsPager;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final MaterialToolbar toolbar;

  private StatsFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull ConstraintLayout constraintLayout,
      @NonNull CoordinatorLayout coordinatorLayout, @NonNull StatsDisabledViewBinding disabledView,
      @NonNull CustomSwipeRefreshLayout pullToRefresh, @NonNull ViewPager2 statsPager,
      @NonNull TabLayout tabLayout, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.constraintLayout = constraintLayout;
    this.coordinatorLayout = coordinatorLayout;
    this.disabledView = disabledView;
    this.pullToRefresh = pullToRefresh;
    this.statsPager = statsPager;
    this.tabLayout = tabLayout;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_bar_layout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      ConstraintLayout constraintLayout = (ConstraintLayout) rootView;

      id = R.id.coordinatorLayout;
      CoordinatorLayout coordinatorLayout = ViewBindings.findChildViewById(rootView, id);
      if (coordinatorLayout == null) {
        break missingId;
      }

      id = R.id.disabled_view;
      View disabledView = ViewBindings.findChildViewById(rootView, id);
      if (disabledView == null) {
        break missingId;
      }
      StatsDisabledViewBinding binding_disabledView = StatsDisabledViewBinding.bind(disabledView);

      id = R.id.pullToRefresh;
      CustomSwipeRefreshLayout pullToRefresh = ViewBindings.findChildViewById(rootView, id);
      if (pullToRefresh == null) {
        break missingId;
      }

      id = R.id.statsPager;
      ViewPager2 statsPager = ViewBindings.findChildViewById(rootView, id);
      if (statsPager == null) {
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

      return new StatsFragmentBinding((ConstraintLayout) rootView, appBarLayout, constraintLayout,
          coordinatorLayout, binding_disabledView, pullToRefresh, statsPager, tabLayout, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}