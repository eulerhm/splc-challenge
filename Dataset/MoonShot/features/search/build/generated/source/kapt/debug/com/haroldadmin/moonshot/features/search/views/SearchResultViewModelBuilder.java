package com.haroldadmin.moonshot.features.search.views;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelClickListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;
import org.jetbrains.annotations.Nullable;

public interface SearchResultViewModelBuilder {
  SearchResultViewModelBuilder onBind(
      OnModelBoundListener<SearchResultViewModel_, SearchResultView> listener);

  SearchResultViewModelBuilder onUnbind(
      OnModelUnboundListener<SearchResultViewModel_, SearchResultView> listener);

  SearchResultViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<SearchResultViewModel_, SearchResultView> listener);

  SearchResultViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<SearchResultViewModel_, SearchResultView> listener);

  SearchResultViewModelBuilder resultType(@NonNull CharSequence resultType);

  SearchResultViewModelBuilder resultType(@StringRes int stringRes);

  SearchResultViewModelBuilder resultType(@StringRes int stringRes, Object... formatArgs);

  SearchResultViewModelBuilder resultTypeQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  SearchResultViewModelBuilder result(@NonNull CharSequence result);

  SearchResultViewModelBuilder result(@StringRes int stringRes);

  SearchResultViewModelBuilder result(@StringRes int stringRes, Object... formatArgs);

  SearchResultViewModelBuilder resultQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  SearchResultViewModelBuilder onClick(
      @Nullable final OnModelClickListener<SearchResultViewModel_, SearchResultView> onClick);

  SearchResultViewModelBuilder onClick(@Nullable View.OnClickListener onClick);

  SearchResultViewModelBuilder id(long id);

  SearchResultViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  SearchResultViewModelBuilder id(long id1, long id2);

  SearchResultViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  SearchResultViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  SearchResultViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  SearchResultViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
