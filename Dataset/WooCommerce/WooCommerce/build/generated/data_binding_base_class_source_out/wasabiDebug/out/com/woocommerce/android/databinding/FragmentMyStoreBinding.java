// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import com.woocommerce.android.ui.feedback.FeedbackRequestCard;
import com.woocommerce.android.ui.mystore.MyStoreStatsView;
import com.woocommerce.android.ui.mystore.MyStoreTopPerformersView;
import com.woocommerce.android.widgets.ScrollChildSwipeRefreshLayout;
import com.woocommerce.android.widgets.WCEmptyView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyStoreBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout dashboardStatsRoot;

  @NonNull
  public final WCEmptyView emptyView;

  @NonNull
  public final ViewJetpackBenefitsBottomBannerBinding jetpackBenefitsBanner;

  @NonNull
  public final ScrollChildSwipeRefreshLayout myStoreRefreshLayout;

  @NonNull
  public final MyStoreStatsView myStoreStats;

  @NonNull
  public final MaterialTextView myStoreStatsAvailabilityMessage;

  @NonNull
  public final MaterialTextView myStoreStatsAvailabilityTitle;

  @NonNull
  public final MyStoreTopPerformersView myStoreTopPerformers;

  @NonNull
  public final ImageView statsAvailabilityImage;

  @NonNull
  public final ScrollView statsErrorScrollView;

  @NonNull
  public final NestedScrollView statsScrollView;

  @NonNull
  public final FeedbackRequestCard storeFeedbackRequestCard;

  private FragmentMyStoreBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout dashboardStatsRoot, @NonNull WCEmptyView emptyView,
      @NonNull ViewJetpackBenefitsBottomBannerBinding jetpackBenefitsBanner,
      @NonNull ScrollChildSwipeRefreshLayout myStoreRefreshLayout,
      @NonNull MyStoreStatsView myStoreStats,
      @NonNull MaterialTextView myStoreStatsAvailabilityMessage,
      @NonNull MaterialTextView myStoreStatsAvailabilityTitle,
      @NonNull MyStoreTopPerformersView myStoreTopPerformers,
      @NonNull ImageView statsAvailabilityImage, @NonNull ScrollView statsErrorScrollView,
      @NonNull NestedScrollView statsScrollView,
      @NonNull FeedbackRequestCard storeFeedbackRequestCard) {
    this.rootView = rootView;
    this.dashboardStatsRoot = dashboardStatsRoot;
    this.emptyView = emptyView;
    this.jetpackBenefitsBanner = jetpackBenefitsBanner;
    this.myStoreRefreshLayout = myStoreRefreshLayout;
    this.myStoreStats = myStoreStats;
    this.myStoreStatsAvailabilityMessage = myStoreStatsAvailabilityMessage;
    this.myStoreStatsAvailabilityTitle = myStoreStatsAvailabilityTitle;
    this.myStoreTopPerformers = myStoreTopPerformers;
    this.statsAvailabilityImage = statsAvailabilityImage;
    this.statsErrorScrollView = statsErrorScrollView;
    this.statsScrollView = statsScrollView;
    this.storeFeedbackRequestCard = storeFeedbackRequestCard;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_store, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyStoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout dashboardStatsRoot = (RelativeLayout) rootView;

      id = R.id.empty_view;
      WCEmptyView emptyView = ViewBindings.findChildViewById(rootView, id);
      if (emptyView == null) {
        break missingId;
      }

      id = R.id.jetpack_benefits_banner;
      View jetpackBenefitsBanner = ViewBindings.findChildViewById(rootView, id);
      if (jetpackBenefitsBanner == null) {
        break missingId;
      }
      ViewJetpackBenefitsBottomBannerBinding binding_jetpackBenefitsBanner = ViewJetpackBenefitsBottomBannerBinding.bind(jetpackBenefitsBanner);

      id = R.id.my_store_refresh_layout;
      ScrollChildSwipeRefreshLayout myStoreRefreshLayout = ViewBindings.findChildViewById(rootView, id);
      if (myStoreRefreshLayout == null) {
        break missingId;
      }

      id = R.id.my_store_stats;
      MyStoreStatsView myStoreStats = ViewBindings.findChildViewById(rootView, id);
      if (myStoreStats == null) {
        break missingId;
      }

      id = R.id.my_store_stats_availability_message;
      MaterialTextView myStoreStatsAvailabilityMessage = ViewBindings.findChildViewById(rootView, id);
      if (myStoreStatsAvailabilityMessage == null) {
        break missingId;
      }

      id = R.id.my_store_stats_availability_title;
      MaterialTextView myStoreStatsAvailabilityTitle = ViewBindings.findChildViewById(rootView, id);
      if (myStoreStatsAvailabilityTitle == null) {
        break missingId;
      }

      id = R.id.my_store_top_performers;
      MyStoreTopPerformersView myStoreTopPerformers = ViewBindings.findChildViewById(rootView, id);
      if (myStoreTopPerformers == null) {
        break missingId;
      }

      id = R.id.stats_availability_image;
      ImageView statsAvailabilityImage = ViewBindings.findChildViewById(rootView, id);
      if (statsAvailabilityImage == null) {
        break missingId;
      }

      id = R.id.stats_error_scroll_view;
      ScrollView statsErrorScrollView = ViewBindings.findChildViewById(rootView, id);
      if (statsErrorScrollView == null) {
        break missingId;
      }

      id = R.id.stats_scroll_view;
      NestedScrollView statsScrollView = ViewBindings.findChildViewById(rootView, id);
      if (statsScrollView == null) {
        break missingId;
      }

      id = R.id.store_feedback_request_card;
      FeedbackRequestCard storeFeedbackRequestCard = ViewBindings.findChildViewById(rootView, id);
      if (storeFeedbackRequestCard == null) {
        break missingId;
      }

      return new FragmentMyStoreBinding((RelativeLayout) rootView, dashboardStatsRoot, emptyView,
          binding_jetpackBenefitsBanner, myStoreRefreshLayout, myStoreStats,
          myStoreStatsAvailabilityMessage, myStoreStatsAvailabilityTitle, myStoreTopPerformers,
          statsAvailabilityImage, statsErrorScrollView, statsScrollView, storeFeedbackRequestCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}