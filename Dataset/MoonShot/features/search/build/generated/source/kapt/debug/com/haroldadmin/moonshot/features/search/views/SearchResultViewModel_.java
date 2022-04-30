package com.haroldadmin.moonshot.features.search.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.airbnb.epoxy.StringAttributeData;
import com.airbnb.epoxy.WrappedEpoxyModelClickListener;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.util.BitSet;
import org.jetbrains.annotations.Nullable;

/**
 * Generated file. Do not modify! */
public class SearchResultViewModel_ extends EpoxyModel<SearchResultView> implements GeneratedModel<SearchResultView>, SearchResultViewModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(3);

  private OnModelBoundListener<SearchResultViewModel_, SearchResultView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<SearchResultViewModel_, SearchResultView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<SearchResultViewModel_, SearchResultView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<SearchResultViewModel_, SearchResultView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  private StringAttributeData resultType_StringAttributeData =  new StringAttributeData();

  /**
   * Bitset index: 1 */
  private StringAttributeData result_StringAttributeData =  new StringAttributeData();

  @Nullable
  private View.OnClickListener onClick_OnClickListener = (View.OnClickListener) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(1)) {
    	throw new IllegalStateException("A value is required for setResult");
    }
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setResultType");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected SearchResultView buildView(ViewGroup parent) {
    SearchResultView v = new SearchResultView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final SearchResultView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final SearchResultView object) {
    super.bind(object);
    object.setResult(result_StringAttributeData.toString(object.getContext()));
    object.setResultType(resultType_StringAttributeData.toString(object.getContext()));
    object.setOnClick(onClick_OnClickListener);
  }

  @Override
  public void bind(final SearchResultView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof SearchResultViewModel_)) {
      bind(object);
      return;
    }
    SearchResultViewModel_ that = (SearchResultViewModel_) previousModel;
    super.bind(object);

    if ((result_StringAttributeData != null ? !result_StringAttributeData.equals(that.result_StringAttributeData) : that.result_StringAttributeData != null)) {
      object.setResult(result_StringAttributeData.toString(object.getContext()));
    }

    if ((resultType_StringAttributeData != null ? !resultType_StringAttributeData.equals(that.resultType_StringAttributeData) : that.resultType_StringAttributeData != null)) {
      object.setResultType(resultType_StringAttributeData.toString(object.getContext()));
    }

    if (((onClick_OnClickListener == null) != (that.onClick_OnClickListener == null))) {
      object.setOnClick(onClick_OnClickListener);
    }
  }

  @Override
  public void handlePostBind(final SearchResultView object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public SearchResultViewModel_ onBind(
      OnModelBoundListener<SearchResultViewModel_, SearchResultView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(SearchResultView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
    object.setOnClick((View.OnClickListener) null);
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public SearchResultViewModel_ onUnbind(
      OnModelUnboundListener<SearchResultViewModel_, SearchResultView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final SearchResultView object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public SearchResultViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<SearchResultViewModel_, SearchResultView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final SearchResultView object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public SearchResultViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<SearchResultViewModel_, SearchResultView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  public CharSequence getResultType(Context context) {
    return resultType_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see SearchResultView#setResultType(CharSequence)
   */
  public SearchResultViewModel_ resultType(@NonNull CharSequence resultType) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    if (resultType == null) {
      throw new IllegalArgumentException("resultType cannot be null");
    }
    resultType_StringAttributeData.setValue(resultType);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see SearchResultView#setResultType(CharSequence)
   */
  public SearchResultViewModel_ resultType(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    resultType_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see SearchResultView#setResultType(CharSequence)
   */
  public SearchResultViewModel_ resultType(@StringRes int stringRes, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    resultType_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see SearchResultView#setResultType(CharSequence)
   */
  public SearchResultViewModel_ resultTypeQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    resultType_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  public CharSequence getResult(Context context) {
    return result_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see SearchResultView#setResult(CharSequence)
   */
  public SearchResultViewModel_ result(@NonNull CharSequence result) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    if (result == null) {
      throw new IllegalArgumentException("result cannot be null");
    }
    result_StringAttributeData.setValue(result);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see SearchResultView#setResult(CharSequence)
   */
  public SearchResultViewModel_ result(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    result_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see SearchResultView#setResult(CharSequence)
   */
  public SearchResultViewModel_ result(@StringRes int stringRes, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    result_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see SearchResultView#setResult(CharSequence)
   */
  public SearchResultViewModel_ resultQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    result_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  /**
   * Set a click listener that will provide the parent view, model, and adapter position of the clicked view. This will clear the normal View.OnClickListener if one has been set */
  public SearchResultViewModel_ onClick(
      @Nullable final OnModelClickListener<SearchResultViewModel_, SearchResultView> onClick) {
    onMutation();
    if (onClick == null) {
      this.onClick_OnClickListener = null;
    }
    else {
      this.onClick_OnClickListener = new WrappedEpoxyModelClickListener(onClick);
    }
    return this;
  }

  /**
   * <i>Optional</i>: Default value is (View.OnClickListener) null
   *
   * @see SearchResultView#setOnClick(View.OnClickListener)
   */
  public SearchResultViewModel_ onClick(@Nullable View.OnClickListener onClick) {
    onMutation();
    this.onClick_OnClickListener = onClick;
    return this;
  }

  @Nullable
  public View.OnClickListener onClick() {
    return onClick_OnClickListener;
  }

  @Override
  public SearchResultViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public SearchResultViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public SearchResultViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public SearchResultViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public SearchResultViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public SearchResultViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public SearchResultViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public SearchResultViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public SearchResultViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public SearchResultViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public SearchResultViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public SearchResultViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.resultType_StringAttributeData =  new StringAttributeData();
    this.result_StringAttributeData =  new StringAttributeData();
    this.onClick_OnClickListener = (View.OnClickListener) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof SearchResultViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    SearchResultViewModel_ that = (SearchResultViewModel_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((resultType_StringAttributeData != null ? !resultType_StringAttributeData.equals(that.resultType_StringAttributeData) : that.resultType_StringAttributeData != null)) {
      return false;
    }
    if ((result_StringAttributeData != null ? !result_StringAttributeData.equals(that.result_StringAttributeData) : that.result_StringAttributeData != null)) {
      return false;
    }
    if (((onClick_OnClickListener == null) != (that.onClick_OnClickListener == null))) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int _result = super.hashCode();
    _result = 31 * _result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (resultType_StringAttributeData != null ? resultType_StringAttributeData.hashCode() : 0);
    _result = 31 * _result + (result_StringAttributeData != null ? result_StringAttributeData.hashCode() : 0);
    _result = 31 * _result + (onClick_OnClickListener != null ? 1 : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "SearchResultViewModel_{" +
        "resultType_StringAttributeData=" + resultType_StringAttributeData +
        ", result_StringAttributeData=" + result_StringAttributeData +
        ", onClick_OnClickListener=" + onClick_OnClickListener +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
