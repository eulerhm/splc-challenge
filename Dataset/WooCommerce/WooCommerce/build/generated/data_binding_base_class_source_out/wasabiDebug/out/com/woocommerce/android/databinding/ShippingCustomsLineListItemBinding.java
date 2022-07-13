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
import com.woocommerce.android.widgets.WCMaterialOutlinedEditTextView;
import com.woocommerce.android.widgets.WCMaterialOutlinedSpinnerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ShippingCustomsLineListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatImageView contentIcon;

  @NonNull
  public final MaterialTextView countryDescription;

  @NonNull
  public final WCMaterialOutlinedSpinnerView countrySpinner;

  @NonNull
  public final LinearLayout detailsLayout;

  @NonNull
  public final AppCompatImageView errorView;

  @NonNull
  public final AppCompatImageView expandIcon;

  @NonNull
  public final WCMaterialOutlinedEditTextView hsTariffNumberEditText;

  @NonNull
  public final MaterialTextView hsTariffNumberInfos;

  @NonNull
  public final WCMaterialOutlinedEditTextView itemDescriptionEditText;

  @NonNull
  public final MaterialTextView lineTitle;

  @NonNull
  public final LinearLayout titleLayout;

  @NonNull
  public final WCMaterialOutlinedEditTextView valueEditText;

  @NonNull
  public final WCMaterialOutlinedEditTextView weightEditText;

  private ShippingCustomsLineListItemBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatImageView contentIcon, @NonNull MaterialTextView countryDescription,
      @NonNull WCMaterialOutlinedSpinnerView countrySpinner, @NonNull LinearLayout detailsLayout,
      @NonNull AppCompatImageView errorView, @NonNull AppCompatImageView expandIcon,
      @NonNull WCMaterialOutlinedEditTextView hsTariffNumberEditText,
      @NonNull MaterialTextView hsTariffNumberInfos,
      @NonNull WCMaterialOutlinedEditTextView itemDescriptionEditText,
      @NonNull MaterialTextView lineTitle, @NonNull LinearLayout titleLayout,
      @NonNull WCMaterialOutlinedEditTextView valueEditText,
      @NonNull WCMaterialOutlinedEditTextView weightEditText) {
    this.rootView = rootView;
    this.contentIcon = contentIcon;
    this.countryDescription = countryDescription;
    this.countrySpinner = countrySpinner;
    this.detailsLayout = detailsLayout;
    this.errorView = errorView;
    this.expandIcon = expandIcon;
    this.hsTariffNumberEditText = hsTariffNumberEditText;
    this.hsTariffNumberInfos = hsTariffNumberInfos;
    this.itemDescriptionEditText = itemDescriptionEditText;
    this.lineTitle = lineTitle;
    this.titleLayout = titleLayout;
    this.valueEditText = valueEditText;
    this.weightEditText = weightEditText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ShippingCustomsLineListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShippingCustomsLineListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.shipping_customs_line_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShippingCustomsLineListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content_icon;
      AppCompatImageView contentIcon = ViewBindings.findChildViewById(rootView, id);
      if (contentIcon == null) {
        break missingId;
      }

      id = R.id.country_description;
      MaterialTextView countryDescription = ViewBindings.findChildViewById(rootView, id);
      if (countryDescription == null) {
        break missingId;
      }

      id = R.id.country_spinner;
      WCMaterialOutlinedSpinnerView countrySpinner = ViewBindings.findChildViewById(rootView, id);
      if (countrySpinner == null) {
        break missingId;
      }

      id = R.id.details_layout;
      LinearLayout detailsLayout = ViewBindings.findChildViewById(rootView, id);
      if (detailsLayout == null) {
        break missingId;
      }

      id = R.id.error_view;
      AppCompatImageView errorView = ViewBindings.findChildViewById(rootView, id);
      if (errorView == null) {
        break missingId;
      }

      id = R.id.expand_icon;
      AppCompatImageView expandIcon = ViewBindings.findChildViewById(rootView, id);
      if (expandIcon == null) {
        break missingId;
      }

      id = R.id.hs_tariff_number_edit_text;
      WCMaterialOutlinedEditTextView hsTariffNumberEditText = ViewBindings.findChildViewById(rootView, id);
      if (hsTariffNumberEditText == null) {
        break missingId;
      }

      id = R.id.hs_tariff_number_infos;
      MaterialTextView hsTariffNumberInfos = ViewBindings.findChildViewById(rootView, id);
      if (hsTariffNumberInfos == null) {
        break missingId;
      }

      id = R.id.item_description_edit_text;
      WCMaterialOutlinedEditTextView itemDescriptionEditText = ViewBindings.findChildViewById(rootView, id);
      if (itemDescriptionEditText == null) {
        break missingId;
      }

      id = R.id.line_title;
      MaterialTextView lineTitle = ViewBindings.findChildViewById(rootView, id);
      if (lineTitle == null) {
        break missingId;
      }

      id = R.id.title_layout;
      LinearLayout titleLayout = ViewBindings.findChildViewById(rootView, id);
      if (titleLayout == null) {
        break missingId;
      }

      id = R.id.value_edit_text;
      WCMaterialOutlinedEditTextView valueEditText = ViewBindings.findChildViewById(rootView, id);
      if (valueEditText == null) {
        break missingId;
      }

      id = R.id.weight_edit_text;
      WCMaterialOutlinedEditTextView weightEditText = ViewBindings.findChildViewById(rootView, id);
      if (weightEditText == null) {
        break missingId;
      }

      return new ShippingCustomsLineListItemBinding((LinearLayout) rootView, contentIcon,
          countryDescription, countrySpinner, detailsLayout, errorView, expandIcon,
          hsTariffNumberEditText, hsTariffNumberInfos, itemDescriptionEditText, lineTitle,
          titleLayout, valueEditText, weightEditText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}