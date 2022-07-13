// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardReaderHubListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView cardReaderHubListItemLabelTv;

  @NonNull
  public final AppCompatImageView cardReaderMenuIcon;

  private CardReaderHubListItemBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView cardReaderHubListItemLabelTv,
      @NonNull AppCompatImageView cardReaderMenuIcon) {
    this.rootView = rootView;
    this.cardReaderHubListItemLabelTv = cardReaderHubListItemLabelTv;
    this.cardReaderMenuIcon = cardReaderMenuIcon;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CardReaderHubListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardReaderHubListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_reader_hub_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardReaderHubListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardReaderHubListItemLabelTv;
      MaterialTextView cardReaderHubListItemLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (cardReaderHubListItemLabelTv == null) {
        break missingId;
      }

      id = R.id.cardReaderMenuIcon;
      AppCompatImageView cardReaderMenuIcon = ViewBindings.findChildViewById(rootView, id);
      if (cardReaderMenuIcon == null) {
        break missingId;
      }

      return new CardReaderHubListItemBinding((LinearLayout) rootView, cardReaderHubListItemLabelTv,
          cardReaderMenuIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}