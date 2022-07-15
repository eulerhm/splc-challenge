// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class LoginPrologueBottomButtonsContainerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton continueWithWpcomButton;

  @NonNull
  public final MaterialButton enterYourSiteAddressButton;

  private LoginPrologueBottomButtonsContainerBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialButton continueWithWpcomButton,
      @NonNull MaterialButton enterYourSiteAddressButton) {
    this.rootView = rootView;
    this.continueWithWpcomButton = continueWithWpcomButton;
    this.enterYourSiteAddressButton = enterYourSiteAddressButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LoginPrologueBottomButtonsContainerBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoginPrologueBottomButtonsContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.login_prologue_bottom_buttons_container, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoginPrologueBottomButtonsContainerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continue_with_wpcom_button;
      MaterialButton continueWithWpcomButton = ViewBindings.findChildViewById(rootView, id);
      if (continueWithWpcomButton == null) {
        break missingId;
      }

      id = R.id.enter_your_site_address_button;
      MaterialButton enterYourSiteAddressButton = ViewBindings.findChildViewById(rootView, id);
      if (enterYourSiteAddressButton == null) {
        break missingId;
      }

      return new LoginPrologueBottomButtonsContainerBinding((LinearLayout) rootView,
          continueWithWpcomButton, enterYourSiteAddressButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}