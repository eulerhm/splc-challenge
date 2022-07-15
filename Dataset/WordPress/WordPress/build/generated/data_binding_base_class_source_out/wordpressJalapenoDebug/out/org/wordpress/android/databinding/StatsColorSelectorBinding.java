// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StatsColorSelectorBinding implements ViewBinding {
  @NonNull
  private final RadioGroup rootView;

  @NonNull
  public final RadioGroup dataTypes;

  @NonNull
  public final MaterialRadioButton statsWidgetDarkColor;

  @NonNull
  public final MaterialRadioButton statsWidgetLightColor;

  private StatsColorSelectorBinding(@NonNull RadioGroup rootView, @NonNull RadioGroup dataTypes,
      @NonNull MaterialRadioButton statsWidgetDarkColor,
      @NonNull MaterialRadioButton statsWidgetLightColor) {
    this.rootView = rootView;
    this.dataTypes = dataTypes;
    this.statsWidgetDarkColor = statsWidgetDarkColor;
    this.statsWidgetLightColor = statsWidgetLightColor;
  }

  @Override
  @NonNull
  public RadioGroup getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsColorSelectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsColorSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_color_selector, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsColorSelectorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RadioGroup dataTypes = (RadioGroup) rootView;

      id = R.id.stats_widget_dark_color;
      MaterialRadioButton statsWidgetDarkColor = ViewBindings.findChildViewById(rootView, id);
      if (statsWidgetDarkColor == null) {
        break missingId;
      }

      id = R.id.stats_widget_light_color;
      MaterialRadioButton statsWidgetLightColor = ViewBindings.findChildViewById(rootView, id);
      if (statsWidgetLightColor == null) {
        break missingId;
      }

      return new StatsColorSelectorBinding((RadioGroup) rootView, dataTypes, statsWidgetDarkColor,
          statsWidgetLightColor);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}