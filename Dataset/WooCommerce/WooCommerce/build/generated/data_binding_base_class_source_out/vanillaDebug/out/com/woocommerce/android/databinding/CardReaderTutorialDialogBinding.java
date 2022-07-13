// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.woocommerce.android.R;
import com.woocommerce.android.widgets.WCViewPagerIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardReaderTutorialDialogBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final MaterialButton buttonSkip;

  @NonNull
  public final ViewPager2 viewPager;

  @NonNull
  public final WCViewPagerIndicator viewPagerIndicator;

  private CardReaderTutorialDialogBinding(@NonNull FrameLayout rootView,
      @NonNull MaterialButton buttonSkip, @NonNull ViewPager2 viewPager,
      @NonNull WCViewPagerIndicator viewPagerIndicator) {
    this.rootView = rootView;
    this.buttonSkip = buttonSkip;
    this.viewPager = viewPager;
    this.viewPagerIndicator = viewPagerIndicator;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CardReaderTutorialDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardReaderTutorialDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_reader_tutorial_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardReaderTutorialDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSkip;
      MaterialButton buttonSkip = ViewBindings.findChildViewById(rootView, id);
      if (buttonSkip == null) {
        break missingId;
      }

      id = R.id.viewPager;
      ViewPager2 viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      id = R.id.viewPagerIndicator;
      WCViewPagerIndicator viewPagerIndicator = ViewBindings.findChildViewById(rootView, id);
      if (viewPagerIndicator == null) {
        break missingId;
      }

      return new CardReaderTutorialDialogBinding((FrameLayout) rootView, buttonSkip, viewPager,
          viewPagerIndicator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}