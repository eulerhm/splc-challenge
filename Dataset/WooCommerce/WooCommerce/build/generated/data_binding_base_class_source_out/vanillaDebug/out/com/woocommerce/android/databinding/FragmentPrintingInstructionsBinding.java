// Generated by view binder compiler. Do not edit!
package com.woocommerce.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.woocommerce.android.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPrintingInstructionsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final MaterialTextView printInstructionsLabelInfoStep2;

  @NonNull
  public final MaterialTextView printInstructionsLabelInfoStep3;

  @NonNull
  public final MaterialTextView printInstructionsLabelInfoStep4;

  @NonNull
  public final MaterialTextView printInstructionsLabelInfoStep5;

  @NonNull
  public final MaterialTextView printInstructionsLabelInfoStep6;

  @NonNull
  public final MaterialTextView printInstructionsLabelInfoStep7;

  @NonNull
  public final MaterialButton printInstructionsLabelInfoStepCount2;

  @NonNull
  public final MaterialButton printInstructionsLabelInfoStepCount3;

  @NonNull
  public final MaterialButton printInstructionsLabelInfoStepCount4;

  @NonNull
  public final MaterialButton printInstructionsLabelInfoStepCount5;

  @NonNull
  public final MaterialButton printInstructionsLabelInfoStepCount6;

  @NonNull
  public final MaterialButton printInstructionsLabelInfoStepCount7;

  @NonNull
  public final MaterialTextView printingInstructionsLabelInfoStep1;

  @NonNull
  public final MaterialButton printingInstructionsLabelInfoStepCount1;

  private FragmentPrintingInstructionsBinding(@NonNull ScrollView rootView,
      @NonNull ImageView imageView, @NonNull MaterialTextView printInstructionsLabelInfoStep2,
      @NonNull MaterialTextView printInstructionsLabelInfoStep3,
      @NonNull MaterialTextView printInstructionsLabelInfoStep4,
      @NonNull MaterialTextView printInstructionsLabelInfoStep5,
      @NonNull MaterialTextView printInstructionsLabelInfoStep6,
      @NonNull MaterialTextView printInstructionsLabelInfoStep7,
      @NonNull MaterialButton printInstructionsLabelInfoStepCount2,
      @NonNull MaterialButton printInstructionsLabelInfoStepCount3,
      @NonNull MaterialButton printInstructionsLabelInfoStepCount4,
      @NonNull MaterialButton printInstructionsLabelInfoStepCount5,
      @NonNull MaterialButton printInstructionsLabelInfoStepCount6,
      @NonNull MaterialButton printInstructionsLabelInfoStepCount7,
      @NonNull MaterialTextView printingInstructionsLabelInfoStep1,
      @NonNull MaterialButton printingInstructionsLabelInfoStepCount1) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.printInstructionsLabelInfoStep2 = printInstructionsLabelInfoStep2;
    this.printInstructionsLabelInfoStep3 = printInstructionsLabelInfoStep3;
    this.printInstructionsLabelInfoStep4 = printInstructionsLabelInfoStep4;
    this.printInstructionsLabelInfoStep5 = printInstructionsLabelInfoStep5;
    this.printInstructionsLabelInfoStep6 = printInstructionsLabelInfoStep6;
    this.printInstructionsLabelInfoStep7 = printInstructionsLabelInfoStep7;
    this.printInstructionsLabelInfoStepCount2 = printInstructionsLabelInfoStepCount2;
    this.printInstructionsLabelInfoStepCount3 = printInstructionsLabelInfoStepCount3;
    this.printInstructionsLabelInfoStepCount4 = printInstructionsLabelInfoStepCount4;
    this.printInstructionsLabelInfoStepCount5 = printInstructionsLabelInfoStepCount5;
    this.printInstructionsLabelInfoStepCount6 = printInstructionsLabelInfoStepCount6;
    this.printInstructionsLabelInfoStepCount7 = printInstructionsLabelInfoStepCount7;
    this.printingInstructionsLabelInfoStep1 = printingInstructionsLabelInfoStep1;
    this.printingInstructionsLabelInfoStepCount1 = printingInstructionsLabelInfoStepCount1;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPrintingInstructionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPrintingInstructionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_printing_instructions, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPrintingInstructionsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_step2;
      MaterialTextView printInstructionsLabelInfoStep2 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStep2 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_step3;
      MaterialTextView printInstructionsLabelInfoStep3 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStep3 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_step4;
      MaterialTextView printInstructionsLabelInfoStep4 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStep4 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_step5;
      MaterialTextView printInstructionsLabelInfoStep5 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStep5 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_step6;
      MaterialTextView printInstructionsLabelInfoStep6 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStep6 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_step7;
      MaterialTextView printInstructionsLabelInfoStep7 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStep7 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_stepCount2;
      MaterialButton printInstructionsLabelInfoStepCount2 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStepCount2 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_stepCount3;
      MaterialButton printInstructionsLabelInfoStepCount3 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStepCount3 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_stepCount4;
      MaterialButton printInstructionsLabelInfoStepCount4 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStepCount4 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_stepCount5;
      MaterialButton printInstructionsLabelInfoStepCount5 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStepCount5 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_stepCount6;
      MaterialButton printInstructionsLabelInfoStepCount6 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStepCount6 == null) {
        break missingId;
      }

      id = R.id.printInstructionsLabelInfo_stepCount7;
      MaterialButton printInstructionsLabelInfoStepCount7 = ViewBindings.findChildViewById(rootView, id);
      if (printInstructionsLabelInfoStepCount7 == null) {
        break missingId;
      }

      id = R.id.printingInstructionsLabelInfo_step1;
      MaterialTextView printingInstructionsLabelInfoStep1 = ViewBindings.findChildViewById(rootView, id);
      if (printingInstructionsLabelInfoStep1 == null) {
        break missingId;
      }

      id = R.id.printingInstructionsLabelInfo_stepCount1;
      MaterialButton printingInstructionsLabelInfoStepCount1 = ViewBindings.findChildViewById(rootView, id);
      if (printingInstructionsLabelInfoStepCount1 == null) {
        break missingId;
      }

      return new FragmentPrintingInstructionsBinding((ScrollView) rootView, imageView,
          printInstructionsLabelInfoStep2, printInstructionsLabelInfoStep3,
          printInstructionsLabelInfoStep4, printInstructionsLabelInfoStep5,
          printInstructionsLabelInfoStep6, printInstructionsLabelInfoStep7,
          printInstructionsLabelInfoStepCount2, printInstructionsLabelInfoStepCount3,
          printInstructionsLabelInfoStepCount4, printInstructionsLabelInfoStepCount5,
          printInstructionsLabelInfoStepCount6, printInstructionsLabelInfoStepCount7,
          printingInstructionsLabelInfoStep1, printingInstructionsLabelInfoStepCount1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}