package com.haroldadmin.moonshot.features.search.views;

import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.RawRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import org.jetbrains.annotations.Nullable;

/**
 * Generated file. Do not modify! */
public class SearchUninitializedViewModel_ extends EpoxyModel<SearchUninitializedView> implements GeneratedModel<SearchUninitializedView>, SearchUninitializedViewModelBuilder {
  private OnModelBoundListener<SearchUninitializedViewModel_, SearchUninitializedView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<SearchUninitializedViewModel_, SearchUninitializedView> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<SearchUninitializedViewModel_, SearchUninitializedView> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<SearchUninitializedViewModel_, SearchUninitializedView> onModelVisibilityChangedListener_epoxyGeneratedModel;

  @Nullable
  @RawRes
  private Integer animation_Integer = (Integer) null;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  protected SearchUninitializedView buildView(ViewGroup parent) {
    SearchUninitializedView v = new SearchUninitializedView(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final SearchUninitializedView object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final SearchUninitializedView object) {
    super.bind(object);
    object.setAnimation(animation_Integer);
  }

  @Override
  public void bind(final SearchUninitializedView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof SearchUninitializedViewModel_)) {
      bind(object);
      return;
    }
    SearchUninitializedViewModel_ that = (SearchUninitializedViewModel_) previousModel;
    super.bind(object);

    if ((animation_Integer != null ? !animation_Integer.equals(that.animation_Integer) : that.animation_Integer != null)) {
      object.setAnimation(animation_Integer);
    }
  }

  @Override
  public void handlePostBind(final SearchUninitializedView object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
    object.useProps();
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public SearchUninitializedViewModel_ onBind(
      OnModelBoundListener<SearchUninitializedViewModel_, SearchUninitializedView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(SearchUninitializedView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public SearchUninitializedViewModel_ onUnbind(
      OnModelUnboundListener<SearchUninitializedViewModel_, SearchUninitializedView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final SearchUninitializedView object) {
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
  public SearchUninitializedViewModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<SearchUninitializedViewModel_, SearchUninitializedView> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final SearchUninitializedView object) {
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
  public SearchUninitializedViewModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<SearchUninitializedViewModel_, SearchUninitializedView> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Optional</i>: Default value is (Integer) null
   *
   * @see SearchUninitializedView#setAnimation(Integer)
   */
  public SearchUninitializedViewModel_ animation(@Nullable @RawRes Integer animation) {
    onMutation();
    this.animation_Integer = animation;
    return this;
  }

  @Nullable
  @RawRes
  public Integer animation() {
    return animation_Integer;
  }

  @Override
  public SearchUninitializedViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ id(@androidx.annotation.Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ id(@androidx.annotation.Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ id(@androidx.annotation.Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public SearchUninitializedViewModel_ spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public SearchUninitializedViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public SearchUninitializedViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    this.animation_Integer = (Integer) null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof SearchUninitializedViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    SearchUninitializedViewModel_ that = (SearchUninitializedViewModel_) o;
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
    if ((animation_Integer != null ? !animation_Integer.equals(that.animation_Integer) : that.animation_Integer != null)) {
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
    _result = 31 * _result + (animation_Integer != null ? animation_Integer.hashCode() : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "SearchUninitializedViewModel_{" +
        "animation_Integer=" + animation_Integer +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
