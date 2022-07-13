// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FeatureWipNoticeBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final MaterialButton btnDismiss;

  @NonNull
  public final MaterialButton btnGiveFeedback;

  @NonNull
  public final MaterialTextView featureWipMessage;

  @NonNull
  public final ConstraintLayout featureWipMorePanel;

  @NonNull
  public final ToggleButton featureWipViewMore;

  @NonNull
  public final Guideline guideline7;

  private FeatureWipNoticeBinding(@NonNull View rootView, @NonNull MaterialButton btnDismiss,
      @NonNull MaterialButton btnGiveFeedback, @NonNull MaterialTextView featureWipMessage,
      @NonNull ConstraintLayout featureWipMorePanel, @NonNull ToggleButton featureWipViewMore,
      @NonNull Guideline guideline7) {
    this.rootView = rootView;
    this.btnDismiss = btnDismiss;
    this.btnGiveFeedback = btnGiveFeedback;
    this.featureWipMessage = featureWipMessage;
    this.featureWipMorePanel = featureWipMorePanel;
    this.featureWipViewMore = featureWipViewMore;
    this.guideline7 = guideline7;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static FeatureWipNoticeBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.feature_wip_notice, parent);
    return bind(parent);
  }

  @NonNull
  public static FeatureWipNoticeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_dismiss;
      MaterialButton btnDismiss = ViewBindings.findChildViewById(rootView, id);
      if (btnDismiss == null) {
        break missingId;
      }

      id = R.id.btn_give_feedback;
      MaterialButton btnGiveFeedback = ViewBindings.findChildViewById(rootView, id);
      if (btnGiveFeedback == null) {
        break missingId;
      }

      id = R.id.feature_wip_message;
      MaterialTextView featureWipMessage = ViewBindings.findChildViewById(rootView, id);
      if (featureWipMessage == null) {
        break missingId;
      }

      id = R.id.feature_wip_morePanel;
      ConstraintLayout featureWipMorePanel = ViewBindings.findChildViewById(rootView, id);
      if (featureWipMorePanel == null) {
        break missingId;
      }

      id = R.id.feature_wip_viewMore;
      ToggleButton featureWipViewMore = ViewBindings.findChildViewById(rootView, id);
      if (featureWipViewMore == null) {
        break missingId;
      }

      id = R.id.guideline7;
      Guideline guideline7 = ViewBindings.findChildViewById(rootView, id);
      if (guideline7 == null) {
        break missingId;
      }

      return new FeatureWipNoticeBinding(rootView, btnDismiss, btnGiveFeedback, featureWipMessage,
          featureWipMorePanel, featureWipViewMore, guideline7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}