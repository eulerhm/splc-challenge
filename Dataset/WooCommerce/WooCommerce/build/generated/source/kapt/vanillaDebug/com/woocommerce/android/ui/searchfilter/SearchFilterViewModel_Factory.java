// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.searchfilter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchFilterViewModel_Factory implements Factory<SearchFilterViewModel> {
  @Override
  public SearchFilterViewModel get() {
    return newInstance();
  }

  public static SearchFilterViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SearchFilterViewModel newInstance() {
    return new SearchFilterViewModel();
  }

  private static final class InstanceHolder {
    private static final SearchFilterViewModel_Factory INSTANCE = new SearchFilterViewModel_Factory();
  }
}