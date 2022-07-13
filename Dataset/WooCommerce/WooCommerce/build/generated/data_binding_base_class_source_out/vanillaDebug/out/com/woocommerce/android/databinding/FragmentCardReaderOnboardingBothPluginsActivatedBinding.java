// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCardReaderOnboardingBothPluginsActivatedBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView hintLabel;

  @NonNull
  public final MaterialTextView hintOrLabel;

  @NonNull
  public final MaterialTextView hintPluginOneLabel;

  @NonNull
  public final MaterialTextView hintPluginTwoLabel;

  @NonNull
  public final AppCompatImageView illustration;

  @NonNull
  public final CardReaderLearnMoreSectionBinding learnMoreContainer;

  @NonNull
  public final MaterialButton openPluginStore;

  @NonNull
  public final MaterialButton refreshAfterUpdating;

  @NonNull
  public final MaterialTextView textHeader;

  @NonNull
  public final MaterialTextView textSupport;

  private FragmentCardReaderOnboardingBothPluginsActivatedBinding(
      @NonNull ConstraintLayout rootView, @NonNull MaterialTextView hintLabel,
      @NonNull MaterialTextView hintOrLabel, @NonNull MaterialTextView hintPluginOneLabel,
      @NonNull MaterialTextView hintPluginTwoLabel, @NonNull AppCompatImageView illustration,
      @NonNull CardReaderLearnMoreSectionBinding learnMoreContainer,
      @NonNull MaterialButton openPluginStore, @NonNull MaterialButton refreshAfterUpdating,
      @NonNull MaterialTextView textHeader, @NonNull MaterialTextView textSupport) {
    this.rootView = rootView;
    this.hintLabel = hintLabel;
    this.hintOrLabel = hintOrLabel;
    this.hintPluginOneLabel = hintPluginOneLabel;
    this.hintPluginTwoLabel = hintPluginTwoLabel;
    this.illustration = illustration;
    this.learnMoreContainer = learnMoreContainer;
    this.openPluginStore = openPluginStore;
    this.refreshAfterUpdating = refreshAfterUpdating;
    this.textHeader = textHeader;
    this.textSupport = textSupport;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCardReaderOnboardingBothPluginsActivatedBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCardReaderOnboardingBothPluginsActivatedBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_card_reader_onboarding_both_plugins_activated, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCardReaderOnboardingBothPluginsActivatedBinding bind(
      @NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.hintLabel;
      MaterialTextView hintLabel = ViewBindings.findChildViewById(rootView, id);
      if (hintLabel == null) {
        break missingId;
      }

      id = R.id.hintOrLabel;
      MaterialTextView hintOrLabel = ViewBindings.findChildViewById(rootView, id);
      if (hintOrLabel == null) {
        break missingId;
      }

      id = R.id.hintPluginOneLabel;
      MaterialTextView hintPluginOneLabel = ViewBindings.findChildViewById(rootView, id);
      if (hintPluginOneLabel == null) {
        break missingId;
      }

      id = R.id.hintPluginTwoLabel;
      MaterialTextView hintPluginTwoLabel = ViewBindings.findChildViewById(rootView, id);
      if (hintPluginTwoLabel == null) {
        break missingId;
      }

      id = R.id.illustration;
      AppCompatImageView illustration = ViewBindings.findChildViewById(rootView, id);
      if (illustration == null) {
        break missingId;
      }

      id = R.id.learn_more_container;
      View learnMoreContainer = ViewBindings.findChildViewById(rootView, id);
      if (learnMoreContainer == null) {
        break missingId;
      }
      CardReaderLearnMoreSectionBinding binding_learnMoreContainer = CardReaderLearnMoreSectionBinding.bind(learnMoreContainer);

      id = R.id.openPluginStore;
      MaterialButton openPluginStore = ViewBindings.findChildViewById(rootView, id);
      if (openPluginStore == null) {
        break missingId;
      }

      id = R.id.refreshAfterUpdating;
      MaterialButton refreshAfterUpdating = ViewBindings.findChildViewById(rootView, id);
      if (refreshAfterUpdating == null) {
        break missingId;
      }

      id = R.id.textHeader;
      MaterialTextView textHeader = ViewBindings.findChildViewById(rootView, id);
      if (textHeader == null) {
        break missingId;
      }

      id = R.id.textSupport;
      MaterialTextView textSupport = ViewBindings.findChildViewById(rootView, id);
      if (textSupport == null) {
        break missingId;
      }

      return new FragmentCardReaderOnboardingBothPluginsActivatedBinding((ConstraintLayout) rootView,
          hintLabel, hintOrLabel, hintPluginOneLabel, hintPluginTwoLabel, illustration,
          binding_learnMoreContainer, openPluginStore, refreshAfterUpdating, textHeader,
          textSupport);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}