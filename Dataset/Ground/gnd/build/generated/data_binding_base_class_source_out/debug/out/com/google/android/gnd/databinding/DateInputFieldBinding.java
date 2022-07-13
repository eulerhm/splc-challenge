// Generated by data binding compiler. Do not edit!
package com.google.android.gnd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.gnd.R;
import com.google.android.gnd.ui.editsubmission.DateFieldViewModel;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DateInputFieldBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText textInputEditText;

  @NonNull
  public final TextInputLayout textInputLayout;

  @Bindable
  protected DateFieldViewModel mViewModel;

  protected DateInputFieldBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textInputEditText = textInputEditText;
    this.textInputLayout = textInputLayout;
  }

  public abstract void setViewModel(@Nullable DateFieldViewModel viewModel);

  @Nullable
  public DateFieldViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DateInputFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.date_input_field, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DateInputFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DateInputFieldBinding>inflateInternal(inflater, R.layout.date_input_field, root, attachToRoot, component);
  }

  @NonNull
  public static DateInputFieldBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.date_input_field, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DateInputFieldBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DateInputFieldBinding>inflateInternal(inflater, R.layout.date_input_field, null, false, component);
  }

  public static DateInputFieldBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DateInputFieldBinding bind(@NonNull View view, @Nullable Object component) {
    return (DateInputFieldBinding)bind(component, view, R.layout.date_input_field);
  }
}