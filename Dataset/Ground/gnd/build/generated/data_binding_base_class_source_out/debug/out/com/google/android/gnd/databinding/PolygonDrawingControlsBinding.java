// Generated by data binding compiler. Do not edit!
package com.google.android.gnd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.gnd.R;
import com.google.android.gnd.ui.home.mapcontainer.PolygonDrawingViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PolygonDrawingControlsBinding extends ViewDataBinding {
  @NonNull
  public final Button addPolygonButton;

  @NonNull
  public final Button completePolygonButton;

  @NonNull
  public final FloatingActionButton currentLocationButton;

  @NonNull
  public final FloatingActionButton undoButton;

  @Bindable
  protected PolygonDrawingViewModel mViewModel;

  protected PolygonDrawingControlsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button addPolygonButton, Button completePolygonButton,
      FloatingActionButton currentLocationButton, FloatingActionButton undoButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addPolygonButton = addPolygonButton;
    this.completePolygonButton = completePolygonButton;
    this.currentLocationButton = currentLocationButton;
    this.undoButton = undoButton;
  }

  public abstract void setViewModel(@Nullable PolygonDrawingViewModel viewModel);

  @Nullable
  public PolygonDrawingViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static PolygonDrawingControlsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.polygon_drawing_controls, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PolygonDrawingControlsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PolygonDrawingControlsBinding>inflateInternal(inflater, R.layout.polygon_drawing_controls, root, attachToRoot, component);
  }

  @NonNull
  public static PolygonDrawingControlsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.polygon_drawing_controls, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PolygonDrawingControlsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PolygonDrawingControlsBinding>inflateInternal(inflater, R.layout.polygon_drawing_controls, null, false, component);
  }

  public static PolygonDrawingControlsBinding bind(@NonNull View view) {
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
  public static PolygonDrawingControlsBinding bind(@NonNull View view, @Nullable Object component) {
    return (PolygonDrawingControlsBinding)bind(component, view, R.layout.polygon_drawing_controls);
  }
}