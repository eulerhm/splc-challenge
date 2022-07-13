// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woocommerce.android.R;
import com.woocommerce.android.ui.mystore.DashboardStatsLineChart;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MyStoreStatsBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final DashboardStatsLineChart chart;

  @NonNull
  public final FrameLayout chartContainer;

  @NonNull
  public final ImageView dashboardStatsError;

  @NonNull
  public final LinearLayout myStoreStatsLinearLayout;

  @NonNull
  public final DashboardMainStatsRowBinding statsViewRow;

  private MyStoreStatsBinding(@NonNull View rootView, @NonNull DashboardStatsLineChart chart,
      @NonNull FrameLayout chartContainer, @NonNull ImageView dashboardStatsError,
      @NonNull LinearLayout myStoreStatsLinearLayout,
      @NonNull DashboardMainStatsRowBinding statsViewRow) {
    this.rootView = rootView;
    this.chart = chart;
    this.chartContainer = chartContainer;
    this.dashboardStatsError = dashboardStatsError;
    this.myStoreStatsLinearLayout = myStoreStatsLinearLayout;
    this.statsViewRow = statsViewRow;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static MyStoreStatsBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.my_store_stats, parent);
    return bind(parent);
  }

  @NonNull
  public static MyStoreStatsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chart;
      DashboardStatsLineChart chart = ViewBindings.findChildViewById(rootView, id);
      if (chart == null) {
        break missingId;
      }

      id = R.id.chart_container;
      FrameLayout chartContainer = ViewBindings.findChildViewById(rootView, id);
      if (chartContainer == null) {
        break missingId;
      }

      id = R.id.dashboard_stats_error;
      ImageView dashboardStatsError = ViewBindings.findChildViewById(rootView, id);
      if (dashboardStatsError == null) {
        break missingId;
      }

      id = R.id.myStoreStats_linearLayout;
      LinearLayout myStoreStatsLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (myStoreStatsLinearLayout == null) {
        break missingId;
      }

      id = R.id.stats_view_row;
      View statsViewRow = ViewBindings.findChildViewById(rootView, id);
      if (statsViewRow == null) {
        break missingId;
      }
      DashboardMainStatsRowBinding binding_statsViewRow = DashboardMainStatsRowBinding.bind(statsViewRow);

      return new MyStoreStatsBinding(rootView, chart, chartContainer, dashboardStatsError,
          myStoreStatsLinearLayout, binding_statsViewRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}