// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public final class PersonDetailFragmentBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView personAvatar;

  @NonNull
  public final AppBarLayout personDetails;

  @NonNull
  public final WPTextView personDisplayName;

  @NonNull
  public final WPTextView personRole;

  @NonNull
  public final LinearLayout personRoleContainer;

  @NonNull
  public final WPTextView personRoleLabel;

  @NonNull
  public final WPTextView personUsername;

  @NonNull
  public final LinearLayout subscribedDateContainer;

  @NonNull
  public final WPTextView subscribedDateText;

  @NonNull
  public final WPTextView subscribedDateTitle;

  @NonNull
  public final MaterialToolbar toolbarMain;

  private PersonDetailFragmentBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView personAvatar, @NonNull AppBarLayout personDetails,
      @NonNull WPTextView personDisplayName, @NonNull WPTextView personRole,
      @NonNull LinearLayout personRoleContainer, @NonNull WPTextView personRoleLabel,
      @NonNull WPTextView personUsername, @NonNull LinearLayout subscribedDateContainer,
      @NonNull WPTextView subscribedDateText, @NonNull WPTextView subscribedDateTitle,
      @NonNull MaterialToolbar toolbarMain) {
    this.rootView = rootView;
    this.personAvatar = personAvatar;
    this.personDetails = personDetails;
    this.personDisplayName = personDisplayName;
    this.personRole = personRole;
    this.personRoleContainer = personRoleContainer;
    this.personRoleLabel = personRoleLabel;
    this.personUsername = personUsername;
    this.subscribedDateContainer = subscribedDateContainer;
    this.subscribedDateText = subscribedDateText;
    this.subscribedDateTitle = subscribedDateTitle;
    this.toolbarMain = toolbarMain;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PersonDetailFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PersonDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.person_detail_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PersonDetailFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.person_avatar;
      ImageView personAvatar = ViewBindings.findChildViewById(rootView, id);
      if (personAvatar == null) {
        break missingId;
      }

      id = R.id.person_details;
      AppBarLayout personDetails = ViewBindings.findChildViewById(rootView, id);
      if (personDetails == null) {
        break missingId;
      }

      id = R.id.person_display_name;
      WPTextView personDisplayName = ViewBindings.findChildViewById(rootView, id);
      if (personDisplayName == null) {
        break missingId;
      }

      id = R.id.person_role;
      WPTextView personRole = ViewBindings.findChildViewById(rootView, id);
      if (personRole == null) {
        break missingId;
      }

      id = R.id.person_role_container;
      LinearLayout personRoleContainer = ViewBindings.findChildViewById(rootView, id);
      if (personRoleContainer == null) {
        break missingId;
      }

      id = R.id.person_role_label;
      WPTextView personRoleLabel = ViewBindings.findChildViewById(rootView, id);
      if (personRoleLabel == null) {
        break missingId;
      }

      id = R.id.person_username;
      WPTextView personUsername = ViewBindings.findChildViewById(rootView, id);
      if (personUsername == null) {
        break missingId;
      }

      id = R.id.subscribed_date_container;
      LinearLayout subscribedDateContainer = ViewBindings.findChildViewById(rootView, id);
      if (subscribedDateContainer == null) {
        break missingId;
      }

      id = R.id.subscribed_date_text;
      WPTextView subscribedDateText = ViewBindings.findChildViewById(rootView, id);
      if (subscribedDateText == null) {
        break missingId;
      }

      id = R.id.subscribed_date_title;
      WPTextView subscribedDateTitle = ViewBindings.findChildViewById(rootView, id);
      if (subscribedDateTitle == null) {
        break missingId;
      }

      id = R.id.toolbar_main;
      MaterialToolbar toolbarMain = ViewBindings.findChildViewById(rootView, id);
      if (toolbarMain == null) {
        break missingId;
      }

      return new PersonDetailFragmentBinding((RelativeLayout) rootView, personAvatar, personDetails,
          personDisplayName, personRole, personRoleContainer, personRoleLabel, personUsername,
          subscribedDateContainer, subscribedDateText, subscribedDateTitle, toolbarMain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}