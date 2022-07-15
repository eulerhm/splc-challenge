// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class SiteSettingsTimezoneBottomSheetListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout itemTimeZone;

  @NonNull
  public final TextView timeZone;

  @NonNull
  public final TextView zoneOffset;

  @NonNull
  public final TextView zoneTime;

  private SiteSettingsTimezoneBottomSheetListItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout itemTimeZone, @NonNull TextView timeZone,
      @NonNull TextView zoneOffset, @NonNull TextView zoneTime) {
    this.rootView = rootView;
    this.itemTimeZone = itemTimeZone;
    this.timeZone = timeZone;
    this.zoneOffset = zoneOffset;
    this.zoneTime = zoneTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SiteSettingsTimezoneBottomSheetListItemBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SiteSettingsTimezoneBottomSheetListItemBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.site_settings_timezone_bottom_sheet_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SiteSettingsTimezoneBottomSheetListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout itemTimeZone = (ConstraintLayout) rootView;

      id = R.id.time_zone;
      TextView timeZone = ViewBindings.findChildViewById(rootView, id);
      if (timeZone == null) {
        break missingId;
      }

      id = R.id.zone_offset;
      TextView zoneOffset = ViewBindings.findChildViewById(rootView, id);
      if (zoneOffset == null) {
        break missingId;
      }

      id = R.id.zone_time;
      TextView zoneTime = ViewBindings.findChildViewById(rootView, id);
      if (zoneTime == null) {
        break missingId;
      }

      return new SiteSettingsTimezoneBottomSheetListItemBinding((ConstraintLayout) rootView,
          itemTimeZone, timeZone, zoneOffset, zoneTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}