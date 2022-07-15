// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class PrepublishingPublishedSettingsFragmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView postAddToCalendar;

  @NonNull
  public final LinearLayout postAddToCalendarContainer;

  @NonNull
  public final TextView publishNotification;

  @NonNull
  public final LinearLayout publishNotificationContainer;

  @NonNull
  public final TextView publishNotificationTitle;

  @NonNull
  public final TextView publishTimeAndDate;

  @NonNull
  public final LinearLayout publishTimeAndDateContainer;

  private PrepublishingPublishedSettingsFragmentBinding(@NonNull LinearLayout rootView,
      @NonNull TextView postAddToCalendar, @NonNull LinearLayout postAddToCalendarContainer,
      @NonNull TextView publishNotification, @NonNull LinearLayout publishNotificationContainer,
      @NonNull TextView publishNotificationTitle, @NonNull TextView publishTimeAndDate,
      @NonNull LinearLayout publishTimeAndDateContainer) {
    this.rootView = rootView;
    this.postAddToCalendar = postAddToCalendar;
    this.postAddToCalendarContainer = postAddToCalendarContainer;
    this.publishNotification = publishNotification;
    this.publishNotificationContainer = publishNotificationContainer;
    this.publishNotificationTitle = publishNotificationTitle;
    this.publishTimeAndDate = publishTimeAndDate;
    this.publishTimeAndDateContainer = publishTimeAndDateContainer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PrepublishingPublishedSettingsFragmentBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PrepublishingPublishedSettingsFragmentBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.prepublishing_published_settings_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PrepublishingPublishedSettingsFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.post_add_to_calendar;
      TextView postAddToCalendar = ViewBindings.findChildViewById(rootView, id);
      if (postAddToCalendar == null) {
        break missingId;
      }

      id = R.id.post_add_to_calendar_container;
      LinearLayout postAddToCalendarContainer = ViewBindings.findChildViewById(rootView, id);
      if (postAddToCalendarContainer == null) {
        break missingId;
      }

      id = R.id.publish_notification;
      TextView publishNotification = ViewBindings.findChildViewById(rootView, id);
      if (publishNotification == null) {
        break missingId;
      }

      id = R.id.publish_notification_container;
      LinearLayout publishNotificationContainer = ViewBindings.findChildViewById(rootView, id);
      if (publishNotificationContainer == null) {
        break missingId;
      }

      id = R.id.publish_notification_title;
      TextView publishNotificationTitle = ViewBindings.findChildViewById(rootView, id);
      if (publishNotificationTitle == null) {
        break missingId;
      }

      id = R.id.publish_time_and_date;
      TextView publishTimeAndDate = ViewBindings.findChildViewById(rootView, id);
      if (publishTimeAndDate == null) {
        break missingId;
      }

      id = R.id.publish_time_and_date_container;
      LinearLayout publishTimeAndDateContainer = ViewBindings.findChildViewById(rootView, id);
      if (publishTimeAndDateContainer == null) {
        break missingId;
      }

      return new PrepublishingPublishedSettingsFragmentBinding((LinearLayout) rootView,
          postAddToCalendar, postAddToCalendarContainer, publishNotification,
          publishNotificationContainer, publishNotificationTitle, publishTimeAndDate,
          publishTimeAndDateContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}