package com.haroldadmin.moonshot.features.search.views;

import androidx.annotation.RawRes;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Number;
import org.jetbrains.annotations.Nullable;

public interface SearchUninitializedViewModelBuilder {
  SearchUninitializedViewModelBuilder onBind(
      OnModelBoundListener<SearchUninitializedViewModel_, SearchUninitializedView> listener);

  SearchUninitializedViewModelBuilder onUnbind(
      OnModelUnboundListener<SearchUninitializedViewModel_, SearchUninitializedView> listener);

  SearchUninitializedViewModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<SearchUninitializedViewModel_, SearchUninitializedView> listener);

  SearchUninitializedViewModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<SearchUninitializedViewModel_, SearchUninitializedView> listener);

  SearchUninitializedViewModelBuilder animation(@Nullable @RawRes Integer animation);

  SearchUninitializedViewModelBuilder id(long id);

  SearchUninitializedViewModelBuilder id(@androidx.annotation.Nullable Number... ids);

  SearchUninitializedViewModelBuilder id(long id1, long id2);

  SearchUninitializedViewModelBuilder id(@androidx.annotation.Nullable CharSequence key);

  SearchUninitializedViewModelBuilder id(@androidx.annotation.Nullable CharSequence key,
      @androidx.annotation.Nullable CharSequence... otherKeys);

  SearchUninitializedViewModelBuilder id(@androidx.annotation.Nullable CharSequence key, long id);

  SearchUninitializedViewModelBuilder spanSizeOverride(
      @androidx.annotation.Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
