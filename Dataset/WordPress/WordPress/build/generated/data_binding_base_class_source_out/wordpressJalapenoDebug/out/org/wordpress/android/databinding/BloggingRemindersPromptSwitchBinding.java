// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class BloggingRemindersPromptSwitchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View bottomDivider;

  @NonNull
  public final SwitchMaterial includePromptSwitch;

  @NonNull
  public final LinearLayout promptHelpButtonContainer;

  @NonNull
  public final MaterialTextView promptSwitchSubtitle;

  @NonNull
  public final MaterialTextView promptSwitchTitle;

  private BloggingRemindersPromptSwitchBinding(@NonNull ConstraintLayout rootView,
      @NonNull View bottomDivider, @NonNull SwitchMaterial includePromptSwitch,
      @NonNull LinearLayout promptHelpButtonContainer,
      @NonNull MaterialTextView promptSwitchSubtitle, @NonNull MaterialTextView promptSwitchTitle) {
    this.rootView = rootView;
    this.bottomDivider = bottomDivider;
    this.includePromptSwitch = includePromptSwitch;
    this.promptHelpButtonContainer = promptHelpButtonContainer;
    this.promptSwitchSubtitle = promptSwitchSubtitle;
    this.promptSwitchTitle = promptSwitchTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BloggingRemindersPromptSwitchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BloggingRemindersPromptSwitchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.blogging_reminders_prompt_switch, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BloggingRemindersPromptSwitchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_divider;
      View bottomDivider = ViewBindings.findChildViewById(rootView, id);
      if (bottomDivider == null) {
        break missingId;
      }

      id = R.id.include_prompt_switch;
      SwitchMaterial includePromptSwitch = ViewBindings.findChildViewById(rootView, id);
      if (includePromptSwitch == null) {
        break missingId;
      }

      id = R.id.prompt_help_button_container;
      LinearLayout promptHelpButtonContainer = ViewBindings.findChildViewById(rootView, id);
      if (promptHelpButtonContainer == null) {
        break missingId;
      }

      id = R.id.prompt_switch_subtitle;
      MaterialTextView promptSwitchSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (promptSwitchSubtitle == null) {
        break missingId;
      }

      id = R.id.prompt_switch_title;
      MaterialTextView promptSwitchTitle = ViewBindings.findChildViewById(rootView, id);
      if (promptSwitchTitle == null) {
        break missingId;
      }

      return new BloggingRemindersPromptSwitchBinding((ConstraintLayout) rootView, bottomDivider,
          includePromptSwitch, promptHelpButtonContainer, promptSwitchSubtitle, promptSwitchTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}