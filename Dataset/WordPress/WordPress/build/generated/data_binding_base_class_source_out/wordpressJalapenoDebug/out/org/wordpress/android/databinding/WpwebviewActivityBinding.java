// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.ui.ActionableEmptyView;
import org.wordpress.android.widgets.NestedWebView;

public final class WpwebviewActivityBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ActionableEmptyView actionableEmptyView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final TextView desktopPreviewHint;

  @NonNull
  public final View divider;

  @NonNull
  public final ImageButton externalBrowserButton;

  @NonNull
  public final ImageButton forwardButton;

  @NonNull
  public final LinearLayout navbar;

  @NonNull
  public final LinearLayout navbarContainer;

  @NonNull
  public final RelativeLayout previewContainer;

  @NonNull
  public final ImageButton previewTypeSelectorButton;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ProgressLayoutBinding progressLayout;

  @NonNull
  public final ImageButton shareButton;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final NestedWebView webView;

  @NonNull
  public final CoordinatorLayout webviewWrapper;

  private WpwebviewActivityBinding(@NonNull RelativeLayout rootView,
      @NonNull ActionableEmptyView actionableEmptyView, @NonNull AppBarLayout appbar,
      @NonNull ImageButton backButton, @NonNull TextView desktopPreviewHint, @NonNull View divider,
      @NonNull ImageButton externalBrowserButton, @NonNull ImageButton forwardButton,
      @NonNull LinearLayout navbar, @NonNull LinearLayout navbarContainer,
      @NonNull RelativeLayout previewContainer, @NonNull ImageButton previewTypeSelectorButton,
      @NonNull ProgressBar progressBar, @NonNull ProgressLayoutBinding progressLayout,
      @NonNull ImageButton shareButton, @NonNull MaterialToolbar toolbar,
      @NonNull NestedWebView webView, @NonNull CoordinatorLayout webviewWrapper) {
    this.rootView = rootView;
    this.actionableEmptyView = actionableEmptyView;
    this.appbar = appbar;
    this.backButton = backButton;
    this.desktopPreviewHint = desktopPreviewHint;
    this.divider = divider;
    this.externalBrowserButton = externalBrowserButton;
    this.forwardButton = forwardButton;
    this.navbar = navbar;
    this.navbarContainer = navbarContainer;
    this.previewContainer = previewContainer;
    this.previewTypeSelectorButton = previewTypeSelectorButton;
    this.progressBar = progressBar;
    this.progressLayout = progressLayout;
    this.shareButton = shareButton;
    this.toolbar = toolbar;
    this.webView = webView;
    this.webviewWrapper = webviewWrapper;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WpwebviewActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WpwebviewActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.wpwebview_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WpwebviewActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionable_empty_view;
      ActionableEmptyView actionableEmptyView = ViewBindings.findChildViewById(rootView, id);
      if (actionableEmptyView == null) {
        break missingId;
      }

      id = R.id.appbar;
      AppBarLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.back_button;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.desktop_preview_hint;
      TextView desktopPreviewHint = ViewBindings.findChildViewById(rootView, id);
      if (desktopPreviewHint == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.external_browser_button;
      ImageButton externalBrowserButton = ViewBindings.findChildViewById(rootView, id);
      if (externalBrowserButton == null) {
        break missingId;
      }

      id = R.id.forward_button;
      ImageButton forwardButton = ViewBindings.findChildViewById(rootView, id);
      if (forwardButton == null) {
        break missingId;
      }

      id = R.id.navbar;
      LinearLayout navbar = ViewBindings.findChildViewById(rootView, id);
      if (navbar == null) {
        break missingId;
      }

      id = R.id.navbar_container;
      LinearLayout navbarContainer = ViewBindings.findChildViewById(rootView, id);
      if (navbarContainer == null) {
        break missingId;
      }

      id = R.id.preview_container;
      RelativeLayout previewContainer = ViewBindings.findChildViewById(rootView, id);
      if (previewContainer == null) {
        break missingId;
      }

      id = R.id.preview_type_selector_button;
      ImageButton previewTypeSelectorButton = ViewBindings.findChildViewById(rootView, id);
      if (previewTypeSelectorButton == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.progress_layout;
      View progressLayout = ViewBindings.findChildViewById(rootView, id);
      if (progressLayout == null) {
        break missingId;
      }
      ProgressLayoutBinding binding_progressLayout = ProgressLayoutBinding.bind(progressLayout);

      id = R.id.share_button;
      ImageButton shareButton = ViewBindings.findChildViewById(rootView, id);
      if (shareButton == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.webView;
      NestedWebView webView = ViewBindings.findChildViewById(rootView, id);
      if (webView == null) {
        break missingId;
      }

      id = R.id.webview_wrapper;
      CoordinatorLayout webviewWrapper = ViewBindings.findChildViewById(rootView, id);
      if (webviewWrapper == null) {
        break missingId;
      }

      return new WpwebviewActivityBinding((RelativeLayout) rootView, actionableEmptyView, appbar,
          backButton, desktopPreviewHint, divider, externalBrowserButton, forwardButton, navbar,
          navbarContainer, previewContainer, previewTypeSelectorButton, progressBar,
          binding_progressLayout, shareButton, toolbar, webView, webviewWrapper);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}