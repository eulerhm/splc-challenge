// Generated by view binder compiler. Do not edit!
package org.wordpress.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class LoginPrologueFourthBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView cardOne;

  @NonNull
  public final MaterialCardView cardTwo;

  @NonNull
  public final MaterialButton fabOne;

  @NonNull
  public final MaterialButton fabThree;

  @NonNull
  public final MaterialButton fabTwo;

  private LoginPrologueFourthBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView cardOne, @NonNull MaterialCardView cardTwo,
      @NonNull MaterialButton fabOne, @NonNull MaterialButton fabThree,
      @NonNull MaterialButton fabTwo) {
    this.rootView = rootView;
    this.cardOne = cardOne;
    this.cardTwo = cardTwo;
    this.fabOne = fabOne;
    this.fabThree = fabThree;
    this.fabTwo = fabTwo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LoginPrologueFourthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoginPrologueFourthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.login_prologue_fourth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoginPrologueFourthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_one;
      MaterialCardView cardOne = ViewBindings.findChildViewById(rootView, id);
      if (cardOne == null) {
        break missingId;
      }

      id = R.id.card_two;
      MaterialCardView cardTwo = ViewBindings.findChildViewById(rootView, id);
      if (cardTwo == null) {
        break missingId;
      }

      id = R.id.fab_one;
      MaterialButton fabOne = ViewBindings.findChildViewById(rootView, id);
      if (fabOne == null) {
        break missingId;
      }

      id = R.id.fab_three;
      MaterialButton fabThree = ViewBindings.findChildViewById(rootView, id);
      if (fabThree == null) {
        break missingId;
      }

      id = R.id.fab_two;
      MaterialButton fabTwo = ViewBindings.findChildViewById(rootView, id);
      if (fabTwo == null) {
        break missingId;
      }

      return new LoginPrologueFourthBinding((ConstraintLayout) rootView, cardOne, cardTwo, fabOne,
          fabThree, fabTwo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}