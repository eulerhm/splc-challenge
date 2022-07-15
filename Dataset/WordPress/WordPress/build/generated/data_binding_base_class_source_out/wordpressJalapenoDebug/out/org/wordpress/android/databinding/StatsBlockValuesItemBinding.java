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
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.wordpress.android.R;

public final class StatsBlockValuesItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView unit1;

  @NonNull
  public final MaterialTextView unit2;

  @NonNull
  public final MaterialTextView value1;

  @NonNull
  public final MaterialTextView value2;

  @NonNull
  public final ConstraintLayout valuesContainer1;

  @NonNull
  public final ConstraintLayout valuesContainer2;

  private StatsBlockValuesItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialTextView unit1, @NonNull MaterialTextView unit2,
      @NonNull MaterialTextView value1, @NonNull MaterialTextView value2,
      @NonNull ConstraintLayout valuesContainer1, @NonNull ConstraintLayout valuesContainer2) {
    this.rootView = rootView;
    this.unit1 = unit1;
    this.unit2 = unit2;
    this.value1 = value1;
    this.value2 = value2;
    this.valuesContainer1 = valuesContainer1;
    this.valuesContainer2 = valuesContainer2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatsBlockValuesItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatsBlockValuesItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.stats_block_values_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatsBlockValuesItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.unit1;
      MaterialTextView unit1 = ViewBindings.findChildViewById(rootView, id);
      if (unit1 == null) {
        break missingId;
      }

      id = R.id.unit2;
      MaterialTextView unit2 = ViewBindings.findChildViewById(rootView, id);
      if (unit2 == null) {
        break missingId;
      }

      id = R.id.value1;
      MaterialTextView value1 = ViewBindings.findChildViewById(rootView, id);
      if (value1 == null) {
        break missingId;
      }

      id = R.id.value2;
      MaterialTextView value2 = ViewBindings.findChildViewById(rootView, id);
      if (value2 == null) {
        break missingId;
      }

      id = R.id.values_container1;
      ConstraintLayout valuesContainer1 = ViewBindings.findChildViewById(rootView, id);
      if (valuesContainer1 == null) {
        break missingId;
      }

      id = R.id.values_container2;
      ConstraintLayout valuesContainer2 = ViewBindings.findChildViewById(rootView, id);
      if (valuesContainer2 == null) {
        break missingId;
      }

      return new StatsBlockValuesItemBinding((ConstraintLayout) rootView, unit1, unit2, value1,
          value2, valuesContainer1, valuesContainer2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}